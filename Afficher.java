import javax.swing.JTextArea;
public class Afficher implements Runnable{
	Pile p;
	JTextArea ta;
	Afficher(Pile p,JTextArea ta){
		this.p=p;
		this.ta=ta;
		Thread t=new Thread(this);
		t.start();
	}
	public void run() {
		for(int i=0;i<p.cmp;i++) {
			ta.append(p.tab[i]+"\n");
		}
	}
	

}
