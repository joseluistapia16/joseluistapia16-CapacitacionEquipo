
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;


import java.util.Date;
import lombok.NoArgsConstructor;

import lombok.Data;

import lombok.ToString;

import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Persona {
    private String cedula;
    private String nombre;
    private String apellidos;
    private Date fecha_nacimiento;
    private Integer  n_hijos;
    private String direccion;
    private Integer id_mail;
    private String telefono; 
    private Integer id_grupo_sanguineo;
    private Integer id_area;
    private String estado;
}
