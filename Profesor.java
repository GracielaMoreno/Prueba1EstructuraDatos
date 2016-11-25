import javax.swing.JOptionPane;


public class Profesor {
	private String nombre;
	private String materia;
	
	public Profesor() {
		super();
	}

	public Profesor(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	

	public void setProfesor () {
		this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor");
		this.materia = JOptionPane.showInputDialog("Ingrese el nombre de la maeria");
		}

	public String getProfesor() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		
		return nombre + "\t Materia:"+ materia;
	}

}
