import java.util.*;
import java.io.*;
import Vehicule.*;


public class Garage implements Serializable{
	
	static List<Vehicule> voitures = new ArrayList<Vehicule>();
	
	public void addVoiture(Vehicule voiture){
		
		voitures.add(voiture);
	};
	
	public String toString() {
		
		return " *********************** \n *Garage OpenClassrooms* \n ***********************\n";
	}

}
