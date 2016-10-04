//Universidad del Valle de Guatemal
//Algoritmos y Estructuras de Datos
//Douglas Barrios
//Seccion 30
//Pablo Lopez 14509

public class Paciente {
	
	private String nombre; 
	private String enfermedad;
	private String prioridad;
	
	public Paciente(String nombre, String enfermedad, String prioridad){
		this.nombre = nombre;
		this.enfermedad = enfermedad;
		this.prioridad = prioridad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	
	
}
