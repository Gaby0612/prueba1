/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;


import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class frmDispositivo extends javax.swing.JFrame {

    Dispositivo dispositivo;
    Dispositivo[] vector;
    private DefaultTableModel modelo;
    private int posicion;
    private int posEditar;
    Celular celular;
    Lapto lapto;
    ComputadoraEscritorio escritorio;

    public frmDispositivo() {
        initComponents();
        vector = new Dispositivo[5];
        modelo = (DefaultTableModel) tblTabla.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameCelular = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoCel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMarcaCel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtModeloCel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtColorCcel = new javax.swing.JTextField();
        btnGuardarCel = new javax.swing.JButton();
        jFrameLapto = new javax.swing.JFrame();
        txtMarcaLapto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoLapto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreLapto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIntelCore = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPantalla = new javax.swing.JTextField();
        btnGuardarLapto = new javax.swing.JButton();
        jFramePc = new javax.swing.JFrame();
        txtMarcaPc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodigoPc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombrePc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtRam = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAccesorios = new javax.swing.JTextField();
        btnGuardarPc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCelular = new javax.swing.JButton();
        btnLapto = new javax.swing.JButton();
        btnPc = new javax.swing.JButton();
        btnGUARDAR = new javax.swing.JButton();
        btnABRIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        jLabel3.setText("DATOS DEL CELULAR");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Codigo:");

        txtCodigoCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCelActionPerformed(evt);
            }
        });

        jLabel6.setText("Marca:");

        jLabel7.setText("Modelo: ");

        jLabel8.setText("Color:");

        btnGuardarCel.setText("GUARDAR");
        btnGuardarCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameCelularLayout = new javax.swing.GroupLayout(jFrameCelular.getContentPane());
        jFrameCelular.getContentPane().setLayout(jFrameCelularLayout);
        jFrameCelularLayout.setHorizontalGroup(
            jFrameCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameCelularLayout.createSequentialGroup()
                .addGroup(jFrameCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameCelularLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3))
                    .addGroup(jFrameCelularLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(txtNombreCel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrameCelularLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnGuardarCel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameCelularLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jFrameCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameCelularLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(21, 21, 21)
                                .addComponent(txtColorCcel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameCelularLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(9, 9, 9)
                                .addComponent(txtModeloCel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameCelularLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(13, 13, 13)
                                .addComponent(txtCodigoCel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameCelularLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(17, 17, 17)
                                .addComponent(txtMarcaCel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jFrameCelularLayout.setVerticalGroup(
            jFrameCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameCelularLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jFrameCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameCelularLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtNombreCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jFrameCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameCelularLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtCodigoCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jFrameCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtMarcaCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jFrameCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtModeloCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jFrameCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtColorCcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnGuardarCel)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLabel9.setText("Nombre:");

        jLabel10.setText("DATOS DE L LAPTO");

        jLabel11.setText("Marca:");

        jLabel12.setText("Codigo:");

        jLabel17.setText("Modelo Intel Core:");

        jLabel18.setText("Modelo Pantalla:");

        btnGuardarLapto.setText("GUARDAR");
        btnGuardarLapto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLaptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameLaptoLayout = new javax.swing.GroupLayout(jFrameLapto.getContentPane());
        jFrameLapto.getContentPane().setLayout(jFrameLaptoLayout);
        jFrameLaptoLayout.setHorizontalGroup(
            jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameLaptoLayout.createSequentialGroup()
                .addGroup(jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameLaptoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrameLaptoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel10))
                            .addGroup(jFrameLaptoLayout.createSequentialGroup()
                                .addGroup(jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(23, 23, 23)
                                .addGroup(jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jFrameLaptoLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtNombreLapto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCodigoLapto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPantalla, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIntelCore, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMarcaLapto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))))
                    .addGroup(jFrameLaptoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnGuardarLapto)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jFrameLaptoLayout.setVerticalGroup(
            jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameLaptoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(21, 21, 21)
                .addGroup(jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameLaptoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel12)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel11))
                    .addGroup(jFrameLaptoLayout.createSequentialGroup()
                        .addComponent(txtNombreLapto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtCodigoLapto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtMarcaLapto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtIntelCore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrameLaptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarLapto)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jLabel13.setText("Nombre:");

        jLabel14.setText("DATOS DE LA PC");

        jLabel15.setText("Marca:");

        jLabel16.setText("Codigo:");

        jLabel19.setText("Tamanio Memoria RAM:");

        jLabel20.setText("Cantidad de Accesorios:");

        btnGuardarPc.setText("GUARDAR");
        btnGuardarPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFramePcLayout = new javax.swing.GroupLayout(jFramePc.getContentPane());
        jFramePc.getContentPane().setLayout(jFramePcLayout);
        jFramePcLayout.setHorizontalGroup(
            jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFramePcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFramePcLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel14))
                    .addGroup(jFramePcLayout.createSequentialGroup()
                        .addGroup(jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFramePcLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtNombrePc, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodigoPc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtRam, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMarcaPc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))
                    .addGroup(jFramePcLayout.createSequentialGroup()
                        .addGroup(jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardarPc)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addComponent(txtAccesorios, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jFramePcLayout.setVerticalGroup(
            jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFramePcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(12, 12, 12)
                .addGroup(jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFramePcLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel16)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel15))
                    .addGroup(jFramePcLayout.createSequentialGroup()
                        .addComponent(txtNombrePc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtCodigoPc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtMarcaPc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFramePcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtAccesorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarPc)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DISPOSITIVOS");

        jLabel2.setText("Eliga el dispositivo:");

        btnCelular.setText("CELULAR");
        btnCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelularActionPerformed(evt);
            }
        });

        btnLapto.setText("LAPTO");
        btnLapto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaptoActionPerformed(evt);
            }
        });

        btnPc.setText("PC ESCRITORIO");
        btnPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPcActionPerformed(evt);
            }
        });

        btnGUARDAR.setText("GUARDAR");
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });

        btnABRIR.setText("ABRIR");
        btnABRIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnABRIRActionPerformed(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "NOMBRE", "CODIGO", "MARCA"
            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLapto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnGUARDAR)
                        .addGap(18, 18, 18)
                        .addComponent(btnABRIR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnCelular)
                    .addComponent(btnLapto)
                    .addComponent(btnPc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGUARDAR)
                    .addComponent(btnABRIR))
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCelActionPerformed

    private void btnCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelularActionPerformed
        jFrameCelular.setVisible(true);

    }//GEN-LAST:event_btnCelularActionPerformed

    private void btnLaptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaptoActionPerformed
        jFrameLapto.setVisible(true);
    }//GEN-LAST:event_btnLaptoActionPerformed

    private void btnPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPcActionPerformed
        jFramePc.setVisible(true);
    }//GEN-LAST:event_btnPcActionPerformed

    private void btnGuardarCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCelActionPerformed
        celular = new Celular(txtModeloCel.getText(), txtColorCcel.getText(),
                txtNombreCel.getText(), txtCodigoCel.getText(), txtMarcaCel.getText());
        celular.setPosicion(posicion);
        vector[posicion++] = celular;
        modelo.addRow(celular.toArray());
        jFrameCelular.setVisible(false);
    }//GEN-LAST:event_btnGuardarCelActionPerformed

    private void btnGuardarLaptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLaptoActionPerformed
        lapto = new Lapto(Integer.parseInt(txtIntelCore.getText()), txtPantalla.getText(),
                txtCodigoLapto.getText(), txtNombreLapto.getText(), txtMarcaLapto.getText());;
        lapto.setPosicion(posicion);
        vector[posicion++] = lapto;
        modelo.addRow(lapto.toArray());
        jFrameLapto.setVisible(false);
    }//GEN-LAST:event_btnGuardarLaptoActionPerformed

    private void btnGuardarPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPcActionPerformed
        escritorio = new ComputadoraEscritorio(Integer.parseInt(txtRam.getText()), Integer.parseInt(txtAccesorios.getText()),
                txtCodigoPc.getText(), txtNombrePc.getText(), txtMarcaPc.getText());
        escritorio.setPosicion(posicion);
        vector[posicion] = escritorio;
        modelo.addRow(escritorio.toArray());
        jFramePc.setVisible(false);
    }//GEN-LAST:event_btnGuardarPcActionPerformed

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed
        JFileChooser saveFile = new JFileChooser();
        if (saveFile.showSaveDialog(null) == 0) {
            FileWriter file = null;
            PrintWriter pw;
            try {
                file = new FileWriter(saveFile.getSelectedFile());
                pw = new PrintWriter(file);
                Gson gson = new Gson();
                String texto = gson.toJson(vector);
                pw.append(texto);
            } catch (IOException ex) {
                Logger.getLogger(frmDispositivo.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (file != null) {
                        file.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(frmDispositivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGUARDARActionPerformed

    private void btnABRIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnABRIRActionPerformed
        JFileChooser openFile = new JFileChooser();
        if (openFile.showOpenDialog(null) == 0) {
            try {
                
                FileInputStream fstream = new FileInputStream(openFile.getSelectedFile());
                
                DataInputStream entrada = new DataInputStream(fstream);
               
                BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
                String strLinea;
                
                String texto = "";
                while ((strLinea = buffer.readLine()) != null) {
                    
                    texto += strLinea;
                }
                
                entrada.close();
                Gson gson = new Gson();
                vector = gson.fromJson(texto, Dispositivo[].class);
                posicion = 0;
                for (Dispositivo dispositivo : vector) {
                    if (dispositivo != null) {
                        posicion++;
                    }
                }
                dibujarGrilla();

            } catch (Exception e) { 
                System.err.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnABRIRActionPerformed

    
    private void dibujarGrilla() {
        modelo.setRowCount(0);
        for (int i = 0; i < posicion; i++) {
            modelo.addRow(vector[i].toArray());
        }
    }

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
            java.util.logging.Logger.getLogger(frmDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDispositivo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnABRIR;
    private javax.swing.JButton btnCelular;
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.JButton btnGuardarCel;
    private javax.swing.JButton btnGuardarLapto;
    private javax.swing.JButton btnGuardarPc;
    private javax.swing.JButton btnLapto;
    private javax.swing.JButton btnPc;
    private javax.swing.JFrame jFrameCelular;
    private javax.swing.JFrame jFrameLapto;
    private javax.swing.JFrame jFramePc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtAccesorios;
    private javax.swing.JTextField txtCodigoCel;
    private javax.swing.JTextField txtCodigoLapto;
    private javax.swing.JTextField txtCodigoPc;
    private javax.swing.JTextField txtColorCcel;
    private javax.swing.JTextField txtIntelCore;
    private javax.swing.JTextField txtMarcaCel;
    private javax.swing.JTextField txtMarcaLapto;
    private javax.swing.JTextField txtMarcaPc;
    private javax.swing.JTextField txtModeloCel;
    private javax.swing.JTextField txtNombreCel;
    private javax.swing.JTextField txtNombreLapto;
    private javax.swing.JTextField txtNombrePc;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtRam;
    // End of variables declaration//GEN-END:variables
}
