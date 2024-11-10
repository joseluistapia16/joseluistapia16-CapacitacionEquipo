/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrudArea {

    private Conexion conexion;

    public CrudArea() {
        this.conexion = new Conexion();
    }

    public List<Area> getAll(String base, String query) {
        List<Area> datos = new ArrayList<>();

        try (   
                Connection conect = conexion.conectar(base); 
                PreparedStatement st = conect.prepareStatement(query); 
                ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                Area area = new Area(rs.getInt("id_area"), rs.getString("nombre_area"),
                        rs.getInt("id_usuario"), rs.getString("estado"));
                datos.add(area);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudArea.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datos;
    }
}
