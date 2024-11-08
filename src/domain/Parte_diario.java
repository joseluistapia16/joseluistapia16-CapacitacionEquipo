/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.time.LocalTime;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Parte_diario {
    int id_partediario;
    Date fecha_registro;
    LocalTime hora_entrada;
    String id_persona;//cedula from persona
    String diagnostico;
    String tratamiento;
    String observacion;
    String permisos;
    LocalTime hora_salida;
    String usuario;
    String estado;
    
    
}
