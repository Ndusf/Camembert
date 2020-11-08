package Model;
/**
 * cette interface représente par un intitulé, une description textuelle, et une valeur numérique.
 * @see ItemI
 * 
 * @author Neda YOUSEFIAN
 * @version 1.0.0
 */

public class Item implements ItemI {

    private String nom;
    private double prix;
    private String texte;

    /**
     * constructeur
     * @param nom
     * @param prix
     * @param texte
 	*/
    public Item(String nom, double prix, String texte) {
    	
        this.nom = nom;
        this.prix = prix;
        this.texte = texte;
    }


    @Override
    public String getNom() {
        return nom;
    }

   
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String getTexte() {
        return texte;
    }

    @Override
    public void setTexte(String texte) {
        this.texte = texte;
    }
}