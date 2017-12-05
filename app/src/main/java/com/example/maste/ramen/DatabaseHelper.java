package com.example.maste.ramen;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static class FeedEntry implements BaseColumns {

        private static final String TABLE_NAME = "contacts";
        private static final String COLUMN_ID = "Id";
        private static final String COLUMN_USERNAME = "UserName";
        private static final String COLUMN_USERPASS = "UserPass";
    }
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contacts.db";
    SQLiteDatabase db;

    private static final String SQL_CREATE_ENTRIES =
                    "CREATE TABLE" + FeedEntry.TABLE_NAME + " ("+
                    FeedEntry.COLUMN_ID + "INTERGER PRIMARY KEY," +
                    FeedEntry.COLUMN_USERNAME + "TEXT," +
                    FeedEntry.COLUMN_USERPASS + "TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS" + FeedEntry.TABLE_NAME;


    public DatabaseHelper(Context context)
    {
        super(context , DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }


    public void InsertContacts(Contact contact){
        db=getWritableDatabase();
        //To get , how many column in ur table
        String query="SELECT * FROM "+FeedEntry.TABLE_NAME;
        Cursor cursor=db.rawQuery(query,null);
        int count=cursor.getCount();

        ContentValues contentvalues=new ContentValues();
        contentvalues.put(FeedEntry.COLUMN_ID,count+1);
        contentvalues.put(FeedEntry.COLUMN_USERNAME, contact.getUserName());
        contentvalues.put(FeedEntry.COLUMN_USERPASS, contact.getUserPass());
        db.insert(FeedEntry.TABLE_NAME,null,contentvalues);
        db.close();
    }

    public  String LoginIn(String Username) {
        db = this.getReadableDatabase();
        String query = "SELECT UserName,UserPass FROM  " + FeedEntry.TABLE_NAME;
        Cursor corsor = db.rawQuery(query, null);
        String UserName, UserPass;
        UserPass = "Not found";
        if (corsor.moveToFirst()) {
            do {
                UserName = corsor.getString(0);
                if (UserName.contentEquals(Username)) {
                    UserPass = corsor.getString(1);
                    break;
                }
            } while (corsor.moveToNext());
        }
        return UserPass;
    }

    //public String searchPass(String UserPass)
    //{

      //  db = this.getReadableDatabase();
        //String query = "select UserName, UserPass from " + TABLE_NAME;
        //Cursor cursor = db.rawQuery(query , null);
        //String a, b;
        //b = "not found";
        //if (cursor.moveToFirst())
        //{
          //  do{
            //    a = cursor.getString(0);


              //  if (a.equals(UserPass))
                //{
                  //  b = cursor.getString(1);
                    //break;
                //}
            //}
            //while(cursor.moveToNext());
        //}

       // return b;

   // }

  // public String searchUser(String UserName)
   // {

        //db = this.getReadableDatabase();
        //String query = "select UserName, UserPass from " + TABLE_NAME;
        //Cursor cursor = db.rawQuery(query , null);
        //String a, b;
        //b = "not found";
        //if (cursor.moveToFirst())
        //{
          //  do{
            //    a = cursor.getString(0);


              //  if (a.equals(UserName))
                //{
                  //  b = cursor.getString(1);
                    //break;
             //   }
            //}
            //while(cursor.moveToNext());
        //}

//        return b;

  //  }

}
