
public class Pile {
	int[] tab= new int[10];
	int cmp=0;
	
	public synchronized void empiler(int i,String name) {
		if(cmp>9) {
			try {
				wait();
			} catch (InterruptedException e) {
			
			}
		}
		tab[cmp]=i;
		cmp++;
		System.out.println(name+" a empilé le tableau avec la valeur "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		notify();
	}
	
	public synchronized void depiler(String name) {
		if(cmp==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		cmp--;
		System.out.println(name+" a dépilé le tableau");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		notify();
	}
}
