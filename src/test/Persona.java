package test;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    protected static int count = 0;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona() {
        count++;
    }

    public void setInfo(String nombre, String apellidp, int edad) {
        setNombre(nombre);
        setApellido(apellidp);
        setEdad(edad);
    }
}
