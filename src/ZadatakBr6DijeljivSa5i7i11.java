public class ZadatakBr6DijeljivSa5i7i11 {
	public static void main(String[] args) {
		System.out.println("Unesi jedan broj: ");
		int broj = TextIO.getInt();

		for (int i =broj ; i>0; i--) {
			if ((jeDijeljiv(i, 5)==true) || (jeDijeljiv(i, 7)==true) || (jeDijeljiv(i, 11)==true)) {
				System.out.println(i);;
			}
	
		}
	}

	private static boolean jeDijeljiv(int m, int n) {
		boolean jeDijeljiv = false;
		if (m % n == 0)  {
			jeDijeljiv = true;
		}
		return jeDijeljiv;
	}

}
