/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package impl;


import domain.EstadoCivil;
import java.util.List;

/**
 *
 * @author user
 */
public interface EstadoCivilDAO {
 void save(EstadoCivil obj);

    void update(EstadoCivil obj);

    void delete(Integer idEstadoCivil);

    EstadoCivil getOne(Integer idEstadoCivil);
    
    Integer getId(String name);

    List<EstadoCivil> getAll();
}