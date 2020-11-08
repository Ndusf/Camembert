package Model;
import java.util.List;

/**
 * stocker le titre (qui décrit le graphique), et un ensemble d'éléments
 * @see ItemI
 * 
 * @author Neda YOUSEFIAN
 * @version 1.0.0
 */


public class CamembertModel implements ICamembertModel {
	/*
	 * Nom d'élémént
	 */
	private String title = "Mobile";
	/*
	 * Unité d'élément en euro
	 */
	private String unit = "euro";
	/*
	 * Liste d'élément
	 */
	protected List<ItemI> ele;
	
	/*
	 * constructeur
	 */
	public CamembertModel(List<ItemI> ele) {
		this.ele = ele;
	}
	
	@Override
	public int size() {
		return ele.size();
	}

	@Override
	public double getValues(int i) {
		return ele.get(i).getPrix();
	}

	@Override
	public int total() {
		int total = 0;
		for (ItemI e: ele) {
			total +=  e.getPrix();
		}
		return total;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getUnit() {
		return unit;
	}
	
	@Override
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String getTitle(int i) {
		return ele.get(i).getNom();
	}
	
	@Override
	public void SetTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String getDescription(int i) {
		return ele.get(i).getTexte();
	}

	@Override
	public List<ItemI> getEle(){
        return ele;
    }

	@Override
	public void addItem(String titre, int prix, String description) {
		// TODO Auto-generated method stub
		Item item = new Item(titre, prix, description);
		ele.add(item);
	}
	

	@Override
	public void RemoveItems(int removeele) {
		ele.remove(removeele);
	}

	
}
