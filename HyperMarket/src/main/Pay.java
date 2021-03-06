package main;

import java.util.*;
import java.util.stream.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Pay extends javax.swing.JFrame {

    /**
     * Creates new form Pay
     */
    private double totalPayment = 0;
    private String custID = "";
    private int counterNumber = 0;
    private int countItem = 0;

    public Pay(String custID, String custIC, String custName, double totalPayment, int counterNumber, int countItem, List listItem) {
        this.totalPayment = totalPayment;
        this.custID = custID;
        this.counterNumber = counterNumber;
        this.countItem = countItem;
        initComponents();
        payItemTable.setRowHeight(80);
        pack();
        setLocationRelativeTo(null);
        totalNeedPaylabel.setText("Total: RM " + totalPayment);
        
        //SHOW TO UI CUSTOMER DATA
        custICLabel.setText("Customer IC: " + custIC);
        custIDlabel.setText("Customer ID: " + custID);
        custNameLabel.setText("Customer Name: " + custName);
        
        //DISPLAY ITEM TO TABLE
        DefaultTableModel receiptTableModel = (DefaultTableModel) payItemTable.getModel();
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

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        totalNeedPaylabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        amountpayfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        custIDlabel = new javax.swing.JLabel();
        custICLabel = new javax.swing.JLabel();
        custNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        payItemTable = new javax.swing.JTable();
        paymenttitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PAYMENT");
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jPanel6.setBackground(new java.awt.Color(255, 204, 102));

        totalNeedPaylabel.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        totalNeedPaylabel.setText("Total: RM 0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(totalNeedPaylabel)
                .addGap(136, 136, 136))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(totalNeedPaylabel)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel4.setText("Amount:");

        amountpayfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setText("Pay");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amountpayfield, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountpayfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));

        custIDlabel.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        custIDlabel.setText("Customer ID:");

        custICLabel.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        custICLabel.setText("Customer IC:");

        custNameLabel.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        custNameLabel.setText("Customer Name:");

        payItemTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        payItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item name", "Item price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(payItemTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custIDlabel)
                    .addComponent(custICLabel)
                    .addComponent(custNameLabel))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(custIDlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custICLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custNameLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        paymenttitle.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        paymenttitle.setText("Pay");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addComponent(paymenttitle)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymenttitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        //PAY PROCESS HERE AND DISPLAY RECEIPT
        double amountpay = 0;
        try {
            amountpay = Double.parseDouble(amountpayfield.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select valid amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (amountpay < totalPayment) {
            JOptionPane.showMessageDialog(null, "Insufficient amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double balance = amountpay - totalPayment;

        //FIND CUSTOMER DATA IN QUEUE
        List<CustomerInformation> convertedCustList = null;
        if (counterNumber == 1) {
            convertedCustList = (List<CustomerInformation>) main.Main.getCounter1().stream().collect(Collectors.toList());
        } else if (counterNumber == 2) {
            convertedCustList = (List<CustomerInformation>) main.Main.getCounter2().stream().collect(Collectors.toList());
        } else if (counterNumber == 3) {
            convertedCustList = (List<CustomerInformation>) main.Main.getCounter3().stream().collect(Collectors.toList());
        }
        String custIC = "";
        String custName = "";
        for (Iterator iterator = convertedCustList.iterator(); iterator.hasNext();) {
            CustomerInformation nextCustomerData = (CustomerInformation) iterator.next();
            if (nextCustomerData.getCustID().equalsIgnoreCase(custID)) {
                custIC = nextCustomerData.getCustIC();
                custName = nextCustomerData.getCustName();
                break;
            }
        }

        //REMOVE CUSTOMER AND ITEM AFTER PAYMENT MADE AND ALSO SAVE LIST ITEM FOR RECEIPT DISPLAY
        Queue listItem = new LinkedList();
        for (int i = 0; i < countItem; i++) {
            if (counterNumber == 1) {
                CustomerInformation itemCurrent = (CustomerInformation) main.Main.getCounter1().peek();
                listItem.add(itemCurrent);
                main.Main.getCounter1().remove();
            } else if (counterNumber == 2) {
                CustomerInformation itemCurrent = (CustomerInformation) main.Main.getCounter2().peek();
                listItem.add(itemCurrent);
                main.Main.getCounter2().remove();
            } else if (counterNumber == 3) {
                CustomerInformation itemCurrent = (CustomerInformation) main.Main.getCounter3().peek();
                listItem.add(itemCurrent);
                main.Main.getCounter3().remove();
            }
        }

        //DISPLAY RECEIPT HERE
        Receipt receipt = new Receipt(custID, custIC, custName, totalPayment, amountpay, balance, listItem);
        receipt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountpayfield;
    private javax.swing.JLabel custICLabel;
    private javax.swing.JLabel custIDlabel;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable payItemTable;
    private javax.swing.JLabel paymenttitle;
    private javax.swing.JLabel totalNeedPaylabel;
    // End of variables declaration//GEN-END:variables

}
