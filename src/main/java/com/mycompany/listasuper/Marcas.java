/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasuper;

/**
 *
 * @author PUPY
 */
public class Marcas {
    //Atributos:
    private int codigo;
    private String nombre;
    private String logo;
    private String etiqueta;
    
    //Constructores:

    public Marcas(int codigo, String nombre, String logo, String etiqueta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.logo = logo;
        this.etiqueta = etiqueta;
    }
    
    public Marcas() {
        this.codigo = 0;
        this.nombre = "";
        this.logo = "";
        this.etiqueta = "";
    
}
    
    //Getters y Setters:

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    //Metodos propios:
    public String toString() {
        return "Marcas{" + "codigo=" + codigo + ", nombre=" + nombre + ", logo=" + logo + ", etiqueta=" + etiqueta + '}';
    }
    
    
    
}
