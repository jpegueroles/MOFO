package test;

class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	public static int count = 0;
	
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

public class MainConsole {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] myArray = new int[]{1, 3, 8, 5, 7, };
		
		System.out.println(Persona.count);
		
		Persona per1 = new Persona();
		
		per1.setNombre("Trollencio");
		per1.setApellido("Fukencio");
		per1.setEdad(30);
		
		Persona per2 = new Persona();
		
		System.out.println(Persona.count);
	}

}
