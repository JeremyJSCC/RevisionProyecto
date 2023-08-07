/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author jerjo
 */
public class Finca {
    private String nombre;
    private String ubicacion;
    private String nombreEncargado;
    private int cedulaEncargado;
    private int telefonoEncargado;
    private int cantidadPotreros;
    private int tamañoFinca;
    private int cantidadAnimales;
    private Potrero[][] potreros;

    public Finca(String nombre, String ubicacion, String nombreEncargado, int cedulaEncargado, int telefonoEncargado,
                 int cantidadPotreros, int tamañoFinca, int cantidadAnimales) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nombreEncargado = nombreEncargado;
        this.cedulaEncargado = cedulaEncargado;
        this.telefonoEncargado = telefonoEncargado;
        this.cantidadPotreros = cantidadPotreros;
        this.tamañoFinca = tamañoFinca;
        this.cantidadAnimales = cantidadAnimales;
        this.potreros = new Potrero[cantidadPotreros][1];
    }

    Finca(String nombreFinca, String ubicacion, String nombreEncargado, int cedulaEncargado, int telefonoEncargado, int cantidadPotreros, int tamañoFinca, int cantidadAnimales, Potrero[][] potreros) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public int getCedulaEncargado() {
        return cedulaEncargado;
    }

    public int getTelefonoEncargado() {
        return telefonoEncargado;
    }

    public int getCantidadPotreros() {
        return cantidadPotreros;
    }

    public int getTamañoFinca() {
        return tamañoFinca;
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public Potrero[][] getPotreros() {
        return potreros;
    }

    public void agregarPotrero(Potrero potrero) {
        if (cantidadPotreros < potreros.length) {
            potreros[cantidadPotreros] = new Potrero[] { potrero };
            cantidadPotreros++;
        }
    }

    public void eliminarPotrero(int indice) {
        if (indice >= 0 && indice < cantidadPotreros) {
            for (int i = indice; i < cantidadPotreros - 1; i++) {
                potreros[i] = potreros[i + 1];
            }
            potreros[cantidadPotreros - 1] = null;
            cantidadPotreros--;
        }
    }

    public Potrero obtenerPotrero(int indice) {
        if (indice >= 0 && indice < cantidadPotreros) {
            return potreros[indice][0];
        }
        return null;
    }

    public void modificarPotrero(int indice, Potrero potrero) {
        if (indice >= 0 && indice < cantidadPotreros) {
            potreros[indice][0] = potrero;
        }
    }

    public String consultarPotreros() {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < cantidadPotreros; i++) {
            info.append("Potrero ").append(i + 1).append(": ").append(potreros[i][0].toString()).append("\n");
        }
        return info.toString();
    }

    public String toString() {
        return "Nombre: " + nombre + "\nUbicación: " + ubicacion + "\nEncargado: " + nombreEncargado + "\nCédula: "
                + cedulaEncargado + "\nTeléfono: " + telefonoEncargado + "\nTamaño: " + tamañoFinca + " hectáreas"
                + "\nCantidad de Potreros: " + cantidadPotreros + "\nCantidad de Animales: " + cantidadAnimales
                + "\n\nPotreros:\n" + consultarPotreros();
    }
    
}
