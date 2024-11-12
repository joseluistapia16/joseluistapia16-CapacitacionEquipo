/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capacitacionproyecto;

import dao.Conexion;
import dao.CrudArea;
import domain.Area;
import domain.Carro;
import domain.Docente;
import domain.Empleado;
import domain.Pelicula;
import domain.Persona;
import domain.Vehiculo;
import domain.estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Luis Tapia
 */
public class CapacitacionProyecto {

    /* Cambio 6 de Noviembre 2024*/
    static int u = 0;
    static String direccion;

    public static void main(String[] args) {
        basedatos();
//        carro();
//        Versionew();
        //Lombok();
        //herencia();
        //instancias();
        //tipos();
//        Prueba.metodo();
//        System.out.println(" variable X"+Prueba.x);
        // inicio de capacitacion
//        inicio();
//        u =80;
//        var r= getSuma(20, 10);
//        double precio;
//        var num =0;
//        var valor = 0.0;
//        var nombre ="";
//        var res = true;
//        String apellido;
//        direccion = "Urdesa";
//        System.out.println("Resultado:"+r);
//        System.out.println(getSuma(10, 8));
    }

    private static void carro() {
        var obj = new Carro(4, "Gris", 20, 5, "Audi");
        System.out.println(obj.toString());
    }

    private static void Versionew() {
        Carro vob = new Carro();
        vob.setLlantas(4);
        vob.setColor("Blanco");
        vob.setPernos(500);
        vob.setAsientos(5);
        vob.setMarca("Audi");
        System.out.println(vob.toString());
    }

    private static void basedatos() {

        List<Area> lista = new ArrayList<>();
        CrudArea crud = new CrudArea();
        lista = crud.getAll();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }

    }

    private static void prueba2() {
        var obj = new Pelicula(1, "Jason X", 120.89, "Terror", 2005);
        System.out.println(obj.toString());
    }

    public static int getSuma(int x, int y) {
        u = 45;
        return x + y;
    }

    public static void inicio() {
        double precio;
        var num = 0;
        var valor = 0.0;
        var nombre = "";
        var res = true;
        u = 90;
        System.out.println("Hola ");
    }

    static void tipos() {
        String cad;
        Double valor = 100.0;
        int a;
        double b;
        byte c = 7;
        boolean k;
        long num;
        byte m;
        char car = 'k';
        System.out.println(c);
        num = 90;
        cad = "Curso";
        System.out.println("long:" + num + " " + car);
        System.out.println("referenciado " + cad.toUpperCase()
                + " " + valor.toString());
    }

    static void instancias() {
        // Prueba
//       Persona obP = new Persona();
//       obP.setCedula("03939376");
//       obP.setNombre("Jose Lopez");
//       obP.setEdad(68);
//       System.out.println(obP.toString());
//       System.out.println(obP.getCedula()+" "+obP.getEdad());
//       obP.cadena = "Hola mundo";
//       System.out.println(obP.cadena);
//       System.out.println("****************");
//       Persona obP1 = new Persona("029272", "Carla Lima");
//       obP1.setCedula("08476868");
//       System.out.println(obP1.toString());
//       System.out.println("***************");
//       var obP2 = new Persona("03938", "Jorge Gonzalez",56);
//       System.out.println(obP2.toString());
    }

    private static void herencia() {
//      Persona obj = new Persona("0333773", "Jose Lopez", 56);
//      System.out.println(obj.toString());
        Empleado obj1 = new Empleado("037252", "Carlos Perez", 67, 1200.0, "Sistemas");
        System.out.println(obj1.toString());
        obj1.ejemplo();
        Docente obj2 = new Docente("072726", "Miriam Gonzalez", 45,
                "Informatica", "Robotica");
        System.out.println(obj2.toString());
        obj2.ejemplo();
    }

    private static void Lombok() {
        Vehiculo vob = new Vehiculo();
        vob.setMatricula("GHJ0987");
        vob.setMarca("Toyota");
        vob.setModelo("2023");
        vob.setN_velocidades(5);
        System.out.println(vob.toString());
        Vehiculo obj = new Vehiculo("PML0876", "Datsun",
                "2018", 6);
        System.out.println(obj.toString());
        // Lombok
    }
    private static void Persona(){
        Persona vob= new Persona();
        vob.setCedula("0959449059");
        vob.setNombre("Jose Luis ");
        
    }
}

class Prueba {

    public static int x = 60;

    public static void metodo() {
        System.out.println("Metodo llamado directamente");
    }
}
