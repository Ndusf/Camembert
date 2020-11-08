package Controller;

/**
 * L'interface IController réunit les opérations réalisables sur des objets de type Controller.
 * un controleur permettant d'interagir sur le camembert.
 * 
 * @author Neda YOUSEFIAN
 * @version 1.0.0
 */
public interface IController {
	/*
	 * select a piece of pie
	 * @param b
	 */
	public void setSelected(boolean b);
	/*
	 * 
	 */
	public int getSelectedPie();
	
	/*
	 * select a piece of pie
	 * @param i
	 */
	public void setSelectedPie(int i);
	/*
	 * select piece
	 */
	public boolean isSelected();
	/*
	 * deselect all pieces
	 */
	public void deSelect();
	/*
	 * select the next piece of pie
	 */
	public void nextPie();
	
	/*
	 * select the previous piece of pie
	 */
	public void previousPie();
	
}
