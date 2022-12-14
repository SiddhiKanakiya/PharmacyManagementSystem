/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        SelectMed();
        showDate();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        B_ID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicine_table = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        B_Date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        B_Qty = new javax.swing.JTextField();
        B_Med = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        B_Add = new javax.swing.JButton();
        B_Print = new javax.swing.JButton();
        B_Clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Bill = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("BILL ID");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("DATE");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        B_ID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        B_ID.setForeground(new java.awt.Color(0, 0, 153));
        B_ID.setText("Enter ID");
        B_ID.setName("B_ID"); // NOI18N

        medicine_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        medicine_table.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        medicine_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Med_ID", "Med_Name", "Price", "Quantity"
            }
        ));
        medicine_table.setSelectionBackground(new java.awt.Color(204, 204, 255));
        medicine_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicine_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicine_table);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("MEDICINE LIST");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("SWAN PHARMACY");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        B_Date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        B_Date.setForeground(new java.awt.Color(0, 0, 153));
        B_Date.setText("DD/MM/YY");
        B_Date.setName("Med_ID"); // NOI18N
        B_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("QTY");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        B_Qty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        B_Qty.setForeground(new java.awt.Color(0, 0, 153));
        B_Qty.setText("Enter Qty");
        B_Qty.setName("Med_ID"); // NOI18N

        B_Med.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        B_Med.setForeground(new java.awt.Color(0, 0, 153));
        B_Med.setText("Medicine");
        B_Med.setName("Med_Name"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("MEDICINE");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        B_Add.setBackground(new java.awt.Color(204, 204, 255));
        B_Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        B_Add.setForeground(new java.awt.Color(0, 0, 153));
        B_Add.setText("ADD TO BILL");
        B_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AddMouseClicked(evt);
            }
        });

        B_Print.setBackground(new java.awt.Color(204, 204, 255));
        B_Print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        B_Print.setForeground(new java.awt.Color(0, 0, 153));
        B_Print.setText("PRINT");
        B_Print.setActionCommand("");
        B_Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_PrintMouseClicked(evt);
            }
        });
        B_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PrintActionPerformed(evt);
            }
        });

        B_Clear.setBackground(new java.awt.Color(204, 204, 255));
        B_Clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        B_Clear.setForeground(new java.awt.Color(0, 0, 153));
        B_Clear.setText("CLEAR");
        B_Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ClearMouseClicked(evt);
            }
        });

        Bill.setColumns(20);
        Bill.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Bill.setRows(5);
        Bill.setText("                 ********************PHARMACARE RECEIPT********************");
        jScrollPane2.setViewportView(Bill);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(B_Add)
                .addGap(18, 18, 18)
                .addComponent(B_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B_Med)
                            .addComponent(B_Qty, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(B_ID))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(B_Print)
                                .addGap(289, 289, 289))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(B_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(B_Med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Print)
                .addGap(60, 60, 60))
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AGENT");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BILLING");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MEDICINE");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("COMPANY");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(221, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(331, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection Con =null;
    Statement St = null; 
    ResultSet Rs =null;
    
    public void SelectMed(){
// This method is to update the table on the dialog box as per the database   
    try{
   Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","V@$eline18");
   St = Con.createStatement();
   Rs = St.executeQuery("SELECT * FROM pharmadb.medicine_table");
   medicine_table.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch(SQLException e){
     e.printStackTrace();
}
    }
    
    public void showDate(){
        
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        B_Date.setText(s.format(d));
    }
    int Qty,BID;
    public void update(){
//        to update the medicine table when you add o recipt
        try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","V@$eline18");
               int newQty = Qty-Integer.parseInt(B_Qty.getText());
               String Query = "UPDATE pharmadb.medicine_table SET Med_Qty = "+newQty+" WHERE Med_ID="+BID;
               Statement add = Con.createStatement();
               add.executeUpdate(Query);
               SelectMed();
//                 JOptionPane.showMessageDialog(this,"Medicine Updated Successfully");
               
            }
            catch(SQLException e){
            
              e.printStackTrace();
            }
        
    }
    
    int i=0, price;
    private void B_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AddMouseClicked
      
//Action taken when ADD button is clicked
if(B_Med.getText().isEmpty() || B_Qty.getText().isEmpty()) JOptionPane.showMessageDialog(this,"Incomplete Information");
else {
i++;
if(i==1){
Bill.setText("                 ********************PHARMACARE RECEIPT********************   \n"
        +    "\t        ID     MEDICINE     QTY     PRICE     TOTAL  \n"+
             "\t        "+i+"     "+B_Med.getText()+"     "+B_Qty.getText()+"     "+price+"     "+Integer.parseInt(B_Qty.getText())*price+"\n");
update();
}
else {
    Bill.setText( Bill.getText()+ "\t        "+i+"     "+B_Med.getText()+"     "+B_Qty.getText()+"     "+price+"     "+Integer.parseInt(B_Qty.getText())*price+"\n");     

update();
}
}
    }//GEN-LAST:event_B_AddMouseClicked

    private void B_PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_PrintMouseClicked
//        //       Action taken when print button is clicked
//       
//
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","V@$eline18");
               Bill.print();
               
//                JOptionPane.showMessageDialog(this,"Medicine Updated Successfully");
//
            }
            catch(Exception e){

                e.printStackTrace();
            }
//        }

    }//GEN-LAST:event_B_PrintMouseClicked

    private void B_ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ClearMouseClicked
        //When clear is clicked
        B_ID.setText("");
        B_Qty.setText("");
      B_Med.setText("");


    }//GEN-LAST:event_B_ClearMouseClicked

    private void medicine_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicine_tableMouseClicked
        //       WHen you click a row in the medicine table
        DefaultTableModel model = (DefaultTableModel)medicine_table.getModel();
        int myIndex = medicine_table.getSelectedRow();
        B_Med.setText(model.getValueAt(myIndex, 1).toString());
       Qty =  Integer.parseInt(model.getValueAt(myIndex, 3).toString());
       BID =  Integer.parseInt(model.getValueAt(myIndex, 0).toString());
      price =Integer.parseInt(model.getValueAt(myIndex, 2).toString());
//       ;
    }//GEN-LAST:event_medicine_tableMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // When you click Agent:
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // When you click company
        new Company().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel9MouseClicked

    private void B_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_DateActionPerformed

    private void B_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_PrintActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // When you click medicine
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Add;
    private javax.swing.JButton B_Clear;
    private javax.swing.JTextField B_Date;
    private javax.swing.JTextField B_ID;
    private javax.swing.JTextField B_Med;
    private javax.swing.JButton B_Print;
    private javax.swing.JTextField B_Qty;
    private javax.swing.JTextArea Bill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable medicine_table;
    // End of variables declaration//GEN-END:variables
}
