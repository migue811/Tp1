/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJETO;

import java.util.ArrayList;

/**
 *
 * @author AriasFuentes
 */
public class Pedido {
    
    private String fechap;
    //fecha de pedido
    private String fechae;
    //fecha de devolucion
   Cliente Cliente;
   
   ArrayList<Pelicula> peliculas = new ArrayList<>(); 
   
  
    public String getFechap() {
        return fechap;
    }

    public void setFechap(String fechap) {
        this.fechap = fechap;
    }

    public String getFechae() {
        return fechae;
    }

    public void setFechae(String fechae) {
        this.fechae = fechae;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Pedido{" + "fecha pedido =" + fechap + ", fecha entrega =" + fechae + ", Cliente=" + Cliente + ", peliculas=" + peliculas + '}';
    }

  

    
    
}
