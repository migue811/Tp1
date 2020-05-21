/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import OBJETO.Cliente;
import OBJETO.Usuario;
import OBJETO.Socio;
import OBJETO.Pedido;
import OBJETO.Pelicula;
import OBJETO.Tarjeta;
import java.util.ArrayList;

/**
 *
 * @author AriasFuentes
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario c = new Usuario();
        c.setNombre("Ivana");
        c.setApellido("Fuentes");
        c.setDni(36605879);
        c.setId(000001);
      
        
    
        System.out.println(c);
        
        Socio ce = new Socio();
        ce.setNombre("isabella");
        ce.setApellido("Arias");
        ce.setDni(52510840);
        ce.setIdsocio(0002);
        ce.setAquiler("Aquilar");
        
        System.out.println(ce);
        
        Pedido d = new Pedido();
        d.setFechae("12/03/2020");
        d.setFechap("10/03/2020");
        d.setCliente(ce);
     
        System.out.println(d);
        
           Pedido a = new Pedido();
        a.setFechae("12/03/2020");
        a.setFechap("Ninguna");
        a.setCliente(c);
        
     
        System.out.println(a);
        
        Pelicula peliculas = new Pelicula();
        peliculas.setNombre("frozen");
        peliculas.setPedido(a);
        peliculas.setIdp(223344);
        peliculas.setEstado("alquilada");
        System.out.println(peliculas);
        
         Pelicula peli = new Pelicula();
        peli.setNombre("Titanic");
        peli.setPedido(d);
        peli.setIdp(223346);
        peli.setEstado("comprada");
          peliculas.setPedido(a);
          
          System.out.println(peli);
    }
    

}


