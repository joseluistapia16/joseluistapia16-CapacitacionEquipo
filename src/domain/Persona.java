/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author USUARIO
 */
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class Persona {
    
    private int cedula;
    private String nombres;
    private String apellidos;
    private Date fecha_nacimiento;
    private int n_hijos;
    private String direccion;
    private String id_mail;
    
    public Persona(int cedula, String nombres, String apellidos, Date fecha_nacimiento, int n_hijos, String direccion, String id_mail) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.id_rol = id_rol;
        this.estado = estado;
    }
}
    

