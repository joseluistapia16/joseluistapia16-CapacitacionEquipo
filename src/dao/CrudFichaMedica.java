/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

//import domain.FichaMedica;
//import domain.Usuario;
//import impl.FichaMedicaDAO;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.util.ArrayList;
/**
 *
 * @author user
 */
//public abstract class CrudFichaMedica implements FichaMedicaDAO {
//
//    private String base = "practica_capacitacion";
//    private Conexion conexion;
//
//    public CrudFichaMedica() {
//        this.conexion = new Conexion();
//    }


//    /**
//     *
//     * @param obj
//     * @return
//     */
//    public String save (FichaMedica obj) {
//    String msg = null;
//    var sql = "INSERT INTO FichaMedica(id_usuario, usuario, password, nombre, apellido, correo, id_rol, id_usuario_registro, estado)"
//            + "values(?,?,?,?,?,?,?,?)";
//    try (
//            java.sql.Connection conect = this.conexion.conectar(base); PreparedStatement st = conect.prepareStatement(sql)) {
//        st.setInt(1, obj.getid_fichaMedica());
//        st.setDate(2, obj.getfecha_registro());
//        st.setString(3, obj.getid_persona());
//        st.setString(4, obj.getant_patologicos_per());
//        st.setString(5, obj.getant_patologicos_fam());
//        st.setString(6, obj.gethabito());
//        st.setString(7, obj.getestado_actual());
//        st.setString(8, obj.getexamen_fisico());
//        st.setString(9, obj.getexamen_complementario());
//        st.setString(10, obj.getfirma());
//        st.setString(11, obj.getfoto());
//        st.setString(12, obj.getid_usuario());
//        st.setString(13, obj.getestado());
//        st.executeUpdate();
//        msg = "Datos guardados...";
//    } catch (SQLException ex) {
//        msg = "" + ex;
//        // Logger.getLogger(CrudArea.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    return msg;
//    }
//
//    /**
//     *
//     * @param obj
//     * @return
//     */
//    public String update(FichaMedica obj) {
//        String msg = null;
//        var query = "UPDATE usuario SET password = ?, nombre = ?, apellido =?, correo  =?, id_rol = ? WHERE username = ?";
//        try (
//                java.sql.Connection conect = this.conexion.conectar(base); PreparedStatement st = conect.prepareStatement(query)) {
//        st.setInt(1, obj.getid_fichaMedica());
//        st.setDate(2, obj.getfecha_registro());
//        st.setString(3, obj.getid_persona());
//        st.setString(4, obj.getant_patologicos_per());
//        st.setString(5, obj.getant_patologicos_fam());
//        st.setString(6, obj.gethabito());
//        st.setString(7, obj.getestado_actual());
//        st.setString(8, obj.getexamen_fisico());
//        st.setString(9, obj.getexamen_complementario());
//        st.setString(10, obj.getfirma());
//        st.setString(11, obj.getfoto());
//        st.setString(12, obj.getid_usuario());
//        st.setString(13, obj.getestado());
//            st.executeUpdate();
//            msg = "Datos guardados...";
//        } catch (SQLException ex) {
//            msg = "" + ex;
//            Logger.getLogger(CrudArea.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return msg;
//    }
