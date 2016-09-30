//Universidad del Valle de Guatemal
//Algoritmos y Estructuras de Datos
//Douglas Barrios
//Seccion 30
//Pablo Lopez 14509
//Jennifer Barillas 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lector {
	
	public void lector() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("pacientes.txt"));
		String line;
	    ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	    while ((line = reader.readLine()) != null)
	    {
	      String[] linea = line.split(", ");
	      Paciente paciente = new Paciente(linea[0], linea[1], linea[2]);
	      pacientes.add(paciente);
      
	    }
	    
	    reader.close();
	    
	    for(Paciente p : pacientes){
	    	System.out.println(p.getPrioridad());
	    }
	}
	
}