
public class Menu {
	private int i =0;
	private Pizza [] arrayP=new Pizza[20];
	private Pizza [] arrayPc=new Pizza[20];
	private Pizza pizz;
	private Pizza meno;
	private Pizza[] arrayNo= new Pizza[20];
	private int k=0;
	private int g=0;
	private int costose=0;
	private int trov;
	
	
	public void inserisciPizza(Pizza p) {
		if (i>arrayP.length) {
			System.out.println("hai superato il max");
		} else {
				arrayP[i]=p;
			i++;
			arrayP[1].ingredienti[1]="aa";

		}
		
	}
	public void trovaPizzeSenza(String s) {
		
		for (int y=0;y<i;y++) {	
			if(k==1) {
				arrayNo[g]=arrayP[y];
				g++;
			}
			k=0;
		
		for (int x=0;x<pizz.ingredienti.length;x++) {
			if (s==arrayP[y].ingredienti[x]) {
				k=0;
				x=5;
			} else {
				k=1;
			}
			
		}
		}
		System.out.println("Queste sono le pizze");
		for (int u=0;u<g;u++) {
			System.out.println(arrayNo[g].toString());
		}
		
	}
	public void pizzeCostose(double p) {
		for (int a=0;a<i;a++) {
			if (arrayP[a].getPrezzo()>p) {
				arrayP[a]=arrayPc[costose];
				costose++;
			}
		}
		
		for (int b=0;b<costose;b++) {
			System.out.println("queste sono le pizze");
			System.out.println(arrayPc[b].getNome()+" "+ arrayPc[b].getPrezzo());
		}
	}
	public void trovaPizza(String piz) {
		for (int d=0;d<i;d++) {
			if (piz==arrayP[d].getNome()) {
				//trov=d;
				System.out.println("questi sono gli ingredienti");
				for(int e=0;e<pizz.ingredienti.length;e++) {
					System.out.println(arrayP[d].getIngredienti()[e]);
				}
			}
		}
		System.out.println("questi sono gli ingredienti");
	}
	public void pizzaEco() {
		for (int f=0;f<i-1;f++) {
			if (arrayP[f].getPrezzo()<arrayP[f+1].getPrezzo()) {
				meno=arrayP[f];
			}
	}
	System.out.println("pizza meno costoso è "+meno.getNome());
}
}