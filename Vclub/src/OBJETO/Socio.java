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
public class Socio extends Cliente{
    private Integer idsocio;
    private String aquiler;
    
    Tarjeta tarjeta;

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Integer getIdsocio() {
        return idsocio;
    }

    public void setIdsocio(Integer idsocio) {
        this.idsocio = idsocio;
    }

    public String getAquiler() {
        return aquiler;
    }

    public void setAquiler(String aquiler) {
        this.aquiler = aquiler;
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

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni  + ", idsocio=" + idsocio + ", operacion=" + aquiler +'}';
    }
     
    
}
