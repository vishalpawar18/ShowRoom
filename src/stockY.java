
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class stockY extends javax.swing.JFrame {

    public stockY() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Update_stock_table();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_no = new javax.swing.JTextField();
        txt_qua = new javax.swing.JTextField();
        txt_amt = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_stock = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        cb_select = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        jLabel1.setText("STOCK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 20, 270, 52));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText(" Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("Amount");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 51));
        jLabel6.setText("Warenty Days");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 270, 30));
        getContentPane().add(txt_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 270, 30));
        getContentPane().add(txt_qua, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 270, 30));
        getContentPane().add(txt_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 270, 30));
        getContentPane().add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 270, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_insert.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_insert.setText("INSERT");
        btn_insert.setBorder(null);
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });
        jPanel1.add(btn_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        btn_update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.setBorder(null);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 30));

        btn_delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setBorder(null);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 90, 30));

        btn_home.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_home.setText("HOME");
        btn_home.setBorder(null);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 100, 30));

        btn_exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_exit.setText("EXIT");
        btn_exit.setBorder(null);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 100, 30));

        CLEAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CLEAR.setText("CLEAR");
        CLEAR.setBorder(null);
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        jPanel1.add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 800, 70));

        tbl_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_stockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_stock);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 570, 410));
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 270, 50));

        btn_search.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 90, 50));

        cb_select.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        cb_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Name", "Pro_No" }));
        getContentPane().add(cb_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 80, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/497320.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed

        homeY home = new homeY();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    public void clear() {
        txt_name.setText("");
        txt_no.setText("");
        txt_qua.setText("");
        txt_amt.setText("");
        txt_date.setText("");

    }

    public void Update_stock_table() {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        conn = connDB.connDB();
        try {
            /*
            update table
             */
            String sql = "select * from stock";
            //String sql="select * from Billing order by Bill_No";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbl_stock.setModel(DbUtils.resultSetToTableModel(rs));
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
    private JFrame frame;
    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if u want to Exit", "Rudra Canteen System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        conn = connDB.connDB();

        if (txt_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the Item name !!");
        } else if (txt_no.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the Number !!");
        } else if (txt_qua.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the Quantity !!");
        } else if (txt_amt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the Mobile Amount !!");
        } else if (txt_date.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please Enter Value into the Date !!");
        } else {
            try {
                String sql = "Insert into stock values (NULL,?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_name.getText());
                pst.setString(2, txt_no.getText());
                pst.setString(3, txt_qua.getText());
                pst.setString(4, txt_amt.getText());
                pst.setString(5, txt_date.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Saved");
                Update_stock_table();
                clear();

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
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        conn = connDB.connDB();

        String name = txt_name.getText();
        String no = txt_no.getText();
        String qua = txt_qua.getText();
        String amt = txt_amt.getText();
        String date = txt_date.getText();
        try {
            int row=tbl_stock.getSelectedRow();
            String table_click=(tbl_stock.getModel().getValueAt(row, 0).toString());

            String updatesql = "update stock set NAME='" + name + "',PRODUCT_NO='" + no
                    + "', QUANTITY='" + qua + "',AMOUNT='" + amt + "',WARENTY_DATE='"+date+"' where ID='" + table_click + "'";
            pst = conn.prepareStatement(updatesql);
            pst.execute();
            Update_stock_table();
            JOptionPane.showMessageDialog(null, "Updated");
            clear();
           
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Please Check Following Error " + ex);

        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Please Select Value from Table first,\nOtherwise Error would flag !!");
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

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        conn = connDB.connDB();
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            try {

                String sql = "delete from stock where ID=?";
                int row = tbl_stock.getSelectedRow();
                String table_click = (tbl_stock.getModel().getValueAt(row, 0).toString());
                pst = conn.prepareStatement(sql);
                pst.setString(1, table_click);

                pst.execute();
                Update_stock_table();
                JOptionPane.showMessageDialog(null, "Deleted");
                clear();

            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Please Check Following Error " + ex);
            } catch (ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "Please Select Value from Table first,\nOtherwise Error would flag !!");
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

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tbl_stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_stockMouseClicked
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        conn = connDB.connDB();
        try {
            int row = tbl_stock.getSelectedRow();
            String table_click = (tbl_stock.getModel().getValueAt(row, 0).toString());
            String sql = "select * from stock where ID='" + table_click + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("name");
                txt_name.setText(add1);
                String add2 = rs.getString("product_no");
                txt_no.setText(add2);
                String add3 = rs.getString("quantity");
                txt_qua.setText(add3);
                String add4 = rs.getString("amount");
                txt_amt.setText(add4);
                String add5 = rs.getString("warenty_date");
                txt_date.setText(add5);
                //name	type  address  mobile_no  salary
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Check Following Error " + ex);
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

    }//GEN-LAST:event_tbl_stockMouseClicked

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
       clear();
    }//GEN-LAST:event_CLEARActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=connDB.connDB();
        try
        {
            switch (cb_select.getSelectedItem().toString()) {
                case "Name":
                {
                    String sql="select * from stock where Name=?";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_search.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {
                        String a=rs.getString("NAME");
                        txt_name.setText(a);
                        String b=rs.getString("PRODUCT_NO");
                        txt_no.setText(b);
                        String c=rs.getString("QUANTITY");
                        txt_qua.setText(c);
                        String d=rs.getString("AMOUNT");
                        txt_amt.setText(d);
                        String e=rs.getString("WARENTY_DATE");
                        txt_date.setText(e);
                      
                       
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Sorry No Result");
                    } break;
                }
                case "Pro_No":
                {
                    String sql="select * from stock where PRODUCT_NO=?";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_search.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {
                        String a=rs.getString("NAME");
                        txt_name.setText(a);
                        String b=rs.getString("Product_no");
                        txt_no.setText(b);
                        String c=rs.getString("Quantity");
                        txt_qua.setText(c);
                        String d=rs.getString("Amount");
                        txt_amt.setText(d);
                        String e=rs.getString("Warenty_Date");
                        txt_date.setText(e);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Sorry No Result");
                    } break;
                }
                default:
                JOptionPane.showMessageDialog(null, "Please Click on Select Field !");
                break;
            }
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Please Click on Select Field !");
        }
        finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();

                }
                if(conn!=null)
                {
                    conn.close();
                }
                if(pst!=null)
                {
                    pst.close();
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Connection not has been closed yet");
            }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stockY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_select;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_stock;
    private javax.swing.JTextField txt_amt;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_no;
    private javax.swing.JTextField txt_qua;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
