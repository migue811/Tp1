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
public class Tarjeta {
    private Integer id;
    private Integer saldo;
    
    Socio socio;

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "id=" + id + ", saldo=" + saldo + '}';
    }
    
    
}
