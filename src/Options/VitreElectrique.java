package Options;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{
	
	public double getPrix(){
		return 200;
	}
	
	public String toString() {
		
		return "Vitre Electrique (" + this.getPrix() + "€)";
	}

}
