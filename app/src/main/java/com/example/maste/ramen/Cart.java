package com.example.maste.ramen;

import android.support.v7.app.AppCompatActivity;

public class Cart extends AppCompatActivity {
    //Create all the items in the cart

    static Item var1 = new Item(6.00, 0, "-Beef - Broccoli");
    static Item var2 = new Item(6.00, 0, "-Beef -Carrots");
    static Item var3 = new Item(6.00, 0, "-Beef -Asparagus");
    static Item var4 = new Item(6.00, 0, "-Chicken -Broccoli");
    static Item var5 = new Item(6.00, 0, "-Chicken -Carrots");
    static Item var6 = new Item(6.00, 0, "-Chicken -Asparagus");
    static Item var7 = new Item(6.00, 0, "-Pork -Broccoli");
    static Item var8 = new Item(6.00, 0, "-Pork -Carrots");
    static Item var9 = new Item(6.00, 0, "-Pork -Asparagus");
    static Item[] createdDish = {var1, var2, var3, var4, var5, var6, var7, var8, var9};
    static Item nonDish = new Item(0,0,"");
    static Item dish1 = new Item(7.20, 0, "Sweet and Spicy Pork Ramen");
    static Item dish2 = new Item(5.65, 0, "Mongolian Beef Ramen Noodles");
    static Item dish3 = new Item(8.35, 0, "Ramen Vegetable Stir Fry");
    static Item dish4 = new Item(6.95, 0, "Crunchy Asian Ramen Noodle Salad");
    static Item drink = new Item(1.85, 0, "Drink");
    //Create identifier
    static int identifier = 0;

    //Removes all the items currently in the cart by setting their quantities to 0
    public static void removeAll(){
        int i = 0;
        while(i < 0){
            i++;
            createdDish[i].setQuantity(0);
            createdDish[i].setName("vacant");
//
        }
        dish1.setQuantity(0);
        dish2.setQuantity(0);
        dish3.setQuantity(0);
        dish4.setQuantity(0);
        drink.setQuantity(0);
    }
} // end class
