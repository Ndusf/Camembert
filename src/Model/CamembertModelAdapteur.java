package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Le design pattern Adapteur pour intégrer un système de notification des changements du modèle vers la vue
 * @see CamembertModel
 * @see ItemI
 * @see Observable
 * 
 * @author Neda YOUSEFIAN
 * @version 1.0.0
 */

public class CamembertModelAdapteur extends Observable implements ICamembertModel {

	private CamembertModel model ;
	
	/**
	 * @param model
	 */
	public CamembertModelAdapteur() {
		this.model = new CamembertModel(new ArrayList<>());
	}


	  @Override
	    public void notifyObservers() {
		  //Changer l'observeur
		  setChanged();  
		//Signaler le changement
	      super.notifyObservers(); 
	    }
	  
	@Override
	public int size() {

		return model.size();
	}

	@Override
	public double getValues(int i) {
		return model.getValues(i);
	}

	@Override
	public int total() {
		return model.total();
	}

	@Override
	public String getTitle() {
		return model.getTitle();
	}

	@Override
	public String getUnit() {
		return model.getUnit();
	}

	@Override
	public void setUnit(String unit) {
		model.setUnit(unit);
		notifyObservers(); 
	}

	@Override
	public String getTitle(int i) {
		return model.getTitle(i);
	}

	@Override
	public void SetTitle(String title) {
		model.SetTitle(title);
		notifyObservers(); 
		
	}

	@Override
	public String getDescription(int i) {
		return model.getDescription(i);
	}

	@Override
	public List<ItemI> getEle() {
		return model.getEle();
	}


	@Override
	public void addItem(String titre, int prix, String description) {
		model.ele.add(new ItemAdapteur(new Item (titre, prix, description)));
		notifyObservers();
	}


	@Override
	public void RemoveItems(int removeele) {
		model.RemoveItems(removeele);
		notifyObservers();
	}


}
