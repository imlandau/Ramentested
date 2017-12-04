package com.example.maste.ramen;

/**
 * Instances of this class are objects that will be added to the cart.
 */
public class Item {
    // the price of the item
    private double price;
    // the number of items (the number of times the item should be added to the cart)
    private int quantity;
    // the name of the item
    private String name;

    /**
     * The default constructor for an Item
     */
    Item() {
        this.price = 0;
        this.quantity = 0;
        this.name = "";
    } //End default Item constructor

    /**
     * Constructs an item object that can be added to the cart
     * @param price The price of the item
     * @param name The name of the item
     */
    Item(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    } //End Item constructor

    public double getPrice() {
        return price;
    }//End getPrice

    public int getQuantity() {
        return quantity;
    }//End getQuantity

    public void setQuantity(int quantity) {this.quantity = quantity;}//End setQuantity

    public String getName() {
        return name;
    }//End getName

    public String toString() {
        return this.name + "\nQuantity: " + this.quantity + "Price per unit: " +
                this.price + "\nSubtotal: $" + this.price*this.quantity + "\n\n";
    }//End toString
}//End class