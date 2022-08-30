/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery.system;

import SQL_Connector.Connector;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class VIEW_UPDATE_GROCERY_ITEMS extends javax.swing.JFrame {

    /**
     * Creates new form VIEW_UPDATE_GROCERY_TEMS
     */
    public VIEW_UPDATE_GROCERY_ITEMS() {
        initComponents();
        get_Table();
        displayTime();

    }
    
     public void displayTime(){
        
        new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("HH:mm:ss");
                
                String text_displayTime = simpleDateFormat.format(new Date());
                
                String text_displayDate = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).format(new Date());
                
                date_time.setText(text_displayDate + " " + text_displayTime);
            }
            
        }).start();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        searchItem = new javax.swing.JTextField();
        serachItemBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        membership = new javax.swing.JLabel();
        itemID = new javax.swing.JTextField();
        sltc_index = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        member_name = new javax.swing.JLabel();
        itemBrand = new javax.swing.JTextField();
        contact_number = new javax.swing.JLabel();
        itemCategory = new javax.swing.JTextField();
        email_address = new javax.swing.JLabel();
        itemPrice = new javax.swing.JTextField();
        NIC_num = new javax.swing.JLabel();
        itemSize = new javax.swing.JTextField();
        email_address1 = new javax.swing.JLabel();
        itemCustomPrice = new javax.swing.JTextField();
        itemUpdate = new javax.swing.JButton();
        itemViewDone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        date_time = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("SURAMYAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 299, 139));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VIEW & UPDATE ITEMS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, 61));

        search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(204, 204, 204));
        search.setText("SEARCH");
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, -1));

        searchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemActionPerformed(evt);
            }
        });
        searchItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchItemKeyReleased(evt);
            }
        });
        jPanel1.add(searchItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 261, -1));

        serachItemBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        serachItemBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Item ID", "Search by Item Brand", "Search by Item Category" }));
        serachItemBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachItemBoxActionPerformed(evt);
            }
        });
        jPanel1.add(serachItemBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 150, 35));

        membership.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        membership.setText("ITEM ID");

        itemID.setEditable(false);
        itemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIDActionPerformed(evt);
            }
        });

        sltc_index.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sltc_index.setText("ITEM NAME");

        itemName.setEditable(false);

        member_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        member_name.setText("ITEM BRAND");

        itemBrand.setEditable(false);
        itemBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBrandActionPerformed(evt);
            }
        });

        contact_number.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        contact_number.setText("ITEM CATEGORY");

        itemCategory.setEditable(false);

        email_address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email_address.setText("ITEM PRICE");

        itemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPriceActionPerformed(evt);
            }
        });

        NIC_num.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NIC_num.setText("ITEM SIZE");

        itemSize.setEditable(false);

        email_address1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email_address1.setText("ITEM CUSTOM PRICE");

        itemCustomPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCustomPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(membership, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(itemID, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sltc_index, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(itemName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(member_name, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(itemBrand))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(itemCategory))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_address, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemPrice)
                            .addComponent(itemCustomPrice))))
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(NIC_num, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(itemSize)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membership, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sltc_index, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(member_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIC_num, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemSize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemCustomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 560, 240));

        itemUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        itemUpdate.setForeground(new java.awt.Color(0, 102, 102));
        itemUpdate.setText("UPDATE");
        itemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(itemUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, 120, 33));

        itemViewDone.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        itemViewDone.setForeground(new java.awt.Color(0, 102, 102));
        itemViewDone.setText("DONE");
        itemViewDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemViewDoneActionPerformed(evt);
            }
        });
        jPanel1.add(itemViewDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 130, 33));

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "Name", "Brand", "Size", "Category", "Price", "Custom Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 220, 480, -1));

        date_time.setEditable(false);
        date_time.setBackground(new java.awt.Color(51, 0, 153));
        date_time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(date_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 520, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void get_Table()
    {
        java.sql.Connection connection = Connector.connection();
        
        String SQL = "SELECT * FROM grocery_items";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            itemTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException ERROR)
        {
            System.out.println(ERROR);
        }
    }
    
    private void searchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchItemActionPerformed

    private void searchItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchItemKeyReleased
        // TODO add your handling code here:
        get_data(searchItem.getText());

    }//GEN-LAST:event_searchItemKeyReleased

    private void serachItemBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachItemBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serachItemBoxActionPerformed

    private void itemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemIDActionPerformed

    private void itemBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBrandActionPerformed

    private void itemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdateActionPerformed
        // TODO add your handling code here:
        Update_data();
        
    }//GEN-LAST:event_itemUpdateActionPerformed

    private void itemViewDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemViewDoneActionPerformed
        // TODO add your handling code here:
        new HOME_PAGE().setVisible(true);

    }//GEN-LAST:event_itemViewDoneActionPerformed

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
        // TODO add your handling code here:
        int row = itemTable.getSelectedRow();

        String ID = itemTable.getValueAt(row,0).toString();

        System.out.println(ID);

        searchItem.setText(ID);

        get_data(ID);
    }//GEN-LAST:event_itemTableMouseClicked

    private void itemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemPriceActionPerformed

    private void itemCustomPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCustomPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCustomPriceActionPerformed

    public void close_window()
    {
        WindowEvent new_event;
        
        new_event = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new_event);
    }
    
    public void get_data(String id)
    {
        Integer iid = Integer.valueOf(id);
        
        
                
        String SQL = "SELECT * FROM grocery_items WHERE ITEM_ID = "+id+"";
        
         java.sql.Connection connection = Connector.connection();
         
         try
         {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                itemID.setText(rs.getString("ITEM_ID"));
                
                itemName.setText(rs.getString("ITEM_NAME"));
            
                itemSize.setText(rs.getString("SIZE"));
                
                itemBrand.setText(rs.getString("BRAND"));
                
                itemCategory.setText(rs.getString("CATEGORY"));
                
                itemPrice.setText(rs.getString("PRICE"));
                
                itemCustomPrice.setText(rs.getString("CUSTOM_PRICE"));
                      
            }
            
           
         }
         catch(Exception ERROR)
         {
             System.out.println(ERROR);
         }
    
    }
    
    public void Update_data()
    {
        
        String item_price = itemPrice.getText();
        String item_custom_price = itemCustomPrice.getText();
        
        
        java.sql.Connection connection = Connector.connection();
        
        String SQL = "UPDATE grocery_items SET PRICE = '"+item_price+"', CUSTOM_PRICE = '"+item_custom_price+"' WHERE ITEM_ID = "+Integer.valueOf(itemID.getText())+"";
        

        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate(SQL);
           
           System.out.println("Data Updated Successfully !!");
           
           JOptionPane.showMessageDialog(null,"Updated Item Price Successfully !!");

        }
        catch(Exception error)
        {
            System.out.println("ERROR CODE : "+error);
            
            JOptionPane.showMessageDialog(null,"ERROR CODE : "+error);
        }
       
        
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VIEW_UPDATE_GROCERY_ITEMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIEW_UPDATE_GROCERY_ITEMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIEW_UPDATE_GROCERY_ITEMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEW_UPDATE_GROCERY_ITEMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIEW_UPDATE_GROCERY_ITEMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIC_num;
    private javax.swing.JLabel contact_number;
    private javax.swing.JTextField date_time;
    private javax.swing.JLabel email_address;
    private javax.swing.JLabel email_address1;
    private javax.swing.JTextField itemBrand;
    private javax.swing.JTextField itemCategory;
    private javax.swing.JTextField itemCustomPrice;
    private javax.swing.JTextField itemID;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemPrice;
    private javax.swing.JTextField itemSize;
    private javax.swing.JTable itemTable;
    private javax.swing.JButton itemUpdate;
    private javax.swing.JButton itemViewDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel member_name;
    private javax.swing.JLabel membership;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchItem;
    private javax.swing.JComboBox<String> serachItemBox;
    private javax.swing.JLabel sltc_index;
    // End of variables declaration//GEN-END:variables
}
