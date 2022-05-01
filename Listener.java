import java.awt.event.*;
import java.util.Vector;

import javax.swing.JOptionPane;
public class Listener implements ActionListener{
	IHM ihm;
	Vector<Thread> v=new Vector<Thread>();
	Listener(IHM ihm){
		this.ihm=ihm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int nbProd=0;
		int nbCons=0;
		try {
			nbProd=Integer.parseInt(ihm.tf1.getText());
			nbCons=Integer.parseInt(ihm.tf2.getText());			
		}catch(Exception err) {
			JOptionPane.showMessageDialog(null,"please enter an integer","error",JOptionPane.ERROR_MESSAGE);
		}
		
		
		for(int i=0;i<nbProd;i++) {
			Thread t=new Thread(new Producteur(ihm.pile,"prod"+i));
			v.add(t);
			
		}
		
		for(int i=0;i<nbCons;i++) {
			Thread t=new Thread(new Consommateur(ihm.pile,"conso"+i));
			v.add(t);
			
		}
		
	     for (Thread t : v) {
	    	 t.start();
	     }
	     
	     for (Thread t : v) {
	    	 try {
				t.join();
			} catch (InterruptedException e1) {
			}
	     }
	     
	     new Afficher(ihm.pile,ihm.ta);
	     
	     
		
		
	}
	
	
}
