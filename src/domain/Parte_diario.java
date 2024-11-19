/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.sql.Date;
import java.sql.Time;
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
    Time hora_entrada;
    String id_persona;//cedula from persona
    String diagnostico;
    String tratamiento;
    String observacion;
    String permisos;
    Time hora_salida;
    String usuario;
    String estado;
    
    
}
