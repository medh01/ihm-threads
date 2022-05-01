
public class Producteur implements Runnable{
	Pile pile;
	String name;
	Producteur(Pile pile,String name){
		this.pile=pile;
		this.name=name;
		
	}
	
	public void run() {
		for(int i=0;i<3;i++) {
				pile.empiler(i,name);
		}
	}
}
