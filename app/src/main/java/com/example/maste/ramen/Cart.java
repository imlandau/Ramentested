package com.example.maste.ramen;

import android.support.v7.app.AppCompatActivity;

public class Cart extends AppCompatActivity {
    //Create all the items in the cart
    static Item dish1 = new Item(6.9, 0, "Sweet and Spicy Pork");
    static Item dish2 = new Item(6.9, 0, "Mongolian Beef");
    static Item dish3 = new Item(6.9, 0, "Ramen Vegetable Stir Fry");
    static Item dish4 = new Item(6.9, 0, "Crunchy Asian Ramen Noodle Salad");
    static Item dish5 = new Item(6.9, 0, "Chicken Veggie Ramen Bowl");
    static Item drink = new Item(1.85, 0, "Drink");

    public Cart() {
    }

    public void remove(Item item, int quantity){
        item.setQuantity(item.getQuantity()-quantity);
    }

    //removes all the items currently in the cart
    public void removeAll(){
        dish1.setQuantity(0);
        dish2.setQuantity(0);
        dish3.setQuantity(0);
        dish4.setQuantity(0);
        dish5.setQuantity(0);
        drink.setQuantity(0);
    }
} // end class
