
public class Consommateur implements Runnable{
	Pile pile;
	String name;
	Consommateur(Pile pile,String name){
		this.pile=pile;
		this.name=name;
		
	}
	
	public void run(){
		pile.depiler(name);
	}
}
