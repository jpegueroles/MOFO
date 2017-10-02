package test;

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
        per2.setNombre("Tulio");
        per2.setApellido("Triviño");
        per2.setEdad(69);

        System.out.println(Persona.count);
        StringBuilder strb = new StringBuilder("");
        strb.append("Hola soy un StringBuilder");

        System.out.println(strb);
	}
}
