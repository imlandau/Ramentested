package com.example.maste.ramen;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contacts.db";
    private static final String TABLE_NAME = "contacts";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_USERNAME = "UserName";
    private static final String COLUMN_USERPASS = "UserPass";
    SQLiteDatabase db;
    private static final String TABLE_CREATE = "create table contacts (id integer primary key not null auto_increment , " +
            " name text not null , email text not null , UserName text not null , UserPass text not null);" ;


    public DatabaseHelper(Context context)
    {
        super(context , DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;

    }

    public void InsertContact(Contact c)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from contacts ";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(COLUMN_ID , count);
        values.put(COLUMN_USERNAME , c.getUserName());
        values.put(COLUMN_USERPASS , c.getUserPass());

        db.insert(TABLE_NAME , null , values);
        db.close();

    }

    public String searchPass(String UserPass)
    {

        db = this.getReadableDatabase();
        String query = "select UserName, UserPass from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query , null);
        String a, b;
        b = "not found";
        if (cursor.moveToFirst())
        {
            do{
                a = cursor.getString(0);


                if (a.equals(UserPass))
                {
                    b = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }

        return b;

    }

    public String searchUser(String UserName)
    {

        db = this.getReadableDatabase();
        String query = "select UserName, UserPass from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query , null);
        String a, b;
        b = "not found";
        if (cursor.moveToFirst())
        {
            do{
                a = cursor.getString(0);


                if (a.equals(UserName))
                {
                    b = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }

        return b;

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " +TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
}
