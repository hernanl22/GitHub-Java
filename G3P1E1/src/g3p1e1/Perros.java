/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g3p1e1;

/**
 *
 * @author Administrador
 */
    public class Perros {

    private String nombre, raza,tamanio;
    private int edad;

    public void Perros(String nombre, String raza, int edad, String tamanio) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
    }
    public void Perros(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}
