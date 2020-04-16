
public class Ville {
	
	String nom_ville;
	double superficie_ville;
	double population_ville;


	//Retourne le nom de la ville
	public String getNomVille() { 
		System.out.println(nom_ville);
		return nom_ville;
	}

	//Retourne la superficie de la ville
	public double getSuperficieVille(){
		System.out.println(superficie_ville);
		return superficie_ville;
	}

	// Retourne le nombre d'habitants
	public double getPopulationVille(){
		System.out.println(population_ville);
		return population_ville;
	}	 


	//Définit le nom de la ville
	public void setNomVille(String pnom){
		nom_ville = pnom;
	}

	
	//Définit la superfice de la ville
	public void setSuperficieVille(double psuperficie){
		superficie_ville = psuperficie;
	}

	//Définit le nombre d'habitants
	public void setPopulationVille(double ppopulation){
		population_ville = ppopulation;
	}  
	
	public String toString() {
		return nom_ville + ", " + superficie_ville + " kilomètres carrés, pour " + population_ville + " habitants";
	}


//Constructeur par défaut
public Ville(){
	 nom_ville = "inconnu";
	 superficie_ville = 0;
	 population_ville = 0;
}  
		 	 
	 //Constructeur avec paramètres
	 public Ville(String pnom, double psuperficie, double ppopulation){
		 nom_ville = pnom;
		 superficie_ville = psuperficie;
		 population_ville = ppopulation;
	 }  

}
