



public class ders1video21 {

	public static void main(String[] args) {
		
		int sayi= 6;
		int toplam=1;
		for(int i =2; i<sayi ; i++) {
			if(sayi%i==0) {
				
				toplam=toplam+i;
				
			}
			
			
		}
		
		if (toplam==sayi) {
			System.err.println("Sayı mükemmel sayıdır");
			
		}
		else {
			System.err.println("Mükemmel sayı değildir.");
		}

	}

}
