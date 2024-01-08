package pack_4;


import java.util.HashSet;
import java.util.Set;

public class Livre {
    private String ISBN;
    private String titre;
    private Set<String> auteurs;
    private int annee;
    private String maisonEdition;

    public Livre(String ISBN, String titre, int annee, String maisonEdition,Set<String> auteurs) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.annee = annee;
        this.maisonEdition = maisonEdition;
        this.auteurs = new HashSet<>();
    }
    @Override
    public String toString() {
        return "Livre{" +
                "ISBN='" + ISBN + '\'' +
                ", titre='" + titre + '\'' +
                ", auteurs=" + auteurs +
                ", annee=" + annee +
                ", maisonEdition='" + maisonEdition + '\'' +
                '}';
    }
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Set<String> getAuteurs() {
        return auteurs;
    }

    public void ajouterAuteur(String auteur) {
        auteurs.add(auteur);
    }

    public void supprimerAuteur(String auteur) {
        auteurs.remove(auteur);
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }
    
    public boolean estAuteur(String nom) {
        return auteurs.contains(nom);
    }

   
 

    public static void main(String[] args) {
    	Set<String> auteurs = new HashSet<>();
    	/*on peut faire ca a al place d meth ajouterAuteur
    	auteurs.add("kaoutar");
    	auteurs.add("khaoula");
    	auteurs.add("oumaima");
    	*/
        Livre livre = new Livre("1234567890", "Titre du Livre", 2023, "Maison d'édition A", auteurs);
        livre.ajouterAuteur("kaoutar");
        livre.ajouterAuteur("oumaima");
        livre.ajouterAuteur("khaoula");
        
        
        System.out.println(livre);

        /*System.out.println("ISBN : " + livre.getISBN());
        System.out.println("Titre : " + livre.getTitre());
        System.out.println("Auteurs : " + livre.getAuteurs());
        System.out.println("Année : " + livre.getAnnee());
        System.out.println("Maison d'édition : " + livre.getMaisonEdition());
        */
        
    }
}
