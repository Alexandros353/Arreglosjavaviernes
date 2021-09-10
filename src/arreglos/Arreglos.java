/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;
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
        
        Scanner  entrada = new Scanner(System.in);
        int[] numeros=new int[5];
        
        
        for(int i=0;i<numeros.length;i++){
            
            System.out.println("Digita un numero: ");
            numeros[1]=entrada.nextInt();
            
            
            
        }
            for(int i=0;i<numeros.length;i++){
            
            System.out.println(i);
            
        }
        
        
        //Como Se Utiliza Una Clase?//
        //R= Creando Objetos//
        
         //Que Es Un Objeto?//
         //R= Una Variable//
         
       
        Heroe heroe=new Heroe();
        Enemigo enemigo=new Enemigo();
        
        //Accediendo A ATRIBUTOS
        enemigo.nombre="BORRE";
        heroe.nombre="LUCHO DIAZ";
        
        //Accediendo A Un Atributo Privado//
        heroe.setEdad(-5);
        
        //System.out.println(heroe.nombre);
        //System.out.println(heroe.getEdad());//
    }
    
}
