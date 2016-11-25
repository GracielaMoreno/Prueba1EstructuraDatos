import javax.swing.JOptionPane;


public class ListaAlumno {
	private Alumno alumnos [];

	public ListaAlumno(int dimension) {
		super();
		this.alumnos = new Alumno [dimension];
	}

	public Alumno[] getAlumno() {
		return alumnos;
	}

	public void setAlumno() {
		
		for ( int i=0; i < this.alumnos.length; i++) {
			
			this.alumnos[i] = new Alumno();
			alumnos[i].setAlumno();
		}
	}
	
	public String [] vectoMateria() {
		
		String materialumno[] = {""};
		for (int i=0; i<alumnos.length; i++) {
			
			materialumno[i] = alumnos[i].getMateria();
		}
		
		return materialumno;
	}
			
	public void BuscarAlum(){
		System.out.println("buscar numero");
		String comparador;
		comparador=JOptionPane.showInputDialog("INGRESE EL DATO QUE DESEA BUSCAR");
		int i;
		for(i=0;i<alumnos.length;i++){
            if (alumnos[i].equals(comparador)) {
               JOptionPane.showMessageDialog(null,"El profesor esta en el indice "+i+", en la posicion "+(i+1));
                
            }
            else
            	JOptionPane.showMessageDialog(null,"El profesor no esta registrado "+i);
        }
		
        }
    
	
				

	@Override
	public String toString() {
		
		String salida="";
		salida += "Lista de Alumnos:\n\n";
		for ( int i=0; i < this.alumnos.length; i++) {
			
			salida += "Nombre: "+alumnos[i]+"\n";
		}
		
		return salida;
	}

	
}
