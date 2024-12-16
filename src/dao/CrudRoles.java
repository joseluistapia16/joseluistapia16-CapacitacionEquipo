/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import domain.Roles;
import impl.RolesDAO;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Pablo Garcia 15/11/24 11:25
 *
 * @author user
 */
public class CrudRoles implements RolesDAO {

   private String base = "fichas_medicas_desarrollo";
    private Conexion conexion;

    public CrudRoles() {
         conexion = new Conexion();
    }
  

    @Override
    public List<Roles> getAll() {
      List<Roles> datos = new ArrayList<>();
        var query = "select * from roles where estado='A'";
        try (
                Connection conect = this.conexion.conectar(base); PreparedStatement st = conect.prepareStatement(query); ResultSet rs = st.executeQuery()) {

            while (rs.next()) { 
                Roles rol = new Roles(rs.getInt("id_rol"), rs.getString("nombre"),
                        rs.getString("id_usuario"), rs.getString("estado"));
                datos.add(rol);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudRoles.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datos;

    }

    @Override
    public boolean save(Roles obj) {
        var query = "INSERT INTO rol (nombre, id_usuario, estado) VALUES (?, ?, ?)";
        try (
                Connection conect = this.conexion.conectar(base); PreparedStatement st = conect.prepareStatement(query)) {
            st.setString(1, obj.getNombre());     // Asigna el nombre del rol
            st.setString(2, obj.getId_usuario());         // Asigna el ID del usuario
            st.setString(3, obj.getEstado());         // Asigna el estado ('A' o 'I')
            int rowsAffected = st.executeUpdate();     // Ejecuta la inserción
            return rowsAffected > 0;                   // Retorna true si se insertaron filas
        } catch (SQLException ex) {
            Logger.getLogger(CrudRoles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public boolean update(Roles obj) {
        var query = "UPDATE rol SET nombre = ?, estado = ? WHERE id_rol = ?";
        try (
                Connection conect = this.conexion.conectar(base); PreparedStatement st = conect.prepareStatement(query)) {
            st.setString(1, obj.getNombre());     // Asigna el nombre del rol
            st.setString(2, obj.getEstado());          // Asigna el estado ('A' o 'I')
            st.setInt(3, obj.getId_rol());            // Asigna el ID del rol para actualizar
            int rowsAffected = st.executeUpdate();     // Ejecuta la actualización
            return rowsAffected > 0;                   // Retorna true si se actualizaron filas
        } catch (SQLException ex) {
            Logger.getLogger(CrudRoles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public boolean delete(Integer id_rol) {
        var query = "UPDATE rol SET  estado = ? WHERE id_rol = ?";
        try (
                Connection conect = this.conexion.conectar(base); PreparedStatement st = conect.prepareStatement(query)) {
            st.setString(1, "I");          // Asigna el estado ('A' o 'I')
            st.setInt(2, id_rol);
            // Asigna el ID del rol para actualizar
            int rowsAffected = st.executeUpdate();     // Ejecuta la actualización
            return rowsAffected > 0;                   // Retorna true si se actualizaron filas
        } catch (SQLException ex) {
            Logger.getLogger(CrudRoles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

        
    }

    @Override
    public Roles getOne(Integer id_rol) {
        Roles roles = null;
        var query = "SELECT * FROM roles WHERE id_rol = ? AND estado = 'A'";
        try (
                Connection conect = this.conexion.conectar(base);
                PreparedStatement st = conect.prepareStatement(query)) {
            st.setInt(1, id_rol);                      // Asigna el id_rol al parámetro de la consulta
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {                       // Si se encuentra un resultado
                    roles = new Roles(
                            rs.getInt("id_rol"),
                            rs.getString("nombre"),
                            rs.getString("id_usuario"),
                            rs.getString("estado")
                    );
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudRoles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return roles;
        
    }

    @Override
    public Integer getId(String name) {
        var query = "SELECT id_rol FROM roles WHERE nombre = ? AND estado = 'A'";
        try (
                Connection conect = this.conexion.conectar(base); PreparedStatement st = conect.prepareStatement(query)) {
            st.setString(1, name);                     // Asigna el nombre del rol a buscar
            ResultSet rs = st.executeQuery();          // Ejecuta la consulta
            if (rs.next()) {                           // Verifica si hay resultados
                return rs.getInt("id_rol");           // Retorna el id_rol encontrado
            }
        } catch (SQLException ex) {
                Logger.getLogger(CrudRoles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

        
    }

}
