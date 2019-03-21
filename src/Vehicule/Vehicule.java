package Vehicule;
import Options.*;
import Moteur.*;

import java.io.Serializable;
import java.util.*;

public class Vehicule implements Serializable{
	
	private double prix = 0;
	private String nom;
	private Marque nomMarque;
	private HashSet<Option> option = new HashSet();
	private Moteur moteur;
	
	public void getMarque(){

		if(this.getClass() == Lagouna.class){
			this.nomMarque = Marque.RENO;
		}
		else if (this.getClass()== D4.class){
			this.nomMarque = Marque.TROEN;
		}
		else{
			this.nomMarque = Marque.PIGEOT;
		}
	};
	
	public void addOption(Option option){
	
		this.option.add(option);
	};
	
	public HashSet getOption(){
		
		return this.option;
	};
	
	public void getPrix(){
		for(Option op : this.option){
			this.prix = this.prix + op.getPrix();
		}
	}

	
	public void setMoteur(Moteur moteur) {
		
		this.moteur = moteur;
	}
	
	public String toString() {
		
		this.getPrix();
		
		return "+ voiture " + this.nomMarque + " : " + this.getClass().getSimpleName() + " " + this.moteur.toString() + " " + 
		this.moteur.getCylindre() + " " + "(" + this.moteur.getPrix() + "€)" + this.option + " d'une valeur total de " + (this.prix + this.moteur.getPrix() + "€.");
	}

}