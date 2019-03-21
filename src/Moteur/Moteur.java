package Moteur;
import Vehicule.*;

import java.io.Serializable;

import Options.*;

public abstract class Moteur implements Serializable{
	
	private TypeMoteur type;
	private String cylindre;
	private double prix;

	public Moteur(String cylindre, double prix){
		this.cylindre = cylindre;
		this.prix = getPrix();
	}
	
	public double getPrix(){
		if(this.getClass() == MoteurDiesel.class){
			return 2000;
		}
		else if(this.getClass()== MoteurEssence.class){
			return 1800;
		}
		else if(this.getClass()== MoteurHybride.class){
			return 3000;
		}
		else{
			return 1400;
		}
		
	};
	
	public String getCylindre() {
		
		return this.cylindre;
	}
	
	

}
