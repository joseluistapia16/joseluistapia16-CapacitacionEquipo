/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 *
 * @author user
 */
@Data
@NoArgsConstructor
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Usuario {

    private String usuario;
    @NonNull
    private String password;
    @NonNull
    private String nombre;
    @NonNull
    private String apellido;
    @NonNull
    private String correo;
    @NonNull
    private Integer id_rol;
    @NonNull
    private String id_usuario_registro;
    @NonNull
    private String estado;

}
