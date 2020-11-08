package Model;

/**
 * L'interface ItemI réunit les opérations réalisables sur des objets de type Item.
 * cette interface représente par un intitulé, une description textuelle, et une valeur numérique.
 * 
 * @author Neda YOUSEFIAN
 * @version 1.0.0
 */

public interface ItemI {
	/**
	 * Nom de élément
	 * @return
	 */
	String getNom();
	/**
	 * Description d'élément
	 * @ param texte
	 * @return la description d'élément
	 */
	void setTexte(String texte);
	/**
	 * 
	 * @return texte
	 */
	String getTexte();
	/**
	 * Prix d'élément
	 * @param prix
	 * @return le prix déélément
	 */
	void setPrix(double prix);

	/**
	 *
	 * @return le prix d'élément
	 */
	double getPrix();
	/**
	 * @param nom
	 * @return le nom d'élément
	 */
	void setNom(String nom);

}
