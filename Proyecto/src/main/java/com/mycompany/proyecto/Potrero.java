/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author jerjo
 */
public class Potrero {
    private String codigo;
    private String nombre;
    private String estado;
    private String fechaEntrada;
    private String fechaSalida;
    private int cantidadAnimales;
    private boolean poseeAgua;
    private String tipoTerreno;

    public Potrero(String codigo, String nombre, String estado, String fechaEntrada, String fechaSalida, int cantidadAnimales, boolean poseeAgua, String tipoTerreno) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidadAnimales = cantidadAnimales;
        this.poseeAgua = poseeAgua;
        this.tipoTerreno = tipoTerreno;
    }

    Potrero(String potrero_A1, String string, String string0, String string1, String string2, int i, boolean b, String string3, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Potrero(String nombrePotrero, String estado, String fechaEntrada, String fechaSalida, int cantidadAnimales, boolean poseeAgua, String tipoTerreno, Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public boolean isPoseeAgua() {
        return poseeAgua;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setCantidadAnimales(int cantidadAnimales) {
        this.cantidadAnimales = cantidadAnimales;
    }

    public void setPoseeAgua(boolean poseeAgua) {
        this.poseeAgua = poseeAgua;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }
    
    
}
