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
public class Cliente {
    public String nombre;
    public String apellido;
    public Integer Dni;
    
    Pedido pedido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + ", pedido=" + pedido + '}';
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

   
    
}
