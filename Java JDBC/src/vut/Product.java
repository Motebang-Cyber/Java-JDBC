/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author Motebang letseng
 */
public class Product {
    private String itemNumber, itemName;
    private double price;
    private int qty;
    
    private static ArrayList<Product> arProduct = new ArrayList<>();
    
    public Product(){
        this("", "", 0.0, 0);
    }
    
    public Product(String itemNumber, String itemName, double price, int qty) {
        setItemNumber(itemNumber);
        setItemName(itemName);
        setPrice(price);
        setQty(qty);
    }

    public String getItemNumber() {
        return itemNumber;
    }
    
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        if (price < 0){
            throw new IllegalArgumentException("Price cannot be Negative");
        }else{
            this.price = price;
        }
    }

    public int getQty() {
        return qty;
    }
 
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        NumberFormat curr = NumberFormat.getCurrencyInstance();
        return String.format("%-4s\t%-15s\t%10s\tR %-7.2f \n" + getItemNumber(), getItemName(), curr.format(getPrice()), getQty());
    }
    
    public void initialise() throws DataStorageException{
        ProductDA.initialise();
    }
    
    public ArrayList<Product> viewAll() throws NotFoundException{
        return ProductDA.viewAll();
    }
    
    public ArrayList<Product> viewOutofStockItems() throws NotFoundException{
        return ProductDA.viewOutofStockItems();
    }
    
    public void replenish(int qty, String itemNumber) throws NotFoundException{
        ProductDA.replenish(qty, itemNumber);
    }
    
    
    
    
    
}
