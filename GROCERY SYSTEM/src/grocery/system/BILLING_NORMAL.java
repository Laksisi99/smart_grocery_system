/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery.system;

import SQL_Connector.Connector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class BILLING_NORMAL extends javax.swing.JFrame {

    /**
     * Creates new form BILLING_NORMAL
     */
    public BILLING_NORMAL() {
        initComponents();
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

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        itemId = new javax.swing.JTextField();
        itemName = new javax.swing.JTextField();
        itemPrice = new javax.swing.JTextField();
        itemQuantity = new javax.swing.JSpinner();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        date_time = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtcash = new javax.swing.JTextField();
        bill = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        IDBILL = new javax.swing.JTextField();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("SURAMYAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, -1));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Item ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 48, 80, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Item Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        amount.setEditable(false);
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 100, 40));

        itemId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemIdKeyReleased(evt);
            }
        });
        jPanel1.add(itemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 40));

        itemName.setEditable(false);
        jPanel1.add(itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 100, 40));

        itemPrice.setEditable(false);
        jPanel1.add(itemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 100, 40));

        itemQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQuantityStateChanged(evt);
            }
        });
        jPanel1.add(itemQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 90, 40));

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 183, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 737, 249));

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item_ID", "Item_Name", "Quantity", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 737, 246));

        txtbill.setEditable(false);
        txtbill.setColumns(5000);
        txtbill.setRows(88888888);
        jScrollPane2.setViewportView(txtbill);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 400, 290));

        date_time.setEditable(false);
        date_time.setBackground(new java.awt.Color(102, 0, 102));
        date_time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_time.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(date_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 740, 70));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Balance");

        txtbalance.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Total");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Cash");

        txttotal.setEditable(false);

        bill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bill.setText("BILL");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Bill ID");

        IDBILL.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcash, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(IDBILL))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDBILL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcash, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(bill)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(780, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemIdKeyPressed

    private void itemIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemIdKeyReleased
        get_data(itemId.getText());
    }//GEN-LAST:event_itemIdKeyReleased

    private void itemQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQuantityStateChanged
        int qty = Integer.parseInt(itemQuantity.getValue().toString());
        int price = Integer.parseInt(itemPrice.getText());

        int tot = qty * price;

        amount.setText(String.valueOf(tot));
    }//GEN-LAST:event_itemQuantityStateChanged

    public void balance (){
        
        int total = Integer.parseInt(txttotal.getText());
        int cash = Integer.parseInt(txtcash.getText());
        
        int bal = cash - total;
        
        txtbalance.setText(String.valueOf(bal));   
        
    }
    
    public void Bill_ID(){
        Random rand = new Random();
        
        int maxNumber = 100000;
        
        int bill_identity = rand.nextInt(maxNumber) + 1;

        IDBILL.setText(String.valueOf(bill_identity));
    }
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        DefaultTableModel model = new DefaultTableModel();

        model = (DefaultTableModel)itemTable.getModel();

        model.addRow(new Object[]

            {
                itemId.getText(),
                itemName.getText(),
                itemQuantity.getValue().toString(),
                itemPrice.getText(),
                amount.getText(),
            } );

            int sum = 0;
            for(int i = 0; i < itemTable.getRowCount(); i++)
            {
                sum = sum + Integer.parseInt(itemTable.getValueAt(i, 4).toString());
            }

            txttotal.setText(Integer.toString(sum));

            itemId.setText("");
            itemName.setText("");
            itemPrice.setText("");
            amount.setText("");
            itemId.requestFocus();
    }//GEN-LAST:event_addActionPerformed

    public void bill(){
        
        String total = txttotal.getText();
        String cash = txtcash.getText();
        String bal = txtbalance.getText();
        String timer = date_time.getText();
        
        DefaultTableModel model = new DefaultTableModel();
        
        model = (DefaultTableModel)itemTable.getModel();
        
        txtbill.setText(txtbill.getText() + "                       SURAMYAS                \n");
        txtbill.setText(txtbill.getText() + "------------------------------------------------\n");        
        txtbill.setText(txtbill.getText() + "   No 55, Perera Mawatha, Thalawathugoda         \n");
        txtbill.setText(txtbill.getText() + "   Contact us: 0771980543 0764354565              \n");
        txtbill.setText(txtbill.getText() + "   " + timer + "\n");

        txtbill.setText(txtbill.getText() + "------------------------------------------------\n");        
        


        //Heading
        txtbill.setText(txtbill.getText() + "Product" + "\t" + "Price" + "\t" + "Quantity"+ "\t" +"Amount" + "\n");

        for(int i = 0; i < model.getRowCount(); i++){
            
            String iname = (String)model.getValueAt(i, 1);
            String price = (String)model.getValueAt(i, 3);
            String quantity = (String)model.getValueAt(i, 2);
            String amount = (String)model.getValueAt(i, 4);
            
            txtbill.setText(txtbill.getText() + iname + "\t" + price + "\t" + quantity + "\t" + amount + "\n");


        }
        
        txtbill.setText(txtbill.getText() + "\n");

        txtbill.setText(txtbill.getText() + "Sub Total :" + "\t" + "\t" + "\t" +total+ "\n");
        txtbill.setText(txtbill.getText() + "Cash :" + "\t" + "\t" + "\t" +cash+ "\n");
        txtbill.setText(txtbill.getText() + "Balance :" + "\t" + "\t" + "\t" +bal+ "\n");

        txtbill.setText(txtbill.getText() + "\n");
        txtbill.setText(txtbill.getText() + "____________________________________\n");
        txtbill.setText(txtbill.getText() + "*****Thank You & Come Again.*****\n");

    }
    
    
    
    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        balance();
        bill();
        Bill_ID();
        ADD_BILL();

    }//GEN-LAST:event_billActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            txtbill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(BILLING_NORMAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        new HOME_PAGE().setVisible(true);
    }//GEN-LAST:event_printActionPerformed

     public void get_data(String id)
    {
        Integer bid = Integer.valueOf(id);
        
        
        String SQL = "SELECT * FROM grocery_items WHERE ITEM_ID = "+id+"";
        
         java.sql.Connection connection = Connector.connection();
         
         try
         {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
           
            
                while(rs.next())
                {
                    itemName.setText(rs.getString("ITEM_NAME"));
                    itemPrice.setText(rs.getString("PRICE"));

                }
            
            
         }
                
         catch(Exception ERROR)
         {
             System.out.println(ERROR);
         }
    
    }
     
     public void ADD_BILL()
    {
        String bill_identity = IDBILL.getText();
         
        String date = date_time.getText();
               
        int total = Integer.parseInt(txttotal.getText());

        
        
        java.sql.Connection connection = Connector.connection();
        
        String SQL = "INSERT INTO bill_log VALUES ('"+bill_identity+"','"+date+"',"+total+")";
        
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
           System.out.println("Data Insert Successfully !!");
           
           
           JOptionPane.showMessageDialog(null,"DONE!!!!");

        }
        catch(Exception error)
        {
            System.out.println("ERROR CODE : "+error);
            
            JOptionPane.showMessageDialog(null,"Attempt Unsuccessful");
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
            java.util.logging.Logger.getLogger(BILLING_NORMAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BILLING_NORMAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BILLING_NORMAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BILLING_NORMAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BILLING_NORMAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDBILL;
    private javax.swing.JButton add;
    private javax.swing.JTextField amount;
    private javax.swing.JButton bill;
    private javax.swing.JTextField date_time;
    private javax.swing.JTextField itemId;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemPrice;
    private javax.swing.JSpinner itemQuantity;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton print;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtcash;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}