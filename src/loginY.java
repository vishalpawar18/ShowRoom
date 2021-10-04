
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class loginY extends javax.swing.JFrame {

  
    public loginY() {
        initComponents();
         setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_can = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        txt_ui = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("LOGIN   PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 270, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jLabel3.setAutoscrolls(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 40));

        btn_login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_login.setText("LOGIN");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 80, 30));

        btn_can.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_can.setText("CANCEL");
        btn_can.setBorder(null);
        btn_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canActionPerformed(evt);
            }
        });
        getContentPane().add(btn_can, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 90, 30));

        btn_exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_exit.setText("EXIT");
        btn_exit.setBorder(null);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 80, 30));
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 230, 30));
        getContentPane().add(txt_ui, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 230, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/613763.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -390, -1, 1220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canActionPerformed
       
        txt_ui.setText("");
        txt_pass.setText("");
        
    }//GEN-LAST:event_btn_canActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
          try{
            String uname=txt_ui.getText();
            String pass=txt_pass.getText();
            
            if(uname.equals("show") && pass.equals("room"))
            {
                 JOptionPane.showMessageDialog(null,"you are succesfully logined");
                   homeY home=new homeY();
                    home.setVisible(true);
                    dispose();
            }
            else
            {
                 JOptionPane.showMessageDialog(null,"invalid userid or password");
                 
            }

            txt_ui.setText("");
            txt_pass.setText("");
          }
        catch(Exception e){}
    }//GEN-LAST:event_btn_loginActionPerformed
        
    private JFrame frame;
    
    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
       
         frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if u want to Exit","Rudra Canteen System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_can;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_ui;
    // End of variables declaration//GEN-END:variables
}
