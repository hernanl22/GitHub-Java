/*
 1. Realizar un programa para que una Persona pueda adoptar hasta tres Perros. 
Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre, raza, 
edad y tamaño, un constructor que permita inicializar todos sus atributos y 
los respectivos métodos getter y setter de sus atributos; y la clase Persona 
con atributos: nombre, apellido, edad, documento y tres atributos de tipo Perro, 
un constructor que sólo permita inicializar los atributos: nombre, apellido, 
edad y documento. 
La Persona cuenta además con los siguientes métodos:
adoptarPerro() Este método recibe por parámetro un Perro y lo asigna en 
alguna de las variables vacías; si todas las variables atributos Perro están 
ocupadas, mostrará un mensaje “Ya no puedo adoptar”.
perroMasGrande() Este método retornará el Perro de mayor edad.

Ahora deberemos en el main crear una Persona y 4(cuatro) Perros. Después, 
vamos a hacer que persona adopte cada uno de esos Perros (luego al ejecutar 
veremos que pasa), por último pediremos a la Persona que nos diga cual es el Perro más viejo.
 */
package g3p1e1;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class G3P1E1 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Perros perro1 = new Perros();
    Perros perro2 = new Perros();
    Perros perro3 = new Perros();
    Perros perro4 = new Perros();
    
    Persona humano = new Persona("Hernan","Lopez",39,12345678);
    
        System.out.println("Ingrese el nombre,raza,edad y tamanio del perro 1");
        perro1.setNombre(sc.next());
        perro1.setRaza(sc.next());
        perro1.setEdad(sc.nextInt());
        perro1.setTamanio(sc.next());
    
       System.out.println("Ingrese el nombre,raza,edad y tamanio del perro 2");
        perro2.setNombre(sc.next());
        perro2.setRaza(sc.next());
        perro2.setEdad(sc.nextInt());
        perro2.setTamanio(sc.next());
    
        System.out.println("Ingrese el nombre,raza,edad y tamanio del perro 3");
        perro3.setNombre(sc.next());
        perro3.setRaza(sc.next());
        perro3.setEdad(sc.nextInt());
        perro3.setTamanio(sc.next());
        
        
         System.out.println("Ingrese el nombre,raza,edad y tamanio del perro4");
        perro4.setNombre(sc.next());
        perro4.setRaza(sc.next());
        perro4.setEdad(sc.nextInt());
        perro4.setTamanio(sc.next());
    
        
        System.out.println("Adoptar un perro");
        humano.adoptarPeroo(perro1, humano);
        humano.adoptarPeroo(perro2, humano);
        humano.adoptarPeroo(perro3, humano);
        humano.adoptarPeroo(perro4, humano);
    
        
        System.out.println("El perro de mayor eada es : " + humano.perroMasGrande().getNombre());
    }

    
}
