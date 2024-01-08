package pack_4;

import java.util.List;

public class Main {

	  Biblio biblio = new Biblio();

    
      biblio.ajouterLivre("1234567890", new Ouvrage("1234567890", "Titre 1", "Auteur 1"));
      biblio.ajouterOuvrage("0987654321", new Ouvrage("0987654321", "Titre 2", "Auteur 2"));

      // Recherche d'un ouvrage par son ISBN
      Ouvrage ouvrageTrouve = biblio.rechercherParISBN("1234567890");
      if (ouvrageTrouve != null) {
          System.out.println("Ouvrage trouvé : " + ouvrageTrouve);
      } else {
          System.out.println("Ouvrage non trouvé.");
      }

      // Recherche d'ouvrages par thème
      List<Ouvrage> ouvragesTheme = biblio.rechercherParTheme("Titre");
      System.out.println("Ouvrages trouvés par thème : " + ouvragesTheme);

      // Recherche d'ouvrages par auteur
      List<Ouvrage> ouvragesAuteur = biblio.rechercherParAuteur("Auteur 2");
      System.out.println("Ouvrages trouvés par auteur : " + ouvragesAuteur);
  }
}

class Ouvrage {
  private String isbn;
  private String titre;
  private String auteur;

  public Ouvrage(String isbn, String titre, String auteur) {
      this.isbn = isbn;
      this.titre = titre;
      this.auteur = auteur;
  }

  public String getIsbn() {
      return isbn;
  }

  public String getTitre() {
      return titre;
  }

  public String getAuteur() {
      return auteur;
  }

  @Override
  public String toString() {
      return "Ouvrage{" +
              "isbn='" + isbn + '\'' +
              ", titre='" + titre + '\'' +
              ", auteur='" + auteur + '\'' +
              '}';
  }
}

}
