package Options;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {
	
	public double getPrix(){
		return 150;
	}
	
	public String toString() {
		
		return "Siège chauffant (" + getPrix() + "€)";
	}

}
