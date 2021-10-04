
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;

import javax.swing.JTextField;

public class customerY extends javax.swing.JFrame {

   
    public customerY() {
         initComponents();
         setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    
    public void clear()
    {
        txt_cn.setText("");
        txt_add.setText("");
        txt_cono.setText("");
        txt_name.setText("");
        txt_pno.setText("");
        txt_qua.setText("");
        txt_amt.setText("");
        txt_total.setText("");
        txt_paid.setText("");
        lbl_return.setText("");
    }

    /*private void check_qty()
    {
        String name=txt_name.getText();
        
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        conn = connDB.connDB();
        try {
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customerY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
 
    public void Update_bill_table()
  {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        conn = connDB.connDB();
        try {
            /*
            update table
             */
            String sql = "select * from customer";
            //String sql="select * from Billing order by Bill_No";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            // rs=pst.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Exception 8 " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();

                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cn = new javax.swing.JTextField();
        txt_add = new javax.swing.JTextField();
        txt_cono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btn_bg = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_pno = new javax.swing.JTextField();
        txt_qua = new javax.swing.JTextField();
        txt_amt = new javax.swing.JTextField();
        date_chooser = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txt_paid = new javax.swing.JTextField();
        lbl_return = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CUSTOMER   PAGE");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        jLabel1.setText("CUSTOMER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 440, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Customer Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Customer Co No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, 30));
        getContentPane().add(txt_cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 240, 30));
        getContentPane().add(txt_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 240, 30));
        getContentPane().add(txt_cono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 240, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Total Amount ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 130, 30));

        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 240, 30));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 440, 450));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_bg.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_bg.setText("BILL GENERATE");
        btn_bg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bgActionPerformed(evt);
            }
        });
        jPanel2.add(btn_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 160, -1));

        btn_clear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 80, -1));

        btn_print.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_print.setText("PRINT");
        btn_print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel2.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 80, -1));

        btn_home.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_home.setText("HOME");
        btn_home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 90, -1));

        btn_save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_save.setText("SAVE");
        btn_save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 630, 750, 60));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Product Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 130, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Quantity");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 80, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Amount *");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, 30));

        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nameKeyPressed(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 240, 30));
        getContentPane().add(txt_pno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 240, 30));
        getContentPane().add(txt_qua, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 240, 30));

        txt_amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amtActionPerformed(evt);
            }
        });
        txt_amt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_amtKeyPressed(evt);
            }
        });
        getContentPane().add(txt_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 240, 30));

        date_chooser.setDateFormatString("MMM,d, yyyy");
        getContentPane().add(date_chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 230, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Purchase Date");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, 30));

        txt_paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_paidKeyPressed(evt);
            }
        });
        getContentPane().add(txt_paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 150, 30));

        lbl_return.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_return.setText("0.00");
        getContentPane().add(lbl_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, 120, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, 30, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/497320.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
       
    }//GEN-LAST:event_txt_totalActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
       
        homeY home=new homeY();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private JFrame frame;
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        
        clear();
        area.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
       
          try{
        area.print();
        }
        catch(PrinterException e)
        {}
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_bgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bgActionPerformed
            
        try{ 
            area.setText("***************************************************\n");
            area.setText(area.getText()+"**                 BILL RECEIPT                  **\n");
            area.setText(area.getText()+"HERO BIKE SHOWROOM  \n");
            area.setText(area.getText()+"PUNE  \n");
            area.setText(area.getText()+"***************************************************\n");
           
              
            area.setText(area.getText()+""+date_chooser.getDate()+"\n\n");
            area.setText(area.getText()+"Customer Name      :-"+txt_cn.getText()+"\n\n");
            area.setText(area.getText()+"Customer Address   :-"+txt_add.getText()+"\n\n");
            area.setText(area.getText()+"Customer Mobile No :-"+txt_cono.getText()+"\n\n");  
            area.setText(area.getText()+"Product name       :-"+txt_name.getText()+"\n\n"); 
            area.setText(area.getText()+"Number         :-"+txt_pno.getText()+"\n\n");
            area.setText(area.getText()+"Quantity           :-"+txt_qua.getText()+"\n\n");
            area.setText(area.getText()+"Amount             :-"+txt_amt.getText()+"\n\n");  
            area.setText(area.getText()+"***************************************************\n");
            area.setText(area.getText()+"Total Amount       :-"+txt_total.getText()+"\n\n"); 
            area.setText(area.getText()+"****************THANK YOU! COME AGAIN!!*************\n");
            }
                catch(Exception e)
                {}
    }//GEN-LAST:event_btn_bgActionPerformed

    private void txt_amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amtActionPerformed

    }//GEN-LAST:event_txt_amtActionPerformed

    private void txt_amtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amtKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            txt_total.requestFocus();
        int fno,sno,mul;
        fno=Integer.parseInt(txt_qua.getText());
        sno=Integer.parseInt(txt_amt.getText());
        mul=fno*sno;
        txt_total.setText(""+mul);
        }
    }//GEN-LAST:event_txt_amtKeyPressed

    private void txt_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyPressed
        
        /*if(evt.getKeyCode()==KeyEvent.VK_ENTER);
        {
            String name=txt_name.getText();
            
            try{ 
            conn=connDB.connDB();
            pst=conn.prepareStatement("select * from stock where NAME=?");
            pst.setString(1,name);
            rs=pst.executeQuery();
            
            if(rs.next()==false)
            {
               JOptionPane.showMessageDialog(this,"Name not found");
            }
            else
            { 
               String pno=rs.getString("PRODUCT_NO");
               String pamt=rs.getString("AMOUNT");
              
               txt_pno.setText(pno.trim());
               txt_amt.setText(pamt.trim());
             
            }
            
        }
             catch (SQLException ex) {
                Logger.getLogger(customerY.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }*/
    }//GEN-LAST:event_txt_nameKeyPressed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        conn = connDB.connDB();
        if (txt_cn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the Item name !!");
        } else if (txt_add.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the Address !!");
        } else if (txt_cono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the Number !!");
        } else if (txt_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the product name !!");
        } else if (txt_pno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the product no !!");
        } else if (txt_qua.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the Quantity !!");
        } else if (txt_amt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the amount !!");
        } else if (txt_total.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the total amount !!");
        } 
        else {
            try {
                String sql = "Insert into customer values (null,?,?,?,?,?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_cn.getText());
                pst.setString(2, txt_add.getText());
                pst.setString(3, txt_cono.getText());
                pst.setString(4, txt_name.getText());
                pst.setString(5, txt_pno.getText());
                //int quan= Integer.parseInt(txt_qua.getText());
                pst.setString(6, txt_qua.getText());
                pst.setString(7, txt_amt.getText());
                pst.setString(8, txt_total.getText());
                pst.setString(9,((JTextField)date_chooser.getDateEditor().getUiComponent()).getText());
               

                pst.execute();
                JOptionPane.showMessageDialog(null, "Saved");
                Update_bill_table();
               

            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error Occured :" + ex);
            } finally {
                try {
                    if (rs != null) {
                        rs.close();

                    }
                    if (pst != null) {
                        pst.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
      

    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_paidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paidKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        lbl_return.requestFocus();
        int fno,sno,sub;
        fno=Integer.parseInt(txt_total.getText());
        sno=Integer.parseInt(txt_paid.getText());
        sub=sno-fno;
        lbl_return.setText(""+sub);
        }       

    }//GEN-LAST:event_txt_paidKeyPressed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new customerY().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btn_bg;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_return;
    private javax.swing.JTextField txt_add;
    private javax.swing.JTextField txt_amt;
    private javax.swing.JTextField txt_cn;
    private javax.swing.JTextField txt_cono;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_paid;
    private javax.swing.JTextField txt_pno;
    private javax.swing.JTextField txt_qua;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    private SimpleDateFormat format(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
