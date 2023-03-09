

public class ders1video22 {

	public static void main(String[] args) {
		int sayi1=220;
		int sayi2=284;
		
		int bolenlerToplami1=0;
		int bolenlerTOplami2=0;
		
		
		for (int i = 1; i < sayi1 ; i++) {
			
			if (sayi1%i==0) {
				
				bolenlerToplami1= bolenlerToplami1+i;
				
			} 
			
		}
		
		for (int j = 1; j < sayi2 ; j++) {
			
			if (sayi2%j==0) {
				
				bolenlerTOplami2=bolenlerTOplami2+j;
				
			} 
			
		}
		
		if (bolenlerToplami1==sayi2 && bolenlerTOplami2==sayi1) {
			System.err.println("Bu sayılar kardeş sayıdır");
		} 
		else {
			System.err.println("Sayılar kardeş sayı değildir.");

		}
		
	}

}
