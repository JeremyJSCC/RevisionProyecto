/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jerjo
 */
class VentanaPrincipal extends JFrame {
    private JButton[] buttons;
    private Finca[] fincas;

    public VentanaPrincipal(Finca[] fincas) {
        this.fincas = fincas;
        this.setTitle("Sistema de Gestión de Fincas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(fincas.length, 1));

        buttons = new JButton[fincas.length];
        for (int i = 0; i < fincas.length; i++) {
            buttons[i] = new JButton(fincas[i].getNombre());
            buttons[i].addActionListener(new BotonFincaListener(fincas[i]));
            panel.add(buttons[i]);
        }

        this.add(panel);
    }

    public void mostrarMapa() {
        JOptionPane.showMessageDialog(this, generarMapa(), "Mapa de Fincas", JOptionPane.PLAIN_MESSAGE);
    }

    private String generarMapa() {
        StringBuilder mapa = new StringBuilder();
        for (Finca finca : fincas) {
            mapa.append("Finca: ").append(finca.getNombre()).append("\n");
            Potrero[][] potreros = finca.getPotreros();
            for (int i = 0; i < potreros.length; i++) {
                for (int j = 0; j < potreros[i].length; j++) {
                    Potrero potrero = potreros[i][j];
                    String estado = potrero.getEstado().isEmpty() ? "Libre" : potrero.getEstado();
                    mapa.append("  Potrero ").append(potrero.getNombre()).append(": ").append(estado).append("\n");
                }
            }
            mapa.append("\n");
        }
        return mapa.toString();
    }

    private class BotonFincaListener implements ActionListener {
        private Finca finca;

        public BotonFincaListener(Finca finca) {
            this.finca = finca;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Información de la Finca:\n" + finca.toString());
        }
    }
}