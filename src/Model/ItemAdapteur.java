package Model;

import java.util.Observable;

/**
 * Le design pattern Adapteur pour intégrer un système de notification des changements du modèle vers la vue
 * @see Item
 * @see ItemI
 * @see Observable
 * 
 * @author Neda YOUSEFIAN
 * @version 1.0.0
 */

public class ItemAdapteur extends Observable implements ItemI {

	private final ItemI element;
	
	public ItemAdapteur(ItemI element) {
		this.element = element;
	}


	@Override
    public void notifyObservers() {
		//Changer l'observeur	
	  setChanged();  
	  //Signaler le changement
      super.notifyObservers(); 
    }
	
	@Override
	public String getNom() {
		return element.getNom();
	}

	@Override
	public void setTexte(String texte) {
		element.setTexte(texte);
		notifyObservers();
	}

	@Override
	public String getTexte() {
		return element.getTexte();
	}

	@Override
	public void setPrix(double prix) {
		element.setPrix(prix);
		notifyObservers();
	}

	@Override
	public double getPrix() {
		return element.getPrix();
	}

	@Override
	public void setNom(String nom) {
		element.setNom(nom);
		notifyObservers();
	}

}
