package Model;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
*
* Cette classe ajoute d'une action
*  @see ModelJtable
*  
* @author Neda YOUSEFIAN
* @version 1.0.0
*/

public class Ajouter extends AbstractAction {

	private static String name= "Ajouter";
	private ModelJtable table;
	
	
	
	/**
	 * @param name
	 */
	public Ajouter(ModelJtable m) {
		super(name);
		table = m;
	}


	/*
	 * @param arg0
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		table.addItemTable();
		
	}

}
