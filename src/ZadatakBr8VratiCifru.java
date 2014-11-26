
public class ZadatakBr8VratiCifru {
public static void main(String[] args) {
	
	int k=0;
	
	System.out.printf("To je cifra: %d", vratiCifru(k));
}
/**
 * Funkcija treba da vrati n-tu cifru sa desne strane zadanog broja.
 * @param k = je cifra koju vraca iz broja
 * @return Vraca n-tu cifru iz broja.
 */
private static int vratiCifru(int k) {
	System.out.println("Unesi visecifreni broj: ");
	int broj = TextIO.getInt();
	System.out.println("Unesi redni broj cifre: ");
	int n = TextIO.getInt();
	int t=0;
	
	for (int i = 1; i<=n; i++) {
	    t = broj%10;
		broj = broj/10;
	}
	return t;
}

}
