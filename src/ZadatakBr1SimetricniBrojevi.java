
public class ZadatakBr1SimetricniBrojevi {

	public static void main(String[] args) {
	System.out.println("Unesi cijeli broj");
	int broj = TextIO.getInt();
	
	if ( broj == 0){
		System.out.println("Izasli ste iz programa!");
		return;
	}
	if ( broj >= 0) {
		if (isPalindrom(broj)==true){
		    System.out.println("Broj je palindrom!");
		}else{
			System.out.println("Broj nije palindrom!");
		}
	}
}

private static boolean isPalindrom(int broj) {
	int obrnuto = 0;
	boolean isP = false;
	int original = broj;
	while ( broj>0){
		
	    obrnuto = obrnuto*10 + broj %10;
		broj = broj / 10;
		
	}
	if (original==obrnuto){
		isP=true;	

	}
	//isP = original==obrnuto;
	return isP ;
}

}


