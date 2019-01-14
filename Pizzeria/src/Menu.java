
public class Menu {
	private int i =0;
	Pizza [] arrayP=new Pizza[20];
	Pizza pizz;
	Pizza[] arrayNo= new Pizza[20];
	private int k=0;
	
	
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
		for(int q=0;q<i;q++) {
			System.out.println(arrayP[q].getNome());
			for (int x=0;x<pizz.ingredienti.length;x++) {
				System.out.println(arrayP[q].getIngredienti()[x]);
			}
		}
		for (int y=0;y<i;y++) {	

		
		for (int x=0;x<pizz.ingredienti.length;x++) {
			if (s==arrayP[y].ingredienti[x]) {
				
			} else {
				arrayNo[k]=arrayP[y];
				k++;
			}
			
		}
		}
		for (int u=0;u<k;u++) {
			System.out.println(arrayNo[u].toString());
		}
		
	}
	
}
