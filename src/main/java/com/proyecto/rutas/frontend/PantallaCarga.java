/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.rutas.frontend;

import com.formdev.flatlaf.FlatLightLaf;
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
        BarraInicio.setBackground(new Color(91, 121, 235));
        BarraInicio.setUI(new BasicProgressBarUI() {
            @Override
            protected Color getSelectionBackground() {
                return new Color(91, 121, 235);
            }
        });
        BarraInicio.setForeground(new Color(255,255,255)); 
   
        
        t1 = new pbThead((JProgressBar) BarraInicio);
        t1.start();
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

        jPanel1 = new javax.swing.JPanel();
        BarraInicio = new javax.swing.JProgressBar();
        valores = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        valores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        valores.setForeground(new java.awt.Color(0, 0, 0));
        valores.setText("jLabel1");

        mensaje.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(0, 0, 0));
        mensaje.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mensaje)
                .addGap(365, 365, 365)
                .addComponent(valores))
            .addComponent(BarraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensaje)
                    .addComponent(valores))
                .addGap(26, 26, 26)
                .addComponent(BarraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel valores;
    // End of variables declaration//GEN-END:variables
}
