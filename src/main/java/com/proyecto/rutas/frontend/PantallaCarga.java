/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.rutas.frontend;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author o.o
 */
public class PantallaCarga extends javax.swing.JFrame {
     pbThead t1;
    
    public PantallaCarga() {
        
         setUndecorated(true);  
       setLocationRelativeTo(null);
       
        initComponents();
        BarraInicio.setBackground(new Color(61,141,254));
        BarraInicio.setUI(new BasicProgressBarUI() {
            @Override
            protected Color getSelectionBackground() {
                return new Color(61,141,254);
            }
        });
        BarraInicio.setForeground(new Color(255,255,255)); 
   
        
        t1 = new pbThead((JProgressBar) BarraInicio);
        
    }
    
        class pbThead extends Thread {

        JProgressBar pbar;

        pbThead(JProgressBar pbar) {
            this.pbar = pbar;
        }

        @Override
        public void run() {
            int max = 100;
            pbar.setMaximum(max);
            pbar.setValue(0);

            for (int i = 0; i <= max; i++) {
                pbar.setValue(i);
                valores.setText(i + "%");
                

                if (i == 5) {
                    mensaje.setText("Iniciando el proceso...");
                } else if (i == 10) {
                    mensaje.setText("Cargando los datos...");
                } else if (i == 20) {
                    mensaje.setText("Verificando información...");
                } else if (i == 30) {
                    mensaje.setText("Revisando configuraciones...");
                } else if (i == 40) {
                    mensaje.setText("Ajustando detalles finales...");
                } else if (i == 50) {
                    mensaje.setText("Estamos casi listos...");
                } else if (i == 60) {
                    mensaje.setText("Realizando últimos ajustes...");
                }  else if (i == 70) {
                    mensaje.setText("Estamos terminando...");
                } else if (i == 80) {
                    mensaje.setText("Solo un paso más...");
                }else if (i == 90) {
                    mensaje.setText("Gracias por la espera!"); 
                }
                
                else if(i == 100){
                    try {
                        sleep(700);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PantallaCarga.class.getName()).log(Level.SEVERE, null, ex);
                    }
                dispose();
                PantallaRegistro registrof = new PantallaRegistro();
                registrof.setVisible(true);
                
                
                
                }

                try {
                    sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            
            
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BarraInicio = new javax.swing.JProgressBar();
        valores = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(61, 141, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(BarraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 770, 20));

        valores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        valores.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(valores, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 50, 30));

        mensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 320, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tecnología que protege");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 350, 70));

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Comenzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 130, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new FlatSVGIcon(getClass().getResource("/com/proyecto/rutas/frontend/iconos/rute.svg")));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 770, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 522));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        t1.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            
          FlatLightLaf.setup();
          //UIManager.put("Component.innerFocusWidth", 3);
         // UIManager.put("TextComponent.arc", 999);
           
        } catch (Exception ex) {
            System.err.println("No se pudo cargar el tema FlatLaf MacOS Light.");
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraInicio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel valores;
    // End of variables declaration//GEN-END:variables
}
