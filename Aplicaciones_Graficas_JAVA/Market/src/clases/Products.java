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
    String Product_Name;
    int Code,Quantity;
    float Price;

    public Products(String Product_Name, int Code, int Quantity, float Price) {
        this.Product_Name = Product_Name;
        this.Code = Code;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
    
    
    
    
    
    
    
    
    
}
