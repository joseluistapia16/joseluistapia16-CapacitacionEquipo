/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pelicula {
    private Integer id_pelicula;
    private String nombre;
    private Double duracion;
    private String genero;
    private int anio; 
}
