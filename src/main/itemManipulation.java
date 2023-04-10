/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author engeer
 */
public class itemManipulation {

    private int qty;
    private int item_serial;
    private String g_type;
    private String s_type;
    private String item_name;
    private int stock;
    private float price;
    private float sold_price;
    private String expiry;
    private String CustomerId;
    private float w_price;
    private int wp_check;
    private String date;

    public void setSold_price(float sold_price) {
        this.sold_price = sold_price;
    }
    
    

    public String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDateTime now = LocalDateTime.now();  
        date =dtf.format(now);
  
        return date;
    }

    public int getWp_check() {
        return wp_check;
    }

    public void setWp_check(int wp_check) {
        this.wp_check = wp_check;
    }
    
    
    
    public void setw_price(float w_price){
        this.w_price = w_price;
    }
    public float getw_price() {
        return w_price;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }
    

    public void setItem_serial(int item_serial) {
        this.item_serial = item_serial;
    }

    public void setG_type(String g_type) {
        this.g_type = g_type;
    }

    public void setS_type(String s_type) {
        this.s_type = s_type;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
    

    public int getQty() {
        return qty;
    }

    public int getItem_serial() {
        return item_serial;
    }

    public String getG_type() {
        return g_type;
    }

    public String getS_type() {
        return s_type;
    }

    public String getItem_name() {
        return item_name;
    }

    public int getStock() {
        return stock;
    }

    public float getPrice() {
        return price;
    }

    public String getExpiry() {
        return expiry;
    }

    public String getCustomerId() {
        return CustomerId;
    }


    public float getSold_price(){
        
       if(wp_check==1){
           return sold_price = qty * w_price;
       } else{
           return sold_price = qty * price;
       }

    }
    public float getSold_price2(){
        
        return sold_price;

    }
    
}
