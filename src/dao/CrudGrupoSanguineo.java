/* Héctor Drouet
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.GrupoSanguineo;
import impl.GrupoSanguineoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrudGrupoSanguineo implements GrupoSanguineoDAO {
    private String base = "tercerca";
    private Conexion conexion;
    
    public CrudGrupoSanguineo() {
        this.conexion = new Conexion();
    }

    @Override
    public boolean save(GrupoSanguineo obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(GrupoSanguineo obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Integer idGrupoSanguineo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public GrupoSanguineo getOne(Integer idGrupooSanguineo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer getId(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<GrupoSanguineo> getAll() {
        List<GrupoSanguineo> datos = new ArrayList<>();
        var query = "select id_usuario from GrupoSanguineo where estado='A'";
        try (
                Connection conect = this.conexion.conectar(base); PreparedStatement st = conect.prepareStatement(query); ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                GrupoSanguineo gruposanguineo = new GrupoSanguineo(rs.getInt("id_GrupoSanguineo"), rs.getString("nombre_GrupoSanguineo"),
                        rs.getInt("id_usuario"), rs.getString("estado"));
                datos.add(gruposanguineo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudGrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datos;
    }
}
