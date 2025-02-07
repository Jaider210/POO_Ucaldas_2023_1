
public class Gradebook {

	/***
	 * 
	 * ***/
	private String courseName;

	
	/**
	 * 
	 */
	public Gradebook() {
		super();
	}

	/**
	 * @param courseName
	 */
	public Gradebook(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void displayMessage() {
		System.out.println("Bienvenido a la planilla de notas de la UCaldas " + getCourseName());
		System.out.println("Imprimir el # de estudiantes");
	}

}
