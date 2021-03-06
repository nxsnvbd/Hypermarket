package main;
import java.util.*;
import javax.swing.table.*;

public class Receipt extends javax.swing.JFrame {

    public Receipt(String custID, String custIC, String custName, double totalAmount, double paidAmount, double balance, Queue listItem) {
        initComponents();
        itemReceiptTable.setRowHeight(80);
        pack();
        setLocationRelativeTo(null);

        //DISPLAY ALL DATA
        custNamelabel.setText(custName);
        custIDlabel.setText(custID);
        custIClabel.setText(custIC);
        paymenttitle.setText("Receipt " + custID);
        totalAmountlabel.setText("Subtotal: RM " + totalAmount);
        paidlabel.setText("Total Paid: RM " + paidAmount);
        balancelabel.setText("Balance: RM " + balance);

        //DISPLAY ITEM TO TABLE
        DefaultTableModel receiptTableModel = (DefaultTableModel) itemReceiptTable.getModel();
        for (Iterator iterator = listItem.iterator(); iterator.hasNext();) {
            CustomerInformation customeritemdata = (CustomerInformation) iterator.next();
            receiptTableModel.addRow(new Object[]{customeritemdata.getItemName(), "RM " + customeritemdata.getitemPrice(), customeritemdata.getDatePurchase()});
        }
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
        jPanel3 = new javax.swing.JPanel();
        custNamelabel = new javax.swing.JLabel();
        custIClabel = new javax.swing.JLabel();
        custIDlabel = new javax.swing.JLabel();
        paymenttitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemReceiptTable = new javax.swing.JTable();
        totalAmountlabel = new javax.swing.JLabel();
        paidlabel = new javax.swing.JLabel();
        balancelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RECEIPT");

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custNamelabel.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        custNamelabel.setText("Customer Name: ");
        jPanel3.add(custNamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 20));

        custIClabel.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        custIClabel.setText("Customer IC:");
        jPanel3.add(custIClabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        custIDlabel.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        custIDlabel.setText("Customer ID:");
        jPanel3.add(custIDlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        paymenttitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paymenttitle.setText("Receipt - Customer");
        jPanel3.add(paymenttitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        itemReceiptTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemReceiptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price", "Date Purchased"
            }
        ));
        jScrollPane1.setViewportView(itemReceiptTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 690, 420));

        totalAmountlabel.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        totalAmountlabel.setText("Subtotal: ");
        jPanel3.add(totalAmountlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

        paidlabel.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        paidlabel.setText("Total Paid: ");
        jPanel3.add(paidlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, -1, -1));

        balancelabel.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        balancelabel.setText("Balance:");
        jPanel3.add(balancelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 680, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balancelabel;
    private javax.swing.JLabel custIClabel;
    private javax.swing.JLabel custIDlabel;
    private javax.swing.JLabel custNamelabel;
    private javax.swing.JTable itemReceiptTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel paidlabel;
    private javax.swing.JLabel paymenttitle;
    private javax.swing.JLabel totalAmountlabel;
    // End of variables declaration//GEN-END:variables

}
