package Model;

import java.awt.event.ActionEvent;
import javax.swing.*;
/**
*
* Cette classe supprime d'une action
*  @see JTable
*  
* @author Neda YOUSEFIAN
* @version 1.0.0
*/
public class Supprimer extends AbstractAction {

	private static String name =" Supprimer";
	
	JTable table;
	
	/**
	 * @param name
	 */
	public Supprimer(JTable t) {
		super(name );
		table =t;
	}

	/*
	 * @param arg0
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ModelJtable m = (ModelJtable) table.getModel();
	       try {
	           int rowIndex = table.getSelectedRow();
	           m.removeItemTable(rowIndex);
	       }catch (Exception execption){
	           JOptionPane.showMessageDialog(null,execption);
	       }

	    }
	}


