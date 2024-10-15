/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Jose Luis Tapia
 * 8 de octubre 2024
 * 21:34 pm
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int n_velocidades;

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", n_velocidades=" + n_velocidades + '}';
    }
    
    
}
