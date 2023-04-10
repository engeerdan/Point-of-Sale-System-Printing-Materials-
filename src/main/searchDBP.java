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

/**
 *
 * @author engeer
 */
public class searchDBP extends DBClassP {
    
    public void searchByName(String Types_comboBox,String Search_Key, JTable SearchedListTable ) throws SQLException{
                PreparedStatement st = con.prepareStatement("select * from inventory "
                + "where g_type like  '%"+Types_comboBox+ "%' and item_name like '%"+
                Search_Key+"%' ");

                ResultSet rs= st.executeQuery();
                int rowInt=0;
                while(rs.next()){
                    String item_serial = String.valueOf(rs.getInt("item_serial"));
                    String g_type = rs.getString("g_type");
                    String s_type = rs.getString("s_type");
                    String item_name = rs.getString("item_name");
                    int QTY = rs.getInt("QTY");
                    float price = rs.getFloat("price");
                    float w_price = rs.getFloat("w_price");
                    String expiry = String.valueOf(rs.getDate("expiry"));

                    Object tbData[] ={item_serial,g_type,s_type,item_name,QTY,price,w_price,expiry};
                        DefaultTableModel   tb1Model = (DefaultTableModel)SearchedListTable.getModel();
                        tb1Model.insertRow(rowInt, tbData);
                        rowInt ++;
                }
    }
    
    public void searchByNameInventory(String Types_comboBox,String Search_Key, JTable SearchedListTable ) throws SQLException{
                PreparedStatement st = con.prepareStatement("select * from inventory where item_name LIKE '%"+Search_Key+"%' ");
        System.out.println("anyare lods");
        System.out.println(Search_Key);
                ResultSet rs= st.executeQuery();
                int rowInt=0;
                while(rs.next()){
                    String item_serial = String.valueOf(rs.getInt("item_serial"));
                    String g_type = rs.getString("g_type");
                    String s_type = rs.getString("s_type");
                    String item_name = rs.getString("item_name");
                    int QTY = rs.getInt("QTY");
                    float price = rs.getFloat("price");
                    float w_price = rs.getFloat("w_price");
                    String expiry = String.valueOf(rs.getDate("expiry"));

                    Object tbData[] ={item_serial,g_type,s_type,item_name,QTY,price,w_price,expiry};
                        DefaultTableModel   tb1Model = (DefaultTableModel)SearchedListTable.getModel();
                        tb1Model.insertRow(rowInt, tbData);
                        rowInt ++;
                }
    }
    public void searchBySerialInventory(String Types_comboBox,String Search_Key, JTable SearchedListTable ) throws SQLException{
                PreparedStatement st = con.prepareStatement("select * from inventory where item_name like '%"+Search_Key+"%' ");

                ResultSet rs= st.executeQuery();
                int rowInt=0;
                while(rs.next()){
                    String item_serial = String.valueOf(rs.getInt("item_serial"));
                    String g_type = rs.getString("g_type");
                    String s_type = rs.getString("s_type");
                    String item_name = rs.getString("item_name");
                    int QTY = rs.getInt("QTY");
                    float price = rs.getFloat("price");
                    float w_price = rs.getFloat("w_price");
                    String expiry = String.valueOf(rs.getDate("expiry"));

                    Object tbData[] ={item_serial,g_type,s_type,item_name,QTY,price,w_price,expiry};
                        DefaultTableModel   tb1Model = (DefaultTableModel)SearchedListTable.getModel();
                        tb1Model.insertRow(rowInt, tbData);
                        rowInt ++;
                }
    }
    
    public void clearTable (JTable a){
        DefaultTableModel   tb1Model = (DefaultTableModel)a.getModel();
        tb1Model.setRowCount(0);
    }
    
}
