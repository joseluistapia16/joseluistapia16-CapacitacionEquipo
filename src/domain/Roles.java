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
@AllArgsConstructor
@ToString

/**
 *
 * @author userasdasdasd
 */
public class Roles {

    private int id_rol;
    String nombre;
    String id_usuario;
    String estado;

    public Roles(String nombre, String id_usuario, String estado) {
        this.nombre = nombre;
        this.id_usuario = id_usuario;
        this.estado = estado;
    }
    
    
}
