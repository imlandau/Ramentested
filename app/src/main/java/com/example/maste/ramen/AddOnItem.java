package com.example.maste.ramen;

/**
 * Created by Blake on 10/28/17.
 *
 * This class is for the items that can be added on to a Create Your Own dish.
 */

public class AddOnItem extends Item {
    private double price;
    private int quantity;
    private String name;
    private itemType type;
    enum AddOnType {BROTH, MEAT, NOODLES, VEGGIES, FLAVORING, NONE}
    private AddOnType addOnType;

    /**
     * Default constructor for add on items
     */
    public AddOnItem() {
        super();
        addOnType = AddOnType.NONE;
    } // end default constructor

    /**
     * Constructor for add-on items.
     * There is no parameter for 'ItemType type' since all of these are add-ons
     *
     * @param price the price of the add-on item
     * @param quantity the quantity of the add-on item
     * @param name the name of the add-on item
     * @param addOnType the type of add-on (remember this is an enum)
     */
    public AddOnItem(double price, int quantity, String name, AddOnType addOnType) {
        super(price, quantity, name, itemType.ADD_ON);
        this.addOnType = addOnType;
    } // end constructor

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

    public AddOnType getAddOnType() {
        return addOnType;
    } // end getAddOnType

    public void setAddOnType(AddOnType addOnType) {
        this.addOnType = addOnType;
    } // end setAddOnType

} // end class
