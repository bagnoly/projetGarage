package Options;

import java.io.Serializable;

public class GPS implements Option, Serializable {
	
	public double getPrix() {
		return 50;
	}
	
	public String toString() {
		
		return "GPS (" + this.getPrix() + "€)";
	}

}
