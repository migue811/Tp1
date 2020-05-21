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
public class Usuario extends Cliente {
    
    private Integer Id;
    private String pelicula;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return Dni;
    }

    public void setDni(Integer Dni) {
        this.Dni = Dni;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + ", pedido=" + pedido + ", Id=" + Id + ", pelicula=" + pelicula + '}';
    }

 
}
