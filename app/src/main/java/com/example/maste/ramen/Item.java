package com.example.maste.ramen;

/**
 * Created by Blake on 10/27/17.
 */

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
    // what type of item this is (may not end up being useful), must have package private access
    enum itemType {DISH, ADD_ON, DRINK, OTHER}
    private itemType type;

    /**
     * The default constructor for an Item
     */
    Item() {
        this.price = 0;
        this.quantity = 0;
        this.name = "";
        this.type = itemType.OTHER;
    } // end default Item constructor

    /**
     * Constructs an item object that can be added to the cart
     * @param price The price of the item
     * @param name The name of the item
     * @param type The type of item that the item is (remember, type is an enum). Not sure if this
     *             will end up being useful, but it can be removed if it is not once we continue
     *             implementation
     */
    Item(double price, int quantity, String name, itemType type) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.type = type;
    } // end Item constructor

    public double getPrice() {
        return price;
    } // end getPrice

    public void setPrice(double price) {
        this.price = price;
    } // end setPrice

    public int getQuantity() {
        return quantity;
    } // end getQuantity

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } // end setQuantity

    public String getName() {
        return name;
    } // end getName

    public void setName(String name) {
        this.name = name;
    } // end setName

    public itemType getType() {
        return type;
    } // end getType

    public void setType(itemType type) {
        this.type = type;
    } // end setType

} // end class
