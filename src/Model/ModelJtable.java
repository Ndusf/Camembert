package Model;

import javax.swing.table.AbstractTableModel;
/*
 * Creating simple JTable using AbstractTableModel
 * 
 * @author Neda YOUSEFIAN
 * @version 1.0.0
 */
public class ModelJtable  extends AbstractTableModel{

	private ICamembertModel model;
	 private final String[] headers = {"Title", "Value", "Description"};

	 public ICamembertModel getModel() {
		return model;
	}
	
	public ModelJtable (ICamembertModel m){
		super();
		model = m;
	}
	

	public String getColumnName(int columnIndex){
        return headers[columnIndex];
    }
	
	@Override
	public int getColumnCount() {
		return headers.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return model.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex){
        case 0:
            return model.getTitle(rowIndex);
        case 1:
            return model.getValues(rowIndex);
        case 2:
            return model.getDescription(rowIndex);
        default:
            return null;
    }
	}
	
	  @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex){
	        return true;
	    }
	  
	  @Override
	    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
	        if(aValue != null){
	            ItemI item = model.getEle().get(rowIndex);

	            switch (columnIndex){
	                case 0:
	                    item.setNom(aValue.toString());
	                    break;
	                case 1:
	                    item.setPrix(Double.parseDouble(aValue.toString()));
	                    break;
	                case 2:
	                    item.setTexte(aValue.toString());
	                    break;
	            }
	        }
	    }
	  
	  public void addItemTable(){

	        model.addItem("Alimentation", 121, "Biocoop");    
	        model.addItem("SNCF", 250, "Billet allez-retour en Alsace!"); 
	        model.addItem("Frais scolarité", 243, "Inscription de la fac"); 
	        fireTableRowsInserted(model.getEle().size() -1, model.getEle().size() -1);
	    }
	  
	  public void removeItemTable(int rowIndex){
	        model.RemoveItems(rowIndex);
	        fireTableRowsDeleted(rowIndex, rowIndex);
	    }

}
