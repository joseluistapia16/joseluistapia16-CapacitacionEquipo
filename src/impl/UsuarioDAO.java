/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package impl;


import domain.Usuario;
import java.util.List;

/**
 *
 * @author user
 */
public interface UsuarioDAO {
    String save(Usuario obj);
    String update (Usuario obj);
    String delete (String usuario);
    Usuario getOne(String usuario);
    Integer getId(String usuario);
    List<Usuario> getAll();
    Usuario getLoging(String usuario, String password);
}
