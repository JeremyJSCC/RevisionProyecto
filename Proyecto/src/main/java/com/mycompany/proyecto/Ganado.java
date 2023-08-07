/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author jerjo
 */
public class Ganado {
    private String codigo;
    private String nombre;
    private String fechaNacimiento;
    private double ultimoPeso;
    private String sexo;
    private String raza;

    public Ganado(String codigo, String nombre, String fechaNacimiento, double ultimoPeso, String sexo, String raza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.ultimoPeso = ultimoPeso;
        this.sexo = sexo;
        this.raza = raza;
    }

    Ganado(String codigo, String nombre, String fechaNacimiento, String raza, double ultimoPeso, String sexo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getUltimoPeso() {
        return ultimoPeso;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setUltimoPeso(double ultimoPeso) {
        this.ultimoPeso = ultimoPeso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nNombre: " + nombre +
                "\nFecha de Nacimiento: " + fechaNacimiento +
                "\nÚltimo Peso: " + ultimoPeso +
                "\nSexo: " + sexo +
                "\nRaza: " + raza;
    }
}
