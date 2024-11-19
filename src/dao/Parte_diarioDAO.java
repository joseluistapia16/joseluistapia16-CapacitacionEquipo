/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;


import domain.Parte_diario;
import java.util.List;




/**
 * Eduardo Zapata y PabloG 15/11/24 15:11
 *
 * @author user
 */
public interface Parte_diarioDAO {

    boolean save(Parte_diario obj);

    boolean update(Parte_diario obj);

    boolean delete(Integer id_partediario);
 
    Parte_diario getOne(Integer id_persona);

    Integer getId(String name);

    List<Parte_diario> getAll();
}
