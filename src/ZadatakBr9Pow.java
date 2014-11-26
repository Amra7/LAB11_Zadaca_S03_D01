
public class ZadatakBr9Pow {
public static void main(String[] args) {
	
	System.out.println("Unesi dva broja (a^b):");
	int a = TextIO.getInt();
	int b = TextIO.getInt();
	
	System.out.println("Rezultat a^b je: " + Pow(a,b));
		
}
/**
 * Funkcija koja prima parametar a kao bazu i parametar b kao stepen.
 * @param a = baza, bilo koji broj koji unesemo
 * @param b = stepen, bilo koji broj koji unesemo
 * @return Vrijednost koju dobijemo kad bazu dignemo na dati stepen
 */
private static int Pow(int a, int b) {
	int rez=0;
	int temp=1;
	
	for (int i=1; i<b; i++){
		temp = a*temp;
		rez = a*temp;
	}
	return rez;
}
}
