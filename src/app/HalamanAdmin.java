/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.awt.Frame;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HalamanAdmin extends javax.swing.JFrame {
    
    UserProfile p;
    
    public HalamanAdmin() {
    initComponents();

    }
    
    public HalamanAdmin(UserProfile p) {
        initComponents();
        this.p = p;
        labelUser.setText(p.getFullname() + "(" + p.getLevel() + ")");
        
        viewData("");
        viewDataProduct(""); 
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
        jLabel2 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jTabbedPane49 = new javax.swing.JTabbedPane();
        DataUser = new javax.swing.JPanel();
        jPanel157 = new javax.swing.JPanel();
        jLabel162 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jPanel84 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_key = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        jScrollPane53 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel158 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        btn_tambah1 = new javax.swing.JButton();
        btn_edit2 = new javax.swing.JButton();
        btn_hapus2 = new javax.swing.JButton();
        btn_refresh2 = new javax.swing.JButton();
        jPanel85 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        keyProduct = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("Welcome");

        labelUser.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUser.setText("fullname&level");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("LogOut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(labelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 551, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        Background.setBackground(new java.awt.Color(0, 102, 102));
        Background.setLayout(new java.awt.BorderLayout());

        jTabbedPane49.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane49.setToolTipText("");
        jTabbedPane49.setAlignmentX(0.0F);
        jTabbedPane49.setAlignmentY(0.0F);
        jTabbedPane49.setMaximumSize(new java.awt.Dimension(444, 4444));
        jTabbedPane49.setPreferredSize(new java.awt.Dimension(900, 517));

        DataUser.setAlignmentX(0.0F);
        DataUser.setAlignmentY(0.0F);
        DataUser.setLayout(new java.awt.BorderLayout());

        jPanel157.setBackground(new java.awt.Color(0, 102, 102));

        jLabel162.setBackground(new java.awt.Color(255, 255, 255));
        jLabel162.setFont(new java.awt.Font("Ink Free", 3, 24)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel162.setText("Oyen");

        btn_tambah.setBackground(new java.awt.Color(0, 153, 153));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(0, 153, 153));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_edit.setText("Edit Data");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(0, 153, 153));
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_hapus.setText("Hapus Data");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusbtn_hapus51btn_hapus48btn_hapusActionPerformed(evt);
            }
        });

        btn_refresh.setBackground(new java.awt.Color(0, 153, 153));
        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshbtn_hapus51btn_hapus48btn_hapusActionPerformed(evt);
            }
        });

        jPanel84.setBackground(new java.awt.Color(0, 102, 102));
        jPanel84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-search-30.png"))); // NOI18N
        jPanel84.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 30, 40));

        txt_key.setBackground(new java.awt.Color(204, 204, 204));
        txt_key.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_keyjTextField52jTextField49jTextField1ActionPerformed(evt);
            }
        });
        txt_key.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_keyKeyReleased(evt);
            }
        });
        jPanel84.add(txt_key, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 370, 40));

        jLabel163.setBackground(new java.awt.Color(255, 255, 255));
        jLabel163.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(0, 204, 204));
        jLabel163.setText("Cari Data");
        jPanel84.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 80, 40));

        javax.swing.GroupLayout jPanel157Layout = new javax.swing.GroupLayout(jPanel157);
        jPanel157.setLayout(jPanel157Layout);
        jPanel157Layout.setHorizontalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel157Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tambah)
                .addGap(7, 7, 7)
                .addComponent(btn_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel157Layout.setVerticalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel157Layout.createSequentialGroup()
                .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel157Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel157Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_edit)
                            .addComponent(btn_hapus)
                            .addComponent(jLabel162)
                            .addComponent(btn_refresh)
                            .addComponent(btn_tambah))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        DataUser.add(jPanel157, java.awt.BorderLayout.PAGE_START);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NO", "FULLNAME", "USERNAME", "PASSWORD", "LEVEL"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1jTable49jTable1MouseClicked(evt);
            }
        });
        jScrollPane53.setViewportView(jTable1);

        DataUser.add(jScrollPane53, java.awt.BorderLayout.CENTER);

        jTabbedPane49.addTab("Data User", DataUser);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NO", "KODE PRODUK", "NAMA PRODUK", "GAMBAR", "KATEGORI", "SUPPLIER", "HARGA JUAL", "HARGA BELI", "STOK"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel158.setBackground(new java.awt.Color(0, 102, 102));

        jLabel165.setBackground(new java.awt.Color(255, 255, 255));
        jLabel165.setFont(new java.awt.Font("Ink Free", 3, 24)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel165.setText("Oyen");

        btn_tambah1.setBackground(new java.awt.Color(0, 153, 153));
        btn_tambah1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_tambah1.setText("Tambah");
        btn_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah1ActionPerformed(evt);
            }
        });

        btn_edit2.setBackground(new java.awt.Color(0, 153, 153));
        btn_edit2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_edit2.setText("Edit Produk");
        btn_edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit2ActionPerformed(evt);
            }
        });

        btn_hapus2.setBackground(new java.awt.Color(0, 153, 153));
        btn_hapus2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_hapus2.setText("Hapus Produk");
        btn_hapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus2btn_hapus51btn_hapus48btn_hapusActionPerformed(evt);
            }
        });

        btn_refresh2.setBackground(new java.awt.Color(0, 153, 153));
        btn_refresh2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_refresh2.setText("Refresh");
        btn_refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh2btn_hapus51btn_hapus48btn_hapusActionPerformed(evt);
            }
        });

        jPanel85.setBackground(new java.awt.Color(0, 102, 102));
        jPanel85.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-search-30.png"))); // NOI18N
        jPanel85.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 40, 40));

        keyProduct.setBackground(new java.awt.Color(204, 204, 204));
        keyProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        keyProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyProductjTextField52jTextField49jTextField1ActionPerformed(evt);
            }
        });
        keyProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keyProductKeyReleased(evt);
            }
        });
        jPanel85.add(keyProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 360, 40));

        jLabel166.setBackground(new java.awt.Color(255, 255, 255));
        jLabel166.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(0, 204, 204));
        jLabel166.setText("Cari Produk");
        jPanel85.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 40));

        javax.swing.GroupLayout jPanel158Layout = new javax.swing.GroupLayout(jPanel158);
        jPanel158.setLayout(jPanel158Layout);
        jPanel158Layout.setHorizontalGroup(
            jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel158Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tambah1)
                .addGap(7, 7, 7)
                .addComponent(btn_edit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hapus2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_refresh2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel158Layout.setVerticalGroup(
            jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel158Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel158Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_edit2)
                            .addComponent(btn_hapus2)
                            .addComponent(jLabel165)
                            .addComponent(btn_refresh2)
                            .addComponent(btn_tambah1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel158, java.awt.BorderLayout.PAGE_START);

        jTabbedPane49.addTab("Data Produk", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        jTabbedPane49.addTab("Data Transaksi", jPanel2);

        Background.add(jTabbedPane49, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(936, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_keyjTextField52jTextField49jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_keyjTextField52jTextField49jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_keyjTextField52jTextField49jTextField1ActionPerformed

    private void btn_hapusbtn_hapus51btn_hapus48btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusbtn_hapus51btn_hapus48btn_hapusActionPerformed
        int n = jTable1.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(jTable1.getValueAt(n, 0).toString());
//            JOptionPane.showMessageDialog(this, id); 
            
            int pilihan = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin untuk menghapus data user ini?",
                    "Hapus Data",JOptionPane.YES_NO_OPTION);
            if(pilihan == 0){
                //yes
                String Q = "DELETE FROM user WHERE id_user="+id+" ";
                try {
                    Connection K = Koneksi.Go();
                    Statement S = K.createStatement();
                    S.executeUpdate(Q);
                    
                    // Menambahkan log aktivitas untuk mencatat data yang dihapus
                    Logging.logActivity("Data berhasil dihapus: ID User = " + id);
                    
                    viewData(""); 
                } catch (Exception e) {
                    // Menambahkan log aktivitas jika terjadi kesalahan
                    Logging.logActivity("Gagal menghapus data (ID User = " + id + "): " + e.getMessage());
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
                }
            }else {
                //no
            }
   
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data"); 
        
        }
    }//GEN-LAST:event_btn_hapusbtn_hapus51btn_hapus48btn_hapusActionPerformed

    private void jTable1jTable49jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1jTable49jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1jTable49jTable1MouseClicked

    private void txt_keyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_keyKeyReleased
        String key = txt_key.getText();
        String w = "WHERE "
                + "fullname LIKE '%"+key+"%' "
                + "OR username LIKE '%"+key+"%' "
                + "OR password LIKE '%"+key+"%' "
                + "OR id_level LIKE '%"+key+"%'";
        viewData(w); 
    }//GEN-LAST:event_txt_keyKeyReleased

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int n = jTable1.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(jTable1.getValueAt(n, 0).toString());
            String FN = jTable1.getValueAt(n, 2).toString();
            String UN = jTable1.getValueAt(n, 3).toString();
            String PS = jTable1.getValueAt(n, 4).toString();
            String LV = jTable1.getValueAt(n, 5).toString();
            Editdt U = new Editdt(this, true);
            U.setId(id);
            U.setFN(FN);
            U.setUS(UN);
            U.setPS(PS);
            U.setLV(LV);
            U.setVisible(true); 
        } 
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
     Tambahdt T = new Tambahdt(this, true);
     T.setVisible(true);         
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_refreshbtn_hapus51btn_hapus48btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshbtn_hapus51btn_hapus48btn_hapusActionPerformed
        txt_key.setText("");
        viewData("");
    }//GEN-LAST:event_btn_refreshbtn_hapus51btn_hapus48btn_hapusActionPerformed

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        TambahProduk T = new TambahProduk(this, true);
        T.setVisible(true); 
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    private void btn_edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit2ActionPerformed
 try {
        int n = jTable2.getSelectedRow();
        if (n != -1) {
            // Ambil nilai id dari kolom pertama yang tersembunyi
            int id = Integer.parseInt(jTable2.getValueAt(n, 0).toString());
            String KP = jTable2.getValueAt(n, 2).toString();
            String NP = jTable2.getValueAt(n, 3).toString();
            String GP = jTable2.getValueAt(n, 4).toString();
            String K = jTable2.getValueAt(n, 5).toString();
            String S = jTable2.getValueAt(n, 6).toString();
            String HJ = jTable2.getValueAt(n, 7).toString();
            String HB = jTable2.getValueAt(n, 8).toString();
            String SP = jTable2.getValueAt(n, 9).toString();

            // Membuka dialog EditProduk dan mengisi nilai
            EditProduk E = new EditProduk(this, true);
            E.setId(id);
            E.setKP(KP);
            E.setNP(NP);
            E.setGP(GP);
            E.setK(K);
            E.setS(S);
            E.setHJ(HJ);
            E.setHB(HB);
            E.setSP(SP);
            E.setVisible(true);
        } else {
            System.out.println("Tidak ada baris yang dipilih di jTable2.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Terjadi kesalahan: " + e.getMessage());
    }
    }//GEN-LAST:event_btn_edit2ActionPerformed

    private void btn_hapus2btn_hapus51btn_hapus48btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus2btn_hapus51btn_hapus48btn_hapusActionPerformed
        int n = jTable2.getSelectedRow();
        if (n != -1) {
            String idStr = jTable2.getValueAt(n, 0).toString();

            if (idStr != null && !idStr.isEmpty()) {
                try {
                    int id = Integer.parseInt(idStr);
                    String productName = jTable2.getValueAt(n, 3).toString();

                    int opsi = JOptionPane.showConfirmDialog(this,
                            "Apakah Anda yakin ingin menghapus produk " + productName + "?",
                            "Hapus Produk",
                            JOptionPane.YES_NO_OPTION);
                    if (opsi == JOptionPane.YES_OPTION) {
                        String Q = "DELETE FROM products WHERE id=" + id;

                        try {
                            Connection K = Koneksi.Go();
                            Statement S = K.createStatement();
                            S.executeUpdate(Q);
                            viewDataProduct("");
                            JOptionPane.showMessageDialog(this, "Produk " + productName + " telah terhapus");
                            
                            // Logging penghapusan produk
                            Logging.logActivity("Produk berhasil dihapus: ID = " + id + ", Nama Produk = " + productName);
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(this, "Gagal menghapus data produk");
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "ID produk tidak valid.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID produk kosong atau tidak valid.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih produk.");
        }
    }//GEN-LAST:event_btn_hapus2btn_hapus51btn_hapus48btn_hapusActionPerformed

    private void btn_refresh2btn_hapus51btn_hapus48btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh2btn_hapus51btn_hapus48btn_hapusActionPerformed
        keyProduct.setText("");
        viewDataProduct("");
    }//GEN-LAST:event_btn_refresh2btn_hapus51btn_hapus48btn_hapusActionPerformed

    private void keyProductjTextField52jTextField49jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyProductjTextField52jTextField49jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyProductjTextField52jTextField49jTextField1ActionPerformed

    private void keyProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyProductKeyReleased
        String key = keyProduct.getText();
        String w = "WHERE "
                + "product_name LIKE '%"+key+"%' "
                + "OR product_category LIKE '%"+key+"%' "
                + "OR product_supplier LIKE '%"+key+"%' "
                + "OR product_price_s LIKE '%"+key+"%'";
        
        viewDataProduct(w); 
    }//GEN-LAST:event_keyProductKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            // Logging aktivitas logout
            Logging.logActivity("Pengguna melakukan logout.");
            // Menutup halaman admin dan membuka halaman login jika pengguna memilih "Yes"
            this.setVisible(false);
            Login L = new Login();
            L.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanAdmin().setVisible(true);
            }
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel DataUser;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_edit2;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_hapus2;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_refresh2;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tambah1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JTabbedPane jTabbedPane49;
    private static javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    private javax.swing.JTextField keyProduct;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTextField txt_key;
    // End of variables declaration//GEN-END:variables

    public static void viewData(String where) {
            try {
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            m.getDataVector().removeAllElements();
            Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM user "+where;
            ResultSet R = S.executeQuery(Q);
            int n = 1;
            while (R.next()) {                 
                int user = R.getInt("id_user");
                String fullname = R.getString("fullname");
                String username = R.getString("username");
                String password = R.getString("password");
                String id_level = R.getString("id_level");
                Object[] data = {user, n, fullname, username, password, id_level};
                m.addRow(data); 
                n++;
            }
            
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            
        } catch (Exception e) {
            //error handling
        }
    }
    
    
    public static void viewDataProduct(String where) {
        try {
            DefaultTableModel m = (DefaultTableModel) jTable2.getModel();
            m.getDataVector().removeAllElements();
            Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM products "+where;
            ResultSet R = S.executeQuery(Q);
            int n = 1;
            while (R.next()) {                 
                int id = R.getInt("id");
                 	 	 	 	 	 	 	 	
                String product_code = R.getString("product_code");
                String product_name = R.getString("product_name");
                String product_image = R.getString("product_image");                
                int product_category = R.getInt("product_category");
                int product_supplier = R.getInt("product_supplier");
                double product_price_s = R.getDouble("product_price_s");
                double product_price_b = R.getDouble("product_price_b");
                int product_stock = R.getInt("product_stock");
                Object[] data = {id, n,product_code, product_name, product_image,
                        product_category, product_supplier, product_price_s, product_price_b, product_stock};
                m.addRow(data); 
                n++;
            }
            
            jTable2.getColumnModel().getColumn(0).setMinWidth(0);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
            
        } catch (Exception e) {
            //error handling
        }
    }
    // Sembunyikan kolom id (kolom pertama dengan indeks 0) di jTable2


}
