package Options;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable{

	public double getPrix() {
		return 100;
	}
	
	public String toString() {
		
		return "Barre de toit (" + getPrix() + ")";
	}

}
