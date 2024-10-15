/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * Cambio 2
 * 2024
 */

abstract public class Persona {
    public String cadena;
    private String cedula;
    private String nombre;
    private int edad;
    
    public Persona(String cedula, String nombre, int edad){
        this.cedula= cedula;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona (String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    public Persona(){
        
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }   
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getCedula(){
        return this.cedula;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return edad;
    }

    @Override
    public String toString() {
        return getCedula()+" "+getNombre()+" "+getEdad(); 
    }
    
    abstract public void ejemplo();
}
