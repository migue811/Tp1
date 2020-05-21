/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJETO;

/**
 *
 * @author AriasFuentes
 */
public class Pelicula {
    
   private Integer idp;
   private String nombre;
   private String estado;
   
   Pedido pedido;
   

    public Integer getIdp() {
        return idp;
    }

    public void setIdp(Integer idp) {
        this.idp = idp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idp=" + idp + ", nombre=" + nombre + ", estado=" + estado + ", pedido=" + pedido + '}';
    }

   
  

    
}
