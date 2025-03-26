package com.proyecto.rutas.frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.proyecto.rutas.backend.ConsumoCombustible;
import com.proyecto.rutas.backend.ConsumoEnergia;

public class VentanaPrincipal extends JFrame {
    
    private JTextField txtDistancia, txtConsumoCombustible, txtConsumoEnergia, txtPasos;
    private JLabel lblResultadoCombustible, lblResultadoEnergia;

    public VentanaPrincipal() {
        setTitle("Calculadora de Consumo de Autobuses");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Distancia (km):"));
        txtDistancia = new JTextField();
        add(txtDistancia);

        add(new JLabel("Consumo Combustible (l/km):"));
        txtConsumoCombustible = new JTextField();
        add(txtConsumoCombustible);

        add(new JLabel("Consumo Energía (kWh/km):"));
        txtConsumoEnergia = new JTextField();
        add(txtConsumoEnergia);

        add(new JLabel("Pasos de Integración:"));
        txtPasos = new JTextField("1000");
        add(txtPasos);

        JButton btnCalcularCombustible = new JButton("Calcular Combustible");
        JButton btnCalcularEnergia = new JButton("Calcular Energía");

        add(btnCalcularCombustible);
        add(btnCalcularEnergia);

        lblResultadoCombustible = new JLabel("Combustible: ");
        lblResultadoEnergia = new JLabel("Energía: ");
        add(lblResultadoCombustible);
        add(lblResultadoEnergia);

        // Acción del botón de combustible
        btnCalcularCombustible.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double distancia = Double.parseDouble(txtDistancia.getText());
                    double consumo = Double.parseDouble(txtConsumoCombustible.getText());
                    int pasos = Integer.parseInt(txtPasos.getText());

                    double resultado = ConsumoCombustible.calcularConsumo(distancia, consumo, pasos);
                    lblResultadoCombustible.setText("Combustible: " + String.format("%.2f", resultado) + " litros");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Acción del botón de energía
        btnCalcularEnergia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double distancia = Double.parseDouble(txtDistancia.getText());
                    double consumo = Double.parseDouble(txtConsumoEnergia.getText());
                    int pasos = Integer.parseInt(txtPasos.getText());

                    double resultado = ConsumoEnergia.calcularConsumo(distancia, consumo, pasos);
                    lblResultadoEnergia.setText("Energía: " + String.format("%.2f", resultado) + " kWh");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal());
    }
}
