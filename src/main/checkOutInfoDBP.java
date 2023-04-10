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
public class checkOutInfoDBP extends DBClassP {
    
        public boolean saveOrder ( ) {
            boolean result = false;

            try {
                // order id , customer id ,net total , order total , tax, payment type, payment ref #, date, 
                PreparedStatement st = con.prepareStatement("INSERT INTO `cuyi_pos`.`transactions`\n" +
                        "(`order_id`,`customer_id`,`net_total`,`order_total`,`tax`,`payment_type`,\n" +
                        "`payment_ref`,`purchase_date`)VALUES\n" +
                        "(?,?,?,?,?,?,?,?)");
                CurrentOrdersP cOrders = CurrentOrdersP.getInstance();
                
                st.setString( 1 , cOrders.getOrder_id());
                st.setString( 2 , cOrders.getCustomer_id());
                st.setFloat( 3 , Float.parseFloat(cOrders.getNet_total()));
                st.setFloat( 4 , Float.parseFloat(cOrders.getOrder_total()));
                st.setFloat( 5 , Float.parseFloat(cOrders.getTax()));
                st.setString( 6 , cOrders.getPayment_type()); 
                st.setString( 7 , cOrders.getPayment_ref());
                st.setString( 8 , cOrders.getDate());

                if( st.executeUpdate(  ) > 0 ) {
                    result = true;
                }
                con.close();
            } catch ( SQLException e ) {
                System.out.println( "dito ba"+e );
            }

            return result;
         }
    
}
