import java.util.Arrays;

public class Pizza {		
	String nome;
	double prezzo;
	String[]ingredienti = new String[10];
	public Pizza(String nome, double prezzo, String[] ingredienti) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String[] getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(String[] ingredienti) {
		this.ingredienti = ingredienti;
	}
	@Override
	public String toString() {
		return "Pizza [nome=" + nome + ", prezzo=" + prezzo + ", ingredienti=" + Arrays.toString(ingredienti) + "]";
		
	}
	public String toString1() {
		
	
		return "Pizza ingredienti=" + Arrays.toString(ingredienti) + "]";
	
	
	}
}
