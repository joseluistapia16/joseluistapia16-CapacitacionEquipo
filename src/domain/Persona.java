/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Persona {
    private String cedula;
    private String nombre;
    private String apellidos;
    private String fecha_nacimiento;
    private Integer  n_hijos;
    private String direccion;
    private String id_mail;
    private String telefono; 
    private String id_grupo_sanguineo;
    private String id_area;
    private String estado;
}