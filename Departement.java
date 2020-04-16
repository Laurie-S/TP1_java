/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laurie
 */
public class Departement {
    private int nbVilles;
    private int nbVillesSaisie;
    private int Numero;
    private String Nom_Departement;
    private Ville tabVilles[];
    
    public Departement(int nbVilles_,int Num,String Nom){
        this.Nom_Departement = Nom;
        this.Numero = Num;
        this.nbVilles = nbVilles_;
        this.nbVillesSaisie = 0;
        this.tabVilles = new Ville[nbVilles];
    }
    
    public Departement(){
        this.Nom_Departement = "inconnu";
        this.Numero = -1;
        this.nbVillesSaisie = 0;
    }
    
    public void ajouterVille(Ville ville1){
        if (this.nbVillesSaisie < this.nbVilles){
            this.tabVilles[this.nbVillesSaisie] = ville1;
            this.nbVillesSaisie++;
        }
        else {
            System.out.println("Departement plein");
        }
    }
    
    public String toString() {
        String test = "";
        for(int i = 0; i < nbVillesSaisie ; i++){
            test += tabVilles[i].toString();
            test += "\n";
        }
	return test;
    }
    
    
}
