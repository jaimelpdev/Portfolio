package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer02b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		final String NOMBRE_ARCHIVO = "ficheros/contactos.txt";

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));

			for (int i = 0; i < 3; i++) {
				System.out.println("Persona " + (i + 1) + ":");
				System.out.print("Nombre: ");
				String nombre = entrada.nextLine();
				System.out.print("Apellidos: ");
				String apellidos = entrada.nextLine();
				System.out.print("Teléfono: ");
				String telefono = entrada.nextLine();

				bw.write(apellidos + ", " + nombre + ", " + telefono);

				bw.close();
			}

		} catch (IOException e) {
			System.out.println("No se ha encontrado la ruta del archivo.");
		}

	}

}