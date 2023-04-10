/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;


/**
 *
 * @author engeer
 */
public class panelSummaryP extends DBClassP{
       public void refreshreceiptTable(JTable receiptTable)throws SQLException{
            //OrderDBP omDB = new OrderDBP();
            CurrentOrdersP cOrders = CurrentOrdersP.getInstance();
            DefaultTableModel   tb1Model = (DefaultTableModel)receiptTable.getModel();
            tb1Model.setRowCount(0);
            String OrderID = cOrders.getOrder_id();
            
                PreparedStatement st = con.prepareStatement("select item_name, g_type, qty , sold_price from sales where order_id ="+OrderID+";");

        
                ResultSet rs= st.executeQuery();
                int rowInt=0;
                while(rs.next()){
                    String item_name = rs.getString("item_name"); 
                    String g_type = rs.getString("g_type");
                    float QTY= rs.getFloat("qty");
                    float totalprice= rs.getFloat("sold_price");
                    

                    Object tbData[] ={rowInt+1,item_name,g_type,QTY,totalprice};
                        tb1Model.insertRow(rowInt, tbData);
                        rowInt ++;           
           
        }       
    }
    
        

    public void refreshSummaryTable(JTable currentOrderListTable)throws SQLException{
            //OrderDBP omDB = new OrderDBP();
            CurrentOrdersP cOrders = CurrentOrdersP.getInstance();
            DefaultTableModel   tb1Model = (DefaultTableModel)currentOrderListTable.getModel();
            tb1Model.setRowCount(0);
            String OrderID = cOrders.getOrder_id();
                PreparedStatement st = con.prepareStatement("select item_sr_no, g_type, s_type, item_name, qty ,price, w_price, sold_price, w_asker from sales where order_id ="+OrderID+";");

        
                ResultSet rs= st.executeQuery();
                int rowInt=0;
                while(rs.next()){
                    String item_serial = String.valueOf(rs.getInt("item_sr_no"));
                    String g_type = rs.getString("g_type");
                    String s_type = rs.getString("s_type");
                    String item_name = rs.getString("item_name");
                    int QTY = rs.getInt("QTY");
                    int w_asker = rs.getInt("w_asker");
                    float price;
                    float w_price =0;
                    if(w_asker == 1){
                        price = rs.getFloat("w_price");
                    }else{
                        price = rs.getFloat("price");
                    }
                    float discount = (float) 0.00;
                    float totalprice= rs.getFloat("sold_price");

                    Object tbData[] ={item_serial,g_type,s_type,item_name,QTY,price,discount,totalprice};
                        tb1Model.insertRow(rowInt, tbData);
                        rowInt ++;           
           
        }       
    }
    
    
    
    public  void setTotal(JLabel total_jLabel, JLabel netTotal_jLabel) throws SQLException{

        CurrentOrdersP cOrders = CurrentOrdersP.getInstance();
        String OrderID = cOrders.getOrder_id();

        PreparedStatement st = con.prepareStatement("SELECT SUM(sold_price) FROM sales WHERE order_id =?"
        , ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        st.setString(1, OrderID);
        ResultSet rs = st.executeQuery();
        rs.next();
        Float x = rs.getFloat(1);
        rs.absolute(0);
        total_jLabel.setText(Float.toString(x));
        netTotal_jLabel.setText(Float.toString(x));

}
    

    
    
    
    
}
