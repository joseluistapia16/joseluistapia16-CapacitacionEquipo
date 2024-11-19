/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Representa el estado civil de una persona.
 * 
 * @author user
 */
@Data
@ToString 
@RequiredArgsConstructor 
public class EstadoCivil { 
    private Integer idEstadoCivil;  // ID del estado civil
    @NonNull 
    private String nombreEstadoCivil;  // Nombre del estado civil
    @NonNull 
    private Integer idUsuario;  // ID del usuario relacionado
    @NonNull 
    private String estado;  // Estado civil (soltero, casado, etc.)
}

