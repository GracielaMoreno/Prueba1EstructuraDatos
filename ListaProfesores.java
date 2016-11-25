import javax.swing.JOptionPane;


public class ListaProfesores {
	private Profesor profesores [];

	public ListaProfesores(int dimension) {
		super();
		this.profesores = new Profesor [dimension];
	}

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores() {
		
		for ( int i=0; i < this.profesores.length; i++) {
			
			this.profesores[i] = new Profesor();
			profesores[i].setProfesor();
		}
	}
					
	public String [] vectoMateria() {
		
		String materiapro[] = {""};
		for (int i=0; i<profesores.length; i++) {
			
			materiapro[i] = profesores[i].getMateria();
		}
		
		return materiapro;
	}
	
	public void BuscarPofesores(){
		System.out.println("buscar numero");
		String comparador;
		comparador=JOptionPane.showInputDialog("INGRESE EL DATO QUE DESEA BUSCAR");
		int i;
		for(i=0;i<profesores.length;i++){
            if (profesores[i].equals(comparador)) {
               JOptionPane.showMessageDialog(null,"El alumno esta en el indice "+i+", en la posicion "+(i+1));
                
            }
            else
            	JOptionPane.showMessageDialog(null,"El profesor no esta registrado "+i);
        }
		
        }
    
	
	@Override
	public String toString() {
		
		String salida="";
		salida += "Lista de Profesores:\n\n";
		for ( int i=0; i < this.profesores.length; i++) {
			
			salida += "Nombre: "+profesores[i]+"\n";
		}
		
		return salida;
	}
	
	
}



