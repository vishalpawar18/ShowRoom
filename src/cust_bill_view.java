
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class cust_bill_view extends javax.swing.JFrame {

  
    public cust_bill_view() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cn = new javax.swing.JTextField();
        txt_add = new javax.swing.JTextField();
        txt_cono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_pno = new javax.swing.JTextField();
        txt_qua = new javax.swing.JTextField();
        txt_amt = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        btn_gen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        btn_clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        cb_sel = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        jLabel1.setText("CUSTOMER BILL VIEW");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 842, 60));
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 300, 40));

        btn_search.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btn_search.setText("Search");
        btn_search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 80, 40));

        btn_home.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_home.setText("HOME");
        btn_home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 630, 90, -1));

        btn_print.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_print.setText("PRINT");
        btn_print.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        getContentPane().add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 80, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Customer Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Customer Co No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, 30));
        getContentPane().add(txt_cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 240, 30));
        getContentPane().add(txt_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 240, 30));
        getContentPane().add(txt_cono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 240, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Product Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 130, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Quantity");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 90, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, 30));
        getContentPane().add(txt_pno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 240, 30));
        getContentPane().add(txt_qua, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 240, 30));

        txt_amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amtActionPerformed(evt);
            }
        });
        getContentPane().add(txt_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 240, 30));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 240, 30));

        btn_gen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_gen.setText("PRINT GENERATE");
        btn_gen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 630, 170, -1));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 430, 430));

        btn_clear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 100, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Total Amount");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 130, 30));

        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 240, 30));

        cb_sel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "name", "id" }));
        getContentPane().add(cb_sel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 80, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Date");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));
        getContentPane().add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 240, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/497320.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    }
    private void txt_amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amtActionPerformed

    }//GEN-LAST:event_txt_amtActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed

    }//GEN-LAST:event_txt_totalActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        homeY home = new homeY();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_homeActionPerformed
    private JFrame frame;
    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        try{
        area.print();
        }
        catch(PrinterException e)
        {}
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genActionPerformed
        
            area.setText("***************************************************\n");
            area.setText(area.getText()+"**                 BILL RECEIPT                  **\n");
            area.setText(area.getText()+"HERO BIKE SHOWROOM\n");
            area.setText(area.getText()+"PUNE  \n");
            area.setText(area.getText()+"***************************************************\n");
           
                
            area.setText(area.getText()+""+txt_date.getText()+"\n\n");  
            area.setText(area.getText()+"Customer Name      :-"+txt_cn.getText()+"\n\n");
            area.setText(area.getText()+"Customer Address   :-"+txt_add.getText()+"\n\n");
            area.setText(area.getText()+"Customer Mobile No :-"+txt_cono.getText()+"\n\n");  
            area.setText(area.getText()+"Product name       :-"+txt_name.getText()+"\n\n"); 
            area.setText(area.getText()+"Number       :-"+txt_pno.getText()+"\n\n");
            area.setText(area.getText()+"Quantity           :-"+txt_qua.getText()+"\n\n");
            area.setText(area.getText()+"Amount             :-"+txt_amt.getText()+"\n\n");
            area.setText(area.getText()+"***************************************************\n");
            area.setText(area.getText()+"Total Amount       :-"+txt_total.getText()+"\n\n"); 
            area.setText(area.getText()+"***************************************************\n");
    }//GEN-LAST:event_btn_genActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       clear();
       area.setText("");
       txt_date.setText("");
       txt_search.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
       
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn= connDB.connDB();
        try
        {
            switch (cb_sel.getSelectedItem().toString()) {
                case "name":
                {
                    String sql="select * from customer where NAME=?";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_search.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {
                        String a=rs.getString("NAME");
                        txt_cn.setText(a);
                        String b=rs.getString("ADDRESS");
                        txt_add.setText(b);
                        String c=rs.getString("MOBILE_NO");
                        txt_cono.setText(c);
                        String d=rs.getString("PRO_NAME");
                        txt_name.setText(d);
                        String e=rs.getString("PRO_NO");
                        txt_pno.setText(e);
                        String f=rs.getString("QUANTITY");
                        txt_qua.setText(f);
                        String g=rs.getString("AMOUNT");
                        txt_amt.setText(g);
                        String h=rs.getString("TOTAL_AMT");
                        txt_total.setText(h);
                        String i=rs.getString("date");
                        txt_date.setText(i);
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Sorry No Result");
                    } break;
                }
                case "id":
                {
                    String sql="select * from customer where ID=?";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_search.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {
                        String a=rs.getString("NAME");
                        txt_cn.setText(a);
                        String b=rs.getString("ADDRESS");
                        txt_add.setText(b);
                        String c=rs.getString("MOBILE_NO");
                        txt_cono.setText(c);
                        String d=rs.getString("PRO_NAME");
                        txt_name.setText(d);
                        String e=rs.getString("PRO_NO");
                        txt_pno.setText(e);
                        String f=rs.getString("QUANTITY");
                        txt_qua.setText(f);
                        String g=rs.getString("AMOUNT");
                        txt_amt.setText(g);
                        String h=rs.getString("TOTAL_AMT");
                        txt_total.setText(h);
                        String i=rs.getString("date");
                        txt_date.setText(i);
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

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cust_bill_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_gen;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cb_sel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_add;
    private javax.swing.JTextField txt_amt;
    private javax.swing.JTextField txt_cn;
    private javax.swing.JTextField txt_cono;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pno;
    private javax.swing.JTextField txt_qua;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
