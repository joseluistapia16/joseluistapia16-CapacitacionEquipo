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
public class Carro {
    private int Llantas;
    private String Color;
    private Integer Pernos;
    private int Asientos;
    private String Marca;
}