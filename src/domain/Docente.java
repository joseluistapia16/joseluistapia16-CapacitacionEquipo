/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Usuario
 */
public class Docente extends Persona{
    private String area;
    private String perfil;

    public Docente() {
    }

    public Docente(String cedula, String nombre, int edad,String area, String perfil) {
        super(cedula, nombre, edad);
        this.area = area;
        this.perfil = perfil;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
      return getCedula()+" "+getNombre()+" "+getEdad()+" "+getArea()+" "+getPerfil();
    }

    @Override
    public void ejemplo() {
        System.out.println("Prueba 2 de metodos abstractos");   
    }
    
    
   
}
