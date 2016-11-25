import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
				
				try {
					
					String salida = "";
					int dimension = Integer.parseInt(JOptionPane.showInputDialog("Cuanto alumnos dese ingresar?"));
					ListaAlumno lista = new ListaAlumno(dimension);
					lista.setAlumno();
					salida += lista.toString()+"\n";
					int dimension1 = Integer.parseInt(JOptionPane.showInputDialog("Cuanto profesores dese ingresar?"));
					ListaProfesores lista2 = new ListaProfesores(dimension1);
					lista2.setProfesores();
					salida += lista2.toString()+"\n";
					JOptionPane.showMessageDialog(null, salida);
				}
				
				catch (NumberFormatException e) {
					
					JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
				}
			}

	

	}


