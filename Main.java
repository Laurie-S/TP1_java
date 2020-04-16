

public class Main {
	public static void main(String[] args){
		Ville dijon = new Ville("Dijon", 40.41, 375831);
		Ville quetigny = new Ville("Quetigny", 8.19, 9690);
		Ville beaune = new Ville("Beaune", 31.3, 52741);
		Ville macon = new Ville("Mâcon", 27.0, 100172);
		Ville chalon = new Ville("Chalon-Sur-Saône", 15.22, 133557);
		
		Departement coteDor = new Departement(3, 21, "Côte-d'or");
		Departement saoneEtLoire = new Departement(2, 71, "Saône-et-Loire");
		
		coteDor.ajouterVille(dijon);
		coteDor.ajouterVille(quetigny);
		coteDor.ajouterVille(beaune);
		
		saoneEtLoire.ajouterVille(macon);
		saoneEtLoire.ajouterVille(chalon);
		
		System.out.println(coteDor);
		System.out.println(saoneEtLoire);
		
		
		
	}

}
