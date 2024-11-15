/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package impl;

import domain.Area;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface AreaDAO {
    void save(Area obj);

    void update(Area obj);

    void delete(Integer idArea);

    Area getOne(Integer idArea);
    
    Integer getId(String name);

    List<Area> getAll();
}
