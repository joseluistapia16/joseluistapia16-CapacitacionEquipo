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
public class GrupoSanguineo {
    private Integer id_grupo_sanguineo;
    @NonNull
    private String nombre;
    @NonNull
    private Integer id_usuario;
    @NonNull
    private String estado;

}
