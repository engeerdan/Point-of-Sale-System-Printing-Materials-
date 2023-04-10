/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author engeer
 */
public class itemManDBP extends DBClassP {
    
    public boolean addOrderSales( itemManipulation im,CurrentOrdersP cOrders ) {
        boolean result = false;
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO sales VALUES (? ,?,?,?,?,?,?,?,?,?,?,?)");
            st.setInt(1 , im.getItem_serial());
            st.setString(2, cOrders.getOrder_id());
            st.setString(3, im.getCustomerId());
            st.setString(4, im.getItem_name());
            st.setString(5, im.getG_type());
            st.setString(6, im.getS_type());
            st.setInt(7, im.getQty());
            st.setFloat(8, im.getPrice());
            st.setFloat(9, im.getw_price());
            st.setFloat(10, im.getSold_price());
            st.setInt(11, im.getWp_check());
            st.setString(12, im.getDate());

            if( st.executeUpdate(  ) > 0 ) {
                result = true;
            }
        } catch ( SQLException e ) {
            System.out.println( e );
        }
        
        return result;
    }
    
    public boolean updateInventory (itemManipulation av){
        boolean a=false;

try {
            PreparedStatement st = con.prepareStatement("UPDATE `cuyi_pos`.`inventory` SET `item_Serial` = ?, `g_type` = ?, "
                    + "`s_type` = ?, `item_name` = ?, `QTY` = ?, `price` = ?, `w_price` = ?, `expiry` = ? WHERE `item_Serial` = ?");
            st.setInt(1 , av.getItem_serial());
            
            st.setString(2, av.getG_type());
            st.setString(3, av.getS_type());
            st.setString(4, av.getItem_name());
            st.setInt(5, av.getQty());

            st.setFloat(6, av.getPrice());
            st.setFloat(7, av.getw_price());
            st.setString(8, av.getDate());
            st.setInt(9 , av.getItem_serial());

            if( st.executeUpdate(  ) > 0 ) {
                a = true;
            }
        } catch ( SQLException e ) {
            
            System.out.println( "er"+e );
        }
        return a;
    }
    public boolean updateAddInventory (itemManipulation av){
        boolean a=false;

try {
            PreparedStatement st = con.prepareStatement("insert into `cuyi_pos`.`inventory` SET `item_Serial` = ?, `g_type` = ?, "
                    + "`s_type` = ?, `item_name` = ?, `QTY` = ?, `price` = ?, `w_price` = ?, `expiry` = ? ");
            st.setInt(1 , av.getItem_serial());
            
            st.setString(2, av.getG_type());
            st.setString(3, av.getS_type());
            st.setString(4, av.getItem_name());
            st.setInt(5, av.getQty());

            st.setFloat(6, av.getPrice());
            st.setFloat(7, av.getw_price());
            st.setString(8, av.getDate());
       

            if( st.executeUpdate(  ) > 0 ) {
                a = true;
            }
        } catch ( SQLException e ) {
            
            System.out.println( "er"+e );
        }
        return a;
    }
    
    public boolean deleteItem(itemManipulation delm ) {
        boolean result = false;
            CurrentOrdersP cOrders = CurrentOrdersP.getInstance();
            String OrderID = cOrders.getOrder_id();
        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM sales WHERE order_id=? AND item_name =? AND g_type =? AND s_type =? AND qty = ? AND sold_price= ?");
           //        -- -- DELETE FROM sales WHERE order_id=2218321032360 AND item_name ='cuyi ink' AND g_type ='ink' 
//-- -- AND s_type = 'dye' AND qty = 1 AND sold_price= 150;
            st.setString(1 , OrderID);
            st.setString(2 , delm.getItem_name());
            st.setString(3 , delm.getG_type());
            st.setString(4 , delm.getS_type());
            st.setInt(5, delm.getQty());
            st.setFloat(6, delm.getSold_price2());
            if( st.executeUpdate(  ) > 0 ) {
                result = true;
            }
        } catch ( SQLException e ) {
            System.out.println( "DB.deleting order entry "+e );
        }
        
        return result;
    }
    
    public boolean deleteInvBySerial(itemManipulation iv ) {
        boolean result = false;

        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM inventory WHERE item_Serial= ?");
           //        -- -- DELETE FROM sales WHERE order_id=2218321032360 AND item_name ='cuyi ink' AND g_type ='ink' 
//-- -- AND s_type = 'dye' AND qty = 1 AND sold_price= 150;
            st.setInt(1 , iv.getItem_serial());

            if( st.executeUpdate(  ) > 0 ) {
                result = true;
            }
        } catch ( SQLException e ) {
            System.out.println( "DB.deleting order entry "+e );
        }
        
        return result;
    }
    
    public boolean cancelOrder(){
        boolean a=false;
        CurrentOrdersP cOrders = CurrentOrdersP.getInstance();
        String OrderID = cOrders.getOrder_id();
        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM sales WHERE order_id=? ");

           st.setString(1 , OrderID);
            if( st.executeUpdate(  ) > 0 ) {
                a = true;
            }

        } catch(SQLException e){
            System.out.println( "DB.deleting whole order entry "+e );
        }
        return a;
    }
    
    public boolean subInventory(itemManipulation im){
        boolean a=false;
//        UPDATE inventory SET QTY = QTY - 1 WHERE item_Serial = 24;
        try {
            PreparedStatement st = con.prepareStatement("UPDATE inventory SET QTY = QTY - ? WHERE item_Serial = ?");
            st.setInt(1, im.getQty());
            st.setInt(2 , im.getItem_serial());
            if( st.executeUpdate(  ) > 0 ) {
                a = true;
            }

        } catch(SQLException e){
            System.out.println( "DB.deleting whole order entry "+e );
        }
        return a;
    }
    public boolean addStockInventory(itemManipulation delm){
        boolean a=false;
//        UPDATE inventory SET QTY = QTY + 30 WHERE item_Serial =24;
        try {
            PreparedStatement st = con.prepareStatement("UPDATE inventory SET QTY = QTY + ? WHERE item_Serial = ?");
            st.setInt(1, delm.getQty());
            st.setInt(2 , delm.getItem_serial());
            if( st.executeUpdate(  ) > 0 ) {
                a = true;
            }

        } catch(SQLException e){
            System.out.println( "DB. adding inv "+e );
        }
        return a;
    }
}
