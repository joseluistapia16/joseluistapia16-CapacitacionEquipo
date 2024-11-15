/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**Eduardo Zapata 15/11/24  14:47
 **
 * @author user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FichaMedica {
    private int id_fichaMedica;
    private int fecha_registro;
    private Integer id_persona;
    private String ant_patologicos_per;
    private String ant_patologicos_fam;
    private String habito;
    private String estado_actual;
    private String examen_fisico;
    private String examen_comple;
    private String firma;
    private String foto;
    private Integer id_usuario;
    private String estado;
    
}
