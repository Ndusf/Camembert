package Model;

import java.awt.Font;
import java.awt.Graphics;
import java.util.List;

/**
 * L'interface ICamembertModel réunit les opérations réalisables sur des objets de type CamembertModel.
 * stocker le titre (qui décrit le graphique), et un ensemble d'éléments
 * 
 * @author Neda YOUSEFIAN
 * @version 1.0.0
 */

public interface ICamembertModel {
	
	 /**
    *
    * @return size 
    */
	public int size();
	 /**
    *
    *  @param i
    * @return le prix d'élément
    */
	public double getValues(int i);
	 /**
    *
    * @return 
    */
	public int total();
	 /**
    *
    * @return le nom
    */
	public String getTitle();
	 /**
    *
    * @return unit d'élément
    */
	public String getUnit();
	/**
	 * @param unit
	 */
	void setUnit(String unit);
	 /**
    *
    * @param i
    * @return 
    */
	public String getTitle(int i);
	
	void SetTitle(String title);
	 /**
    *
    * @param i
    * @return la description d'éléments
    */
	public String getDescription(int i);
	
	/**
	 * 
	 * @return la liste d'élément
	 */
	List<ItemI> getEle();
			
	/**
	 * 
	 * @param title
	 * @param prix
	 * @param description
	 * ajouter des items
	 */
	public void addItem(String titre, int prix, String description);
	
	/**
	 * @param removeele
	 * supprimer des items
	 */
	 
	void RemoveItems(int removeele);
	

}
