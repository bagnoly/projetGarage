package Options;

import java.io.Serializable;

public class Climatisation implements Option,Serializable {
	
	public double getPrix(){
		return 300;
	}
	
	public String toString() {
		
		return "Cimatisation (" + this.getPrix() + ")";
	}

}
