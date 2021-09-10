/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import paquete2.Heroe;

/**
 *
 * @author 503
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Como Se Utiliza Una Clase?//
        //R= Creando Objetos//
        
         //Que Es Un Objeto?//
         //R= Una Variable//
         
        int edad=50;
        Heroe heroe=new Heroe();
        Enemigo enemigo=new Enemigo();
        
        //Accediendo A ATRIBUTOS
        enemigo.nombre="BORRE";
        heroe.nombre="LUCHO DIAZ";
        
        //Accediendo A Un Atributo Privado//
        heroe.setEdad(-5);
        
        System.out.println(heroe.nombre);
        System.out.println(heroe.getEdad());
    }
    
}
