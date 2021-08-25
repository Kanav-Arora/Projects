/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kanav
 */
public class Fee extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form Fee
     */
    public Fee() {
        initComponents();
        jButton1.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        
        int now = Calendar.getInstance().MONTH;
        int date = Calendar.getInstance().DATE;
        
         model = (DefaultTableModel) jTable1.getModel();
        if(new Transport().tport.equals("Yes"))
        {
          if(now<=6 && now>=4)
          { 
            if(date<10)
            {
              model.addRow(new Object[] {"April-June","22400","1500","0","Not Paid"});  
           model.addRow(new Object[] {"July-September","6540","1500","0",null}); 
            model.addRow(new Object[] {"October-December","6540","1500","0",null}); 
             model.addRow(new Object[] {"January-March","6540+2000","1500","0",null});
             jButton1.setVisible(true);
          
            }
            else
            {
               model.addRow(new Object[] {"April-June","22400","1500","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","1500","0",null}); 
            model.addRow(new Object[] {"October-December","6540","1500","0",null}); 
             model.addRow(new Object[] {"January-March","6540+2000","1500","0",null}); 
            }
          }
          else if(now<=9 && now>=7)
          {
            if(date<10)
            {
              model.addRow(new Object[] {"April-June","22400","1500","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","1500","0","Not Paid"}); 
            model.addRow(new Object[] {"October-December","6540","1500","0",null}); 
             model.addRow(new Object[] {"January-March","6540+2000","1500","0",null});
             jButton4.setVisible(true);
            }
            else
            {
                model.addRow(new Object[] {"April-June","22400","1500","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","1500","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","1500","0",null}); 
             model.addRow(new Object[] {"January-March","6540+2000","1500","0",null});
            }
            }
          else if(now<=12 && now>=10)
          {
            if(date<10)
            {
              model.addRow(new Object[] {"April-June","22400","1500","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","1500","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","1500","0","Not Paid"}); 
             model.addRow(new Object[] {"January-March","6540+2000","1500","0",null});
             jButton5.setVisible(true);
          }
            else
            {
                model.addRow(new Object[] {"April-June","22400","1500","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","1500","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","1500","0","Paid"}); 
             model.addRow(new Object[] {"January-March","6540+2000","1500","0",null});   
            }
          }
          else if(now<=3 && now>=1)
          {
             if(date<10)
             {
              model.addRow(new Object[] {"April-June","22400","1500","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","1500","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","1500","0","Paid"}); 
             model.addRow(new Object[] {"January-March","6540+2000","1500","0","Not Paid"});   
             jButton6.setVisible(true);
          }
          else
             {
                model.addRow(new Object[] {"April-June","22400","1500","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","1500","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","1500","0","Paid"}); 
             model.addRow(new Object[] {"January-March","6540+2000","1500","0","Paid"});  
             }}
          
        }
        
        
        
        
        
        
        
        else  if(new Transport().tport.equals("No"))
        {
           if(now<=6 && now>=4)
          {
            if(date<10)
            {
              model.addRow(new Object[] {"April-June","22400","0","0","Not Paid"});  
           model.addRow(new Object[] {"July-September","6540","0","0",null}); 
            model.addRow(new Object[] {"October-December","6540","0","0",null}); 
             model.addRow(new Object[] {"January-March","6540+2000","0","0",null}); 
             jButton1.setVisible(true);
            }
            else
            {
                model.addRow(new Object[] {"April-June","22400","0","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","0","0",null}); 
            model.addRow(new Object[] {"October-December","6540","0","0",null}); 
             model.addRow(new Object[] {"January-March","6540+2000","0","0",null}); 
            }
          }
           
           
           
           else if(now<=9 && now>=7)
          {
                       if(date<10)
            {
              model.addRow(new Object[] {"April-June","22400","0","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","0","0","Not Paid"}); 
            model.addRow(new Object[] {"October-December","6540","0","0",null}); 
             model.addRow(new Object[] {"January-March","6540+2000","0","0",null}); 
             jButton4.setVisible(true);
            }
            else
            {
                model.addRow(new Object[] {"April-June","22400","0","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","0","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","0","0",null}); 
             model.addRow(new Object[] {"January-March","6540+2000","0","0",null}); 
            }
          }
           
           
           
           
           
           
           else if(now<=12 && now>=10)
          {
                 if(date<10)
            {
              model.addRow(new Object[] {"April-June","22400","0","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","0","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","0","0","Not Paid"}); 
             model.addRow(new Object[] {"January-March","6540+2000","0","0",null}); 
             jButton5.setVisible(true);
            }
            else
            {
                model.addRow(new Object[] {"April-June","22400","0","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","0","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","0","0","Paid"}); 
             model.addRow(new Object[] {"January-March","6540+2000","0","0",null}); 
            }
          }
           
           
           
           
           else if(now<=3 && now>=1)
          {
              if(date<10)
            {
              model.addRow(new Object[] {"April-June","22400","0","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","0","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","0","0","Paid"}); 
             model.addRow(new Object[] {"January-March","6540+2000","0","0","Not Paid"}); 
             jButton6.setVisible(true);
            }
            else
            {
                model.addRow(new Object[] {"April-June","22400","0","0","Paid"});  
           model.addRow(new Object[] {"July-September","6540","0","0","Paid"}); 
            model.addRow(new Object[] {"October-December","6540","0","0","Paid"}); 
             model.addRow(new Object[] {"January-March","6540+2000","0","0","Paid"}); 
            }
          }
           
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(181, 226, 226));

        jPanel1.setBackground(new java.awt.Color(181, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true), "B.C.M ARYA MODEL SR. SEC SCHOOL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 20))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 17)); // NOI18N
        jLabel1.setText("Fee Record");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable1.setBackground(new java.awt.Color(102, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quarter", "Fee", "Van", "Fine", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(26);
        jScrollPane1.setViewportView(jTable1);

        jButton6.setText("Pay Now");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Pay Now");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("Pay Now");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Pay Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-26.jpg"))); // NOI18N
        jLabel2.setToolTipText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-refresh-24.jpg"))); // NOI18N
        jLabel3.setToolTipText("Refresh");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FeePay1().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FeePay23().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FeePay23().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FeePay4().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
           this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new StudentPortal().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
