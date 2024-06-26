package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Ejemplo09JFileChooser2 {

	public static void main(String[] args) {

		JFileChooser elegirArchivo = new JFileChooser();

		int eleccion = elegirArchivo.showOpenDialog(null);

		if (eleccion != JFileChooser.APPROVE_OPTION) {
			return;
		}

		File archivoElejido = elegirArchivo.getSelectedFile();

		try {
			BufferedReader br = new BufferedReader(new FileReader(archivoElejido));

			String linea = br.readLine();

			while (linea != null) {
				System.out.println(linea);
				
				linea = br.readLine();
			}

			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido abrir el archivo.");
		} catch (IOException e) {
			System.out.println("Se ha producido un error al leer el archivo.");
		}

	}

}
