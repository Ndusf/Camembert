package Controller;

import Model.ICamembertModel;
import View.CamembertView;

/**
 * un controleur permettant d'interagir sur le camembert.
 * 
 * @author Neda YOUSEFIAN
 * @version 1.0.0
 */
public class Controller implements IController {

	private ICamembertModel model;
	private CamembertView view;
	private boolean b = false;

	private int selectionEle;
	
	public Controller(ICamembertModel model) {
		this.model = model;
	}

	public void setSelected(boolean b1) {
		b = b1;
		view.repaint();
		
	}

	public int getSelectedPie() {
		return this.selectionEle;
	}

	public void setSelectedPie(int i) {
		 b = true;
		selectionEle = i;
        view.repaint();
		
	}

	public boolean isSelected() {
		return this.b;
	}

	public void deSelect() {
		this.b = false;
		
	}

	public void nextPie() {
		this.selectionEle = (this.selectionEle + 1)% model.size();
		System.out.println(this.selectionEle);
		this.view.repaint();
	}

	public void previousPie() {
		System.out.println(this.selectionEle);
		this.view.repaint();
	}

	public void setView(CamembertView view2) {
		view = view2;
	}
	
	 public CamembertView getView() {
	        return this.view;
	    }
}
