import Vehicule.*;
import Moteur.*;
import Options.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ObjectInputStream ois;
		ObjectOutputStream oos;
		boolean aVoiture = true;

		// pour aller voir le contenu d'un fichier on utilise un objet input stream
		// pour lequel on crée un buffer
		// input car c'est des informations qui entrent dans le programme (input clavier/lire données)
		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream(
							new File("garage.txt"))));
			
			Garage.voitures = (List<Vehicule>) ois.readObject();
			ois.close();
			
		}catch (FileNotFoundException e) {
			System.out.println("Aucune voitures sauvegarder !");
			aVoiture = false;
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Garage.voitures = new ArrayList<Vehicule>();
		// si on laisse la ligne du dessus alors on ne lit que les nouvelles voitures et on efface les anciennes

		// on créé une variable monGarage du type Garage
		Garage garage = new Garage();
		
		//********************************
		
	   	 System.out.println(garage);
		// Affiche le tostring de la classe garage
		// le garage openclassroom avec les étoiles

		// on créé une variable lag1 du type Vehicule
	   	 Vehicule lag1 = new Lagouna();
	   	 lag1.setMoteur(new MoteurEssence("150 Chevaux"));
	   	 lag1.addOption(new GPS());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitreElectrique());
	   	 lag1.getMarque();
	   	 garage.addVoiture(lag1);
	   		 
	   	 Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W"));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 A300B_2.getMarque();
	   	 garage.addVoiture(A300B_2);
	   	 
	   	 Vehicule d4_1 = new D4();
	   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi"));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	 d4_1.getMarque();
	   	 garage.addVoiture(d4_1);   	 
	   	 
	   	 Vehicule lag2 = new Lagouna();
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi"));
	   	 lag2.getMarque();
	   	 garage.addVoiture(lag2);
	   	 
	   	 Vehicule A300B_1 = new A300B();
	   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique"));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	 A300B_1.getMarque();
	   	 garage.addVoiture(A300B_1);

	   	 Vehicule d4_2 = new D4();
	   	 d4_2.setMoteur(new MoteurElectrique("100 KW"));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new GPS());
	   	 d4_2.addOption(new VitreElectrique());
	   	 d4_2.getMarque();
	   	 garage.addVoiture(d4_2);
	   	 
	   	 if(aVoiture == true) {
	   		 for(Vehicule voit : Garage.voitures) {
			 System.out.println(voit);
	   	 }
	   	 
		}
	   	 
	   	 //******************************
			// on écrit les nouvelles voitures dans le fichier
			// on utilise un object output
		try {
			
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(
							new File("garage.txt"))));
			
			oos.writeObject(Garage.voitures);
			oos.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
