/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package admin;
    

    import database.koneksi;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import java.text.SimpleDateFormat;
    import javax.swing.JOptionPane;
    import java.sql.DriverManager;
/**
 *
 * @author Yoga Asta
 */
public class regisadmin extends javax.swing.JFrame {

private Connection conn = new koneksi().getkoneksi();

protected void aktif(){
    input_nama.setEnabled(true);
    isi_password.setEnabled(true);
    input_nama.requestFocus();
}
protected void kosong(){
    input_nama.setText("");
    isi_password.setText("");
}

public regisadmin(){
    initComponents();
    
}

   
    
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        tbl_exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        opsi_login = new javax.swing.JLabel();
        create_password = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        tombol_registrasi = new javax.swing.JButton();
        isi_password = new javax.swing.JPasswordField();
        ulang = new javax.swing.JLabel();
        input_ulang_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        Judul = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1170, 662));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1170, 662));
        getContentPane().setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setLayout(null);

        tbl_exit.setBackground(new java.awt.Color(0, 0, 0));
        tbl_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_exit.setText("X");
        tbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_exitMouseClicked(evt);
            }
        });
        kGradientPanel1.add(tbl_exit);
        tbl_exit.setBounds(1137, 0, 33, 35);
        tbl_exit.getAccessibleContext().setAccessibleName("jLabel1\n");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel1.setLayout(null);

        opsi_login.setForeground(new java.awt.Color(255, 0, 0));
        opsi_login.setText("APAKAH ANDA TELAH MENJADI ADMIN??");
        opsi_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opsi_loginMouseClicked(evt);
            }
        });
        jPanel1.add(opsi_login);
        opsi_login.setBounds(270, 380, 258, 26);

        create_password.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        create_password.setForeground(new java.awt.Color(204, 204, 204));
        create_password.setText("BUAT KATA SANDI");
        jPanel1.add(create_password);
        create_password.setBounds(130, 220, 159, 20);

        Nama.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        Nama.setForeground(new java.awt.Color(204, 204, 204));
        Nama.setText("NAMA");
        jPanel1.add(Nama);
        Nama.setBounds(130, 90, 43, 18);

        input_nama.setBackground(new java.awt.Color(0, 0, 0));
        input_nama.setForeground(new java.awt.Color(255, 255, 255));
        input_nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        input_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namaActionPerformed(evt);
            }
        });
        jPanel1.add(input_nama);
        input_nama.setBounds(290, 90, 278, 18);

        tombol_registrasi.setBackground(new java.awt.Color(255, 255, 255));
        tombol_registrasi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tombol_registrasi.setText("REGISTER");
        tombol_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_registrasiActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_registrasi);
        tombol_registrasi.setBounds(350, 340, 93, 25);

        isi_password.setBackground(new java.awt.Color(0, 0, 0));
        isi_password.setForeground(new java.awt.Color(255, 255, 255));
        isi_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        isi_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isi_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(isi_password);
        isi_password.setBounds(290, 220, 275, 18);

        ulang.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        ulang.setForeground(new java.awt.Color(204, 204, 204));
        ulang.setText("ULANGI KATA SANDI");
        jPanel1.add(ulang);
        ulang.setBounds(130, 290, 131, 18);

        input_ulang_pass.setBackground(new java.awt.Color(0, 0, 0));
        input_ulang_pass.setForeground(new java.awt.Color(255, 255, 255));
        input_ulang_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(input_ulang_pass);
        input_ulang_pass.setBounds(290, 270, 278, 32);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel1.setEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(499, 333, 267, 16);

        email.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setText("EMAIL");
        jPanel1.add(email);
        email.setBounds(130, 150, 60, 20);

        input_email.setBackground(new java.awt.Color(0, 0, 0));
        input_email.setForeground(new java.awt.Color(255, 255, 255));
        input_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(input_email);
        input_email.setBounds(290, 140, 280, 30);

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(240, 180, 750, 430);

        Judul.setBackground(new java.awt.Color(0, 0, 0));
        Judul.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        Judul.setText("=REGISTRASI=");
        kGradientPanel1.add(Judul);
        Judul.setBounds(540, 130, 170, 32);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/registered.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(570, 20, 100, 110);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1170, 660);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaActionPerformed
        // TODO add your handling code here:
        /*String sql = "insert into tb_user values(?)";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.setString(1, input_nama.getText());
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Registrasi Anda Gagal" +e);
            }*/
    }//GEN-LAST:event_input_namaActionPerformed

    private void tombol_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_registrasiActionPerformed
        // TODO add your handling code here:
        String sql = "insert into tb_admin values(?,?,?)";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.setString(1, input_nama.getText());
                stat.setString(2, isi_password.getText());
                stat.setString(3, input_email.getText());
                
                
                
                if (isi_password.getText().equals(input_ulang_pass.getText())){
                     if(input_nama.getText().equals("") || input_nama.getText().equals("") || input_nama.getText().equals("")
                        || input_ulang_pass.getText().equals("")){                
                        JOptionPane.showMessageDialog(this, "Tolong Masukan Data Anda");
                    }else{
                    Connection konekDatabase = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/db_admsekolah", "root", "");
               
                JOptionPane.showMessageDialog(this,"Register Berhasil","Notifikasi",JOptionPane.INFORMATION_MESSAGE);
                stat.executeUpdate();
                kosong();
                jLabel1.setText("");
                
                 
                loginadmin lg= new loginadmin();
                lg.setVisible(true);
                lg.pack();
                lg.setLocationRelativeTo(null);
                lg.setDefaultCloseOperation(regisadmin.EXIT_ON_CLOSE);
                this.dispose();
                     }                
                }else{
                    jLabel1.setText("Password yang anda masukkan salah !" );
                }
               
                 input_nama.requestFocus();
             
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Registrasi Anda Gagal" );
            }
       
      
        
        
    }//GEN-LAST:event_tombol_registrasiActionPerformed

    private void tbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbl_exitMouseClicked

    private void opsi_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opsi_loginMouseClicked
        // TODO add your handling code here:
        loginadmin framelogin = new loginadmin();
        framelogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_opsi_loginMouseClicked

    private void isi_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isi_passwordActionPerformed
        // TODO add your handling code here:
        /*String sql = "insert into tb_user values(?)";
            try{
                 PreparedStatement stat = conn.prepareStatement(sql);
                 stat.setString(4, isi_password.getText());
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Registrasi Anda Gagal" +e);
            } */
    }//GEN-LAST:event_isi_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(regisadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regisadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regisadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regisadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regisadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel create_password;
    private javax.swing.JLabel email;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nama;
    private javax.swing.JPasswordField input_ulang_pass;
    private javax.swing.JPasswordField isi_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel opsi_login;
    private javax.swing.JLabel tbl_exit;
    private javax.swing.JButton tombol_registrasi;
    private javax.swing.JLabel ulang;
    // End of variables declaration//GEN-END:variables
}
