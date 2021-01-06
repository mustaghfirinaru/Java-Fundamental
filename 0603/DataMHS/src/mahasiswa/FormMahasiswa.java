/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows
 */
public class FormMahasiswa extends javax.swing.JFrame {

    private void kosongkan_form(){
        TFNIM.setEditable(true);
        TFNIM.setText(null);
        TFNama.setText(null);
        TFTglLahir.setText(null);
        TFAlamat.setText(null);
        Jurusan.setSelectedItem(this);
        RBLaki.setSelected(false);
        RBPerempuan.setSelected(false);
    }
    
    private void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIM");
        model.addColumn("Nama Mahasiswa");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Jurusan");
        model.addColumn("Alamat");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM mahasiswa";
            java.sql.Connection conn = (Connection)Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            
            TabelMahasiswa.setModel(model);
            
        }catch(SQLException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
    /**
     * Creates new form FormMahasiswa
     */
    public FormMahasiswa() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ButtonInput = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        TFNIM = new javax.swing.JTextField();
        TFNama = new javax.swing.JTextField();
        TFTglLahir = new javax.swing.JTextField();
        RBLaki = new javax.swing.JRadioButton();
        RBPerempuan = new javax.swing.JRadioButton();
        Jurusan = new javax.swing.JComboBox<>();
        TFAlamat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelMahasiswa = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Data Mahasiswa");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Data Mahasiswa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NIM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 56, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nama Mahasiswa");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 102, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tanggal Lahir");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 148, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 195, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Jurusan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 243, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Alamat");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 289, -1, -1));

        ButtonInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonInput.setText("Input");
        ButtonInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInputActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 332, -1, -1));

        ButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonUpdate.setText("Update");
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 332, -1, -1));

        ButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonDelete.setText("Delete");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 332, -1, -1));

        ButtonSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonSave.setText("Save");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 332, -1, -1));

        ButtonExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonExit.setText("Exit");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 332, -1, -1));

        TFNIM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(TFNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 53, 451, -1));

        TFNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(TFNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 99, 451, -1));

        TFTglLahir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(TFTglLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 451, -1));

        RBLaki.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RBLaki.setText("Laki-Laki");
        RBLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBLakiActionPerformed(evt);
            }
        });
        jPanel1.add(RBLaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 191, -1, -1));

        RBPerempuan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RBPerempuan.setText("Perempuan");
        RBPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBPerempuanActionPerformed(evt);
            }
        });
        jPanel1.add(RBPerempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 191, -1, -1));

        Jurusan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Teknik Elektro", "Teknik Mesin", "Teknik Komputer", "Sastra Inggris", "Animasi", "Sistem Informasi", "Sastra Jepang" }));
        jPanel1.add(Jurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 240, 287, -1));

        TFAlamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(TFAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 286, 451, -1));

        TabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelMahasiswa);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 381, 933, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void RBLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBLakiActionPerformed
        if(RBLaki.isSelected()){
            RBPerempuan.setSelected(false);
        }
    }//GEN-LAST:event_RBLakiActionPerformed

    private void RBPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBPerempuanActionPerformed
        if(RBPerempuan.isSelected()){
            RBLaki.setSelected(false);
        }
    }//GEN-LAST:event_RBPerempuanActionPerformed

    private void ButtonInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInputActionPerformed
        String kelamin="";
        if(RBLaki.isSelected()){
            kelamin = RBLaki.getText();
        }else if(RBPerempuan.isSelected()){
            kelamin = RBPerempuan.getText();
        }
        
        try{
            String sql = "INSERT INTO mahasiswa VALUES ('"+TFNIM.getText()+"','"+TFNama.getText()+"','"+TFTglLahir.getText()+"','"+kelamin+"','"+Jurusan.getSelectedItem()+"','"+TFAlamat.getText()+"')";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Berhasil simpan data");
            tampilkan_data();
            kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_ButtonInputActionPerformed

    private void TabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMahasiswaMouseClicked
        int baris = TabelMahasiswa.rowAtPoint(evt.getPoint());
        String nim = TabelMahasiswa.getValueAt(baris, 1).toString();
        TFNIM.setText(nim);
        
        String nama = TabelMahasiswa.getValueAt(baris, 2).toString();
        TFNama.setText(nama);
        
        String tgllahir = TabelMahasiswa.getValueAt(baris, 3).toString();
        TFTglLahir.setText(tgllahir);
        
        if("Laki-Laki".equals(TabelMahasiswa.getValueAt(baris, 4).toString())){
            RBLaki.setSelected(true);
            RBPerempuan.setSelected(false);
        }else{
            RBPerempuan.setSelected(true);
            RBLaki.setSelected(false);
        }
        
        String jrs = TabelMahasiswa.getValueAt(baris, 5).toString();
        Jurusan.setSelectedItem(jrs);
        
        String alamat = TabelMahasiswa.getValueAt(baris, 6).toString();
        TFAlamat.setText(alamat);
    }//GEN-LAST:event_TabelMahasiswaMouseClicked

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
        String kelamin="";
        if(RBLaki.isSelected()){
            kelamin = RBLaki.getText();
        }else if(RBPerempuan.isSelected()){
            kelamin = RBPerempuan.getText();
        }
        
        try{
            String sql = "UPDATE mahasiswa SET nim='"+TFNIM.getText()+"',nama_mahasiswa='"+TFNama.getText()+"',tgl_lahir='"+TFTglLahir.getText()+"',jenis_kelamin='"+kelamin+"',jurusan='"+Jurusan.getSelectedItem()+"',alamat='"+TFAlamat.getText()+"' WHERE nim='"+TFNIM.getText()+"'";
            java.sql.Connection conn = (Connection)Koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit data berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        try{
            String sql = "DELETE FROM mahasiswa WHERE nim = '"+TFNIM.getText()+"'";
            java.sql.Connection conn = (Connection)Koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        int jumlahrow = TabelMahasiswa.getRowCount();
        if(jumlahrow>0){
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter("DataMahasiswa.txt"));
                for(int index=1; index<jumlahrow; index++){
                    String nim = "NIM: "+TabelMahasiswa.getValueAt(index, 1);
                    String nama = "Nama Mahasiswa: "+TabelMahasiswa.getValueAt(index, 2);
                    String tgllahir = "Tanggal Lahir: "+TabelMahasiswa.getValueAt(index, 3);
                    String kelamin = "Jenis Kelamin: "+TabelMahasiswa.getValueAt(index, 4);
                    String jurusan = "Jurusan: "+TabelMahasiswa.getValueAt(index, 5);
                    String alamat = "Alamat: "+TabelMahasiswa.getValueAt(index, 6);
                    
                    bw.write(nim+"\n"+nama+"\n"+tgllahir+"\n"+kelamin+"\n"+jurusan+"\n"+alamat+"\n\n");
                    
                }
                bw.close();
                JOptionPane.showMessageDialog(null, "Data Berhasil disimpan dalam file");
            } catch (Exception ex) {
                System.err.println("Error "+ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Anda belum menginput data");
        }
    }//GEN-LAST:event_ButtonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonInput;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JComboBox<String> Jurusan;
    private javax.swing.JRadioButton RBLaki;
    private javax.swing.JRadioButton RBPerempuan;
    private javax.swing.JTextField TFAlamat;
    private javax.swing.JTextField TFNIM;
    private javax.swing.JTextField TFNama;
    private javax.swing.JTextField TFTglLahir;
    private javax.swing.JTable TabelMahasiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
