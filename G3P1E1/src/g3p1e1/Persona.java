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
public class Persona {
    
    private String nombre, apellido;
    private int edad, documento;
    private Perros perro1;
    private Perros perro2;
    private Perros perro3;

    public  Persona(String nombre, String apellido, int edad, int documento) {
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perros getPerro1() {
        return perro1;
    }

    public void setPerro1(Perros perro1) {
        this.perro1 = perro1;
    }

    public Perros getPerro2() {
        return perro2;
    }

    public void setPerro2(Perros perro2) {
        this.perro2 = perro2;
    }

    public Perros getPerro3() {
        return perro3;
    }

    public void setPerro3(Perros perro3) {
        this.perro3 = perro3;
    }

    public void adoptarPeroo(Perros p1, Persona per1) {
        if (per1.getPerro1() == null) {
            per1.setPerro1(p1);
            System.out.println("Esta persona a adoptado el perro: " + p1.getNombre());
        } else {
            if (per1.getPerro2() == null) {
                per1.setPerro2(p1);
                System.out.println("Esta persona a adoptado el perro: " + p1.getNombre());
            } else {
                if (per1.getPerro3() == null) {
                    per1.setPerro3(p1);
                    System.out.println("Esta persona a adoptado el perro: " + p1.getNombre());
                } else {
                    System.out.println("Ya no puede adoptar mas perros");
                }
            }
        }
    }
    public Perros perroMasGrande(){
        Perros aux;
        if(perro1.getEdad() > perro2.getEdad() && perro1.getEdad() > perro3.getEdad()){
           aux = perro1;
        } else {
             if(perro2.getEdad() > perro1.getEdad() && perro2.getEdad() > perro3.getEdad()){
                aux = perro2;
             } else {
                aux = perro3;
             }
        }
        return aux;
    }
}
