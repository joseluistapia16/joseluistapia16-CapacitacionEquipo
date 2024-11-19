/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package impl;

import domain.Persona;
import java.util.List;

/*Jose Luis Romero Rodriguez 12/11/2024 12:15PM
*/
public interface PersonaDAO {

    void save(Persona obj);

    void update(Persona obj);

    void delete(String cedula);

    Persona getOne(String cedula);

    List<Persona> getAll();
}
