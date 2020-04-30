/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author juanc
 */
public class Products {
    //Products Data model
    String product_Name;
    int code,quantity;
    float price;

    public Products(String product_Name, int code, int quantity, float price) {
        this.product_Name = product_Name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct_Name() {
        return product_Name;
    }
    
    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    

   
}
