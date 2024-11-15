package domain;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona{
    private Double sueldo;
    private String departamento;

    public Empleado() {
    }

    public Empleado( String cedula, String nombre, int edad,Double sueldo, String departamento) {
        super(cedula, nombre, edad);
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return getCedula()+" "+getNombre()+" "+getEdad()+" "+getSueldo()+" "+getDepartamento();
    }

    @Override
    public void ejemplo() {
        System.out.println("Esto es un metodo abstracto");  
    }
    
    
    
    
}
