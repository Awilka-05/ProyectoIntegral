
package com.proyecto.rutas.frontend;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author o.o
 */
public class PantallaRegistro extends javax.swing.JFrame {
    
    public class Credenciales{
    private String correo;
    private String contraseña;
    
      public Credenciales(String correo,String contraseña ){
        this.correo = correo;
        this.contraseña = contraseña;
      }
      
      public boolean VerificarCredenciales(String correoIngresado, String contraseñaIngresada){
      
        return this.correo.equals(correoIngresado) && this.contraseña.equals(contraseñaIngresada);
      }
    }
    
    public PantallaRegistro() {   
        initComponents();
        setSize(930, 670);
        
        txtCorreo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su Email");
        //lblEmail.putClientProperty("JComponent.roundRect", true);
        txtCorreo.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su contraseña");
       // lblContraseña.putClientProperty("JComponent.roundRect", true);
        txtPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        
        
              
    }
    private void login(){
     
       String correoIngresado = txtCorreo.getText();
       String contraseñaIngresada = new String(txtPassword.getPassword());
       
       Credenciales creden = new Credenciales("adminPMedina@ruteo.gob.do", "HolaMundo123");
       
       if(creden.VerificarCredenciales(correoIngresado, contraseñaIngresada)){
         JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
         dispose(); 
        
        PantallaMensaje prueba = new PantallaMensaje(); 
        prueba.setVisible(true);
       }
       else{
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
        txtCorreo.setText("");
        txtPassword.setText("");
       
       }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabelPassword = new javax.swing.JLabel();
        jlabelCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        empezar = new javax.swing.JButton();
        fotos = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        circulo = new javax.swing.JLabel();
        circulo1 = new javax.swing.JLabel();
        circulo2 = new javax.swing.JLabel();
        circulo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabelPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabelPassword.setForeground(new java.awt.Color(61, 141, 254));
        jlabelPassword.setText("Contraseña");
        jPanel1.add(jlabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 110, 80));

        jlabelCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabelCorreo.setForeground(new java.awt.Color(61, 141, 254));
        jlabelCorreo.setText("Correo");
        jPanel1.add(jlabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 90, 50));

        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 300, 60));

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 300, 60));

        empezar.setBackground(new java.awt.Color(61, 141, 254));
        empezar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        empezar.setForeground(new java.awt.Color(255, 255, 255));
        empezar.setText("Empezar");
        empezar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });
        jPanel1.add(empezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 130, 40));

        jPanel2.setBackground(new java.awt.Color(61, 141, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/rutas/frontend/iconos/bus.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 260, 580, 380));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("trayectos protegidos!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¡Seguridad calculada");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        fotos.addTab("tab1", jPanel2);

        jPanel1.add(fotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 510, 710));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(61, 141, 254));
        jLabel5.setText("Inicia sesión");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        circulo.setIcon(new FlatSVGIcon(getClass().getResource("/com/proyecto/rutas/frontend/iconos/circu.svg")));
        jPanel1.add(circulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 170, 150));

        circulo1.setIcon(new FlatSVGIcon(getClass().getResource("/com/proyecto/rutas/frontend/iconos/circu2.svg")));
        jPanel1.add(circulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 80, 70));

        circulo2.setIcon(new FlatSVGIcon(getClass().getResource("/com/proyecto/rutas/frontend/iconos/circu.svg")));
        jPanel1.add(circulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, -20, 130, 150));

        circulo3.setIcon(new FlatSVGIcon(getClass().getResource("/com/proyecto/rutas/frontend/iconos/circu2.svg")));
        jPanel1.add(circulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 80, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        login();
    }//GEN-LAST:event_empezarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            
          FlatLightLaf.setup();
         UIManager.put("Component.innerFocusWidth", 3);
         // UIManager.put("TextComponent.arc", 999);
           
        } catch (Exception ex) {
            System.err.println("No se pudo cargar el tema FlatLaf MacOS Light.");
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel circulo;
    private javax.swing.JLabel circulo1;
    private javax.swing.JLabel circulo2;
    private javax.swing.JLabel circulo3;
    private javax.swing.JButton empezar;
    private javax.swing.JTabbedPane fotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelCorreo;
    private javax.swing.JLabel jlabelPassword;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
