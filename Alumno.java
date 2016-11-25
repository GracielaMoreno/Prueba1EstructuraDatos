import javax.swing.JOptionPane;


public class Alumno {
 
	private String nombre;
		private String materia;
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
		}
	
	public void setAlumno () {
		this.nombre =JOptionPane.showInputDialog("Ingrese el nombre del alumno");
		this.materia =JOptionPane.showInputDialog("Ingrese el nombre de la materia a tomar");
	}

	public String getNombre() {
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
		
		return nombre +"\tMateria:"+materia ;
	}

}
