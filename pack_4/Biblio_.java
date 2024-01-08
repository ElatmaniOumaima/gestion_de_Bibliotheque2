package pack_4;


import java.util.*;




public class Biblio_{
    private Map<String, Livre> Livres;

    public Biblio_() {
        Livres = new HashMap<>();
    }

    
    public void ajouterLivre(String isbn, Livre ouvrage) {
        Livres.put(isbn, ouvrage);
    }

    
    public void modifierLivre(String isbn, Livre nouveauOuvrage) {
        if (Livres.containsKey(isbn)) {
            Livres.put(isbn, nouveauOuvrage);
        } else {
            System.out.println("L'ouvrage avec l'ISBN " + isbn + " n'existe pas dans la bibliothèque.");
        }
    }

    
    public void supprimerLivre(String isbn) {
        Livres.remove(isbn);
    }
               
   
    public Livre rechercherParISBN(String isbn) {
        return Livres.get(isbn);
    }

    public void rechercherEtAfficherParISBN(String isbn) {
        Livre ouvrageTrouve = Livres.get(isbn);
        if (ouvrageTrouve != null) {
            System.out.println("Ouvrage trouvé : " + ouvrageTrouve.toString());
        } else {
            System.out.println("Aucun ouvrage trouvé pour l'ISBN : " + isbn);
        }
    }
    public void rechercherEtAfficherPartitre(String ouvrage) {
        Livre ouvrageTrouve = Livres.get(ouvrage);
        if (ouvrageTrouve != null) {
            System.out.println("Ouvrage trouvé : " + ouvrageTrouve.toString());
        } else {
            System.out.println("Aucun ouvrage trouvé pour ce titre : " + ouvrage);
        }
    }
}
   
       
