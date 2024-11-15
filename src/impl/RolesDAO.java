/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package impl;

import domain.Roles;
import java.util.List;

/**
 *
 * @author user
 */
public interface RolesDAO {
   boolean save(Roles obj);
   
   boolean update(Roles obj);
   
   boolean delete(Integer id_rol);
           
   Roles getOne(Integer id_rol);
   
   Integer getId(String name);
   
   List<Roles> getAll();
   
}
