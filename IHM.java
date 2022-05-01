import javax.swing.*;
import java.awt.*;
public class IHM {
	// declaring components 
	JFrame f;
	JPanel p1;
	JPanel p2;
	JButton b;
	JLabel l1;
	JLabel l2;
	JTextField tf1;
	JTextField tf2;
	JTextArea ta;
	Pile pile;
	Producteur prod;
	Consommateur conso;
	
	IHM(){
		//setting components of the frame 
		f=new JFrame("producteurs-consommateurs");
		p1=new JPanel();
		p2=new JPanel();
		l1=new JLabel("nbre de producteurs");
		l2=new JLabel("nbre de consommateurs");
		tf1=new JTextField();
		tf2=new JTextField();
		ta=new JTextArea();
		b=new JButton("démarrer");
		p1.setLayout(new GridLayout(2,2));
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		p2.setLayout(new FlowLayout());
		p2.add(b);
		f.add(p1,BorderLayout.NORTH);
		f.add(ta,BorderLayout.CENTER);
		f.add(p2,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
		//Pile 
		pile = new Pile();
		//Listener 
		Listener l=new Listener(this);
		b.addActionListener(l);		
	}
}
