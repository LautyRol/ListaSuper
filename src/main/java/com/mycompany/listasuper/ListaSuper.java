/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listasuper;

/**
 *
 * @author PUPY
 */
public class ListaSuper {
    //Atributos:
    private Marcas marca;
    private float precio;
    private String calidad;
    private String modelos;
    private int cantidad;
    private int codigo;
    
    //Constructores:

    public ListaSuper(String marca, float precio, String calidad, String modelos, int cantidad, int codigo, String nombre, String logo, String etiqueta) {
        this.marca = new Marcas(codigo,nombre,logo,etiqueta);
        this.precio = precio;
        this.calidad = calidad;
        this.modelos = modelos;
        this.cantidad = cantidad;
        this.codigo = codigo;
    }
    
    public ListaSuper() {
        marca = new Marcas();
        this.precio = 0;
        this.calidad = "";
        this.modelos = "";
        this.cantidad = 0;
        this.codigo = 0;
}
    
    //Getters y Setters:

    public String getLogo() {
        return marca.getLogo();
    }

    public void setLogo(String marca) {
        this.marca.setLogo(marca);
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    //Metodos propios:
    public String toString() {
        return "ListaSuper{" + "marca=" + marca + ", precio=" + precio + ", calidad=" + calidad + ", modelos=" + modelos + ", cantidad=" + cantidad + ", codigo=" + codigo + '}';
    }
    
    public boolean VerificarCantidad(int cantidad){
       return cantidad>0 && cantidad<20;
    
}
}

