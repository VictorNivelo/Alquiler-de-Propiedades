/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Image;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import modelo.Propiedad;

/**
 *
 * @author lettc
 */
public class FrmPropiedadImagen extends javax.swing.JFrame {
    
    public static LinkedList PropiedadDatos = new LinkedList<>();

    /**
     * Creates new form FrmPropiedad
     */
    public FrmPropiedadImagen() {
        initComponents();
        setLocationRelativeTo(null);
        btnSiguiente.requestFocus();
    }
    
//    private File archivo;
//    private Integer iterador=0;
//    
//    public void insertarImg(JLabel label){
//        int resultado;
//        FrmAgregarImagenes buscarImagen = new FrmAgregarImagenes();
//        FileNameExtensionFilter formato = new FileNameExtensionFilter("JPG, PNG Y GIF", "jpg", "png", "gif");
//        FrmAgregarImagenes.JFCImg.setFileFilter(formato);
//        resultado = buscarImagen.JFCImg.showOpenDialog(this);
//        if (JFileChooser.APPROVE_OPTION == resultado) {
//            archivo = buscarImagen.JFCImg.getSelectedFile();
//            //jLDireccion.setText(archivo.getAbsolutePath());
//            try {
//                ImageIcon ImgIcon = new ImageIcon(archivo.toString());
//                Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
//                label.setIcon(icono);
//            } catch (Exception e) {
//            }
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAgregarImagen = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAgregarImg = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGuardarInformacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgregarImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAgregarImg.setText("AGREGAR IMAGEN");
        btnAgregarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImgActionPerformed(evt);
            }
        });

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR IMAGEN DE PROPIEDAD");

        btnGuardarInformacion.setText("GUARDAR INFORMACION");
        btnGuardarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarInformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguiente))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarInformacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarInformacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAgregarImg)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImgActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();

        ImageIcon imagen = new ImageIcon(file.getAbsolutePath());
        Image img = imagen.getImage();
        Image newimg = img.getScaledInstance(lblAgregarImagen.getWidth(), lblAgregarImagen.getHeight(),  java.awt.Image.SCALE_SMOOTH);
        imagen = new ImageIcon(newimg);
        lblAgregarImagen.setIcon(imagen);
    }//GEN-LAST:event_btnAgregarImgActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        FrmPrincipal principal = new FrmPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmIngresoPropiedad direccion = new FrmIngresoPropiedad();
        direccion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarInformacionActionPerformed
        // TODO add your handling code here:
        String Ciudad = Vista.FrmIngresoDireccion.txtProcincia.getText();
        String provincia = Vista.FrmIngresoDireccion.txtCiudad.getText();
        String CalleP = Vista.FrmIngresoDireccion.txtCallePrincipal.getText();
        String CalleS = Vista.FrmIngresoDireccion.txtCalleSecundaria.getText();
        String CodigoP = Vista.FrmIngresoDireccion.txtCodigoPostal.getText();
        
        boolean Wifi = Vista.Frmservicio.checkWifi.isSelected();
        boolean TV = Vista.Frmservicio.checkTV.isSelected();
        boolean Lavadora = Vista.Frmservicio.checkLavadora.isSelected();
        boolean Secadora = Vista.Frmservicio.checkSecadora.isSelected();
        boolean Estacionamiento = Vista.Frmservicio.checkEstacionamiento.isSelected();
        boolean Cocina = Vista.Frmservicio.checkCocina.isSelected();
        boolean Picina = Vista.Frmservicio.checkPicina.isSelected();
        boolean Jacuzzi = Vista.Frmservicio.checkJacuzzi.isSelected();
        boolean Parrilla = Vista.Frmservicio.checkParrilla.isSelected();
        boolean Patio = Vista.Frmservicio.checkPatio.isSelected();
        boolean Comedor = Vista.Frmservicio.checkComedor.isSelected();
        boolean SalaJuegos = Vista.Frmservicio.checkSalaJuegos.isSelected();
        boolean AireAcondicionado = Vista.Frmservicio.checkAireAcondicionado.isSelected();
        boolean AguaCaliente = Vista.Frmservicio.checkAguaCaliente.isSelected();
        boolean Otros = Vista.Frmservicio.checkOtros.isSelected();
        
        String TipoPropiedad = Vista.FrmIngresoPropiedad.cbxTipoPropiedad.getSelectedItem().toString();
        String Descripcion = Vista.FrmIngresoPropiedad.txtDescripcion.getText();
        String NumeroPropiedad = Vista.FrmIngresoPropiedad.txtNumeroPropiedad.getText();
        String Huesped = Vista.FrmIngresoPropiedad.spinHuespedes.getValue().toString();
        String Habitaciones = Vista.FrmIngresoPropiedad.spinHabitaciones.getValue().toString();
        String Camas = Vista.FrmIngresoPropiedad.spinCamas.getValue().toString();
        String Baños = Vista.FrmIngresoPropiedad.spinBanios.getValue().toString();
        String Precio = Vista.FrmIngresoPropiedad.txtPrecio.getText();
        String FechaIngreso = Vista.FrmIngresoPropiedad.dateDisponibilidadDesde.getDate().toString();
        String FechaSalida = Vista.FrmIngresoPropiedad.dateDisponibilidadHasta.getDate().toString();
        
        ImageIcon imagen = (ImageIcon) lblAgregarImagen.getIcon();
                
        Propiedad propiedad = new Propiedad(Ciudad, provincia, CalleP, CalleS, CodigoP, 
                Wifi, TV, Lavadora, Secadora, Estacionamiento, Cocina, Picina, Jacuzzi, Parrilla, Patio, Comedor, SalaJuegos, AireAcondicionado, AguaCaliente, Otros, 
                TipoPropiedad, Descripcion, NumeroPropiedad, Huesped, Habitaciones, Camas, Baños, Precio, FechaIngreso, FechaSalida, imagen);
        PropiedadDatos.add(propiedad);
    }//GEN-LAST:event_btnGuardarInformacionActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        FrmPrincipal btndireccion = new FrmPrincipal();
        btndireccion.setVisible(true);
        this.setVisible(false);

        
        for (int i = 0; i < PropiedadDatos.size(); i++) {
            System.out.println(PropiedadDatos.get(i) + " ");
        }
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPropiedadImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPropiedadImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPropiedadImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPropiedadImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPropiedadImagen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarImg;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarInformacion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgregarImagen;
    // End of variables declaration//GEN-END:variables
}