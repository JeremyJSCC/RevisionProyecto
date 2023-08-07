/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class Proyecto {

    public static void main(String[] args) {
        int cantidadFincas = 0;
        boolean cantidadFincasValida = false;

        // Pedimos la cantidad de fincas hasta que se ingrese un valor válido
        while (!cantidadFincasValida) {
            try {
                cantidadFincas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de fincas:"));
                cantidadFincasValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al ingresar la cantidad de fincas. Por favor, ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        Finca[] fincas = new Finca[cantidadFincas];
        for (int i = 0; i < cantidadFincas; i++) {
            fincas[i] = crearFinca("Finca " + (i + 1));
        }

        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal(fincas);
            ventana.mostrarMapa();
        });
    }


    private static Finca crearFinca(String nombreFinca) {
        String ubicacion = JOptionPane.showInputDialog(null, "Ingrese la ubicación de la finca " + nombreFinca + ":");
        String nombreEncargado = JOptionPane.showInputDialog(null, "Ingrese el nombre del encargado de la finca " + nombreFinca + ":");
        int cedulaEncargado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cédula del encargado de la finca " + nombreFinca + ":"));
        int telefonoEncargado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el teléfono del encargado de la finca " + nombreFinca + ":"));
        int cantidadPotreros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de potreros de la finca " + nombreFinca + ":"));
        int tamañoFinca = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la finca " + nombreFinca + ":"));
        int cantidadAnimales = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de animales de la finca " + nombreFinca + ":"));

        Potrero[][] potreros = new Potrero[cantidadPotreros][1];
        for (int i = 0; i < cantidadPotreros; i++) {
            boolean potreroLibre = JOptionPane.showConfirmDialog(null, "El potrero " + (i + 1) + " está libre?", "Potrero Libre", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            potreros[i][0] = potreroLibre ? crearPotreroConGanado("Potrero " + (i + 1)) : crearPotreroSinGanado("Potrero " + (i + 1));
        }

        return new Finca(nombreFinca, ubicacion, nombreEncargado, cedulaEncargado, telefonoEncargado, cantidadPotreros, tamañoFinca, cantidadAnimales, potreros);
    }

    private static Potrero crearPotreroConGanado(String nombrePotrero) {
        // Pedimos los datos del potrero
        String estado = JOptionPane.showInputDialog(null, "Ingrese el estado del potrero " + nombrePotrero + ":");
        String fechaEntrada = JOptionPane.showInputDialog(null, "Ingrese la fecha de entrada del potrero " + nombrePotrero + ":");
        String fechaSalida = JOptionPane.showInputDialog(null, "Ingrese la fecha de salida del potrero " + nombrePotrero + ":");
        int cantidadAnimales = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de animales del potrero " + nombrePotrero + ":"));
        boolean poseeAgua = JOptionPane.showConfirmDialog(null, "El potrero " + nombrePotrero + " posee agua?", "Posee Agua", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        String tipoTerreno = JOptionPane.showInputDialog(null, "Ingrese el tipo de terreno del potrero " + nombrePotrero + ":");

        // Creamos el ganado
        Ganado[] ganado = new Ganado[cantidadAnimales];
        for (int i = 0; i < cantidadAnimales; i++) {
            ganado[i] = crearGanado("Ganado " + (i + 1));
        }

        return new Potrero(nombrePotrero, estado, fechaEntrada, fechaSalida, cantidadAnimales, poseeAgua, tipoTerreno, ganado);
    }

    private static Potrero crearPotreroSinGanado(String nombrePotrero) {
        // Pedimos los datos del potrero
        String estado = JOptionPane.showInputDialog(null, "Ingrese el estado del potrero " + nombrePotrero + ":");
        String fechaEntrada = JOptionPane.showInputDialog(null, "Ingrese la fecha de entrada del potrero " + nombrePotrero + ":");
        String fechaSalida = JOptionPane.showInputDialog(null, "Ingrese la fecha de salida del potrero " + nombrePotrero + ":");
        int cantidadAnimales = 0; // Como el potrero está libre, la cantidad de animales es cero
        boolean poseeAgua = JOptionPane.showConfirmDialog(null, "El potrero " + nombrePotrero + " posee agua?", "Posee Agua", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        String tipoTerreno = JOptionPane.showInputDialog(null, "Ingrese el tipo de terreno del potrero " + nombrePotrero + ":");

        return new Potrero(nombrePotrero, estado, fechaEntrada, fechaSalida, cantidadAnimales, poseeAgua, tipoTerreno, null);
    }

    private static Ganado crearGanado(String nombreGanado) {
        String codigo = JOptionPane.showInputDialog(null, "Ingrese el código del ganado " + nombreGanado + ":");
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del ganado " + nombreGanado + ":");
        String fechaNacimiento = JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento del ganado " + nombreGanado + ":");
        double ultimoPeso = 0.0;
        boolean pesoValido = false;

        while (!pesoValido) {
            try {
                ultimoPeso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el último peso registrado del ganado " + nombreGanado + ":"));
                pesoValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al ingresar el último peso. Por favor, ingrese un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        String sexo = JOptionPane.showInputDialog(null, "Ingrese el sexo del ganado " + nombreGanado + ":");
        String raza = JOptionPane.showInputDialog(null, "Ingrese la raza del ganado " + nombreGanado + ":");

        return new Ganado(codigo, nombre, fechaNacimiento, ultimoPeso, sexo, raza);
    }
 }
