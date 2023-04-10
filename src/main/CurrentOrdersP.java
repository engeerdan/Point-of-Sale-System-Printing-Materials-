/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author engeer
 */
public class CurrentOrdersP {
    private static final CurrentOrdersP cOrders = new CurrentOrdersP();
    private String order_id;
    private String customer_id;
    //private int employee_id;
    private String order_total;
    private String net_total;
    private String tax;
    private int qNumber=0;
    private String payment_type;
    private String payment_ref;
    private Float paymentAmount;
    private String date;
    
    public String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDateTime now = LocalDateTime.now();  
        date =dtf.format(now);
        System.out.println(dtf.format(now));  
        return date;
    }

    public String getPayment_ref() {
        return payment_ref;
    }

    public void setPayment_ref(String payment_ref) {
        this.payment_ref = payment_ref;
    }

    public String getTax() {
        
        if(tax==null){
            tax="0.00";
            
        }
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }
    
    

    public String getNet_total() {
        return net_total;
    }

    public void setNet_total(String net_total) {
        this.net_total = net_total;
    }
    
    
    public static CurrentOrdersP getInstance() {
        return cOrders;
    }
    
    public void setOrder_id(){
        DateFormat dateFormat = new SimpleDateFormat("yyddmm");
        Date date = new Date();
        String dt=String.valueOf(dateFormat.format(date));
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat time = new SimpleDateFormat("HHmmss");
        String tm= String.valueOf(time.format(new Date()));//time in 24 hour format
        String id= dt+tm+qNumber;
        qNumber ++;  
        this.order_id = id;
        
    }
    public void setOrder_id(String a){

        this.order_id = a;
        
    }
    

    public String getOrder_id() {
        return order_id;
    }
    public void nullSetOrder_id(){
        //System.out.println("delete order ID");
        this.order_id = null;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getOrder_total() {
        return order_total;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public Float getPaymentAmount() {
        return paymentAmount;
    }
    

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void setOrder_total(String order_total) {
        this.order_total = order_total;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public void setPaymentAmount(Float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    
    
    
}
