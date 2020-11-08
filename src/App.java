import Controller.Controller;
import Model.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

import View.CamembertView;
/*  
 * Main de l'application Camemberts
 * 
* @author Neda YOUSEFIAN
* @version 1.0.0
*/
public class App {
	 
	public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 400, 400);
        window.setBackground(Color.green);
        
        
        // Create an instance of the model
        ICamembertModel model = new CamembertModelAdapteur();

       
        model.addItem("Loyer", 704, "Un peu cher!");
        model.addItem("Cinéma", 11, "Cinéma Rennes");
  
        // Create the controller and link the controller to the model...
        Controller controller = new Controller(model);
        

        // create the view
        CamembertView view = new CamembertView(model);
        view.setController(controller);
        controller.setView(view);

        ((CamembertModelAdapteur) model).addObserver(view);

        window.addMouseListener(view);
        window.addMouseMotionListener(view);


        /**
         * JTable Section
         */

        ModelJtable modelTable = new ModelJtable(model);
        window.setTitle("Camembert Table");
        JTable table = new JTable(modelTable);
        table.setBackground(Color.decode("#058dc7"));
        table.setFont(new Font("Arial", 1, 14));
        table.setRowHeight(30);
        table.setForeground(Color.white);
        
   	 	JTableHeader header = table.getTableHeader();
   	 	header.setBackground(Color.green);
   	 	header.setForeground(Color.black);
   	 	header.setFont(new Font("Arial", 1, 18));
   	 	
        window.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel buttons = new JPanel();
        buttons.setBackground(Color.yellow);  
        buttons.add(new JButton(new Ajouter(modelTable)));
     
        buttons.add(new JButton(new Supprimer(table)));
        window.getContentPane().add(buttons, BorderLayout.NORTH);
        window.pack();

        GridLayout layout = new GridLayout(2, 2);

        window.getContentPane().add(controller.getView());
        window.setLayout(layout);
        window.setVisible(true);



    }

}
