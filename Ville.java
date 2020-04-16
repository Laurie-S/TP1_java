
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


	//D�finit le nom de la ville
	public void setNomVille(String pnom){
		nom_ville = pnom;
	}

	
	//D�finit la superfice de la ville
	public void setSuperficieVille(double psuperficie){
		superficie_ville = psuperficie;
	}

	//D�finit le nombre d'habitants
	public void setPopulationVille(double ppopulation){
		population_ville = ppopulation;
	}  
	
	public String toString() {
		return nom_ville + ", " + superficie_ville + " kilom�tres carr�s, pour " + population_ville + " habitants";
	}


//Constructeur par d�faut
public Ville(){
	 nom_ville = "inconnu";
	 superficie_ville = 0;
	 population_ville = 0;
}  
		 	 
	 //Constructeur avec param�tres
	 public Ville(String pnom, double psuperficie, double ppopulation){
		 nom_ville = pnom;
		 superficie_ville = psuperficie;
		 population_ville = ppopulation;
	 }  

}
