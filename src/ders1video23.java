

public class ders1video23 {

	public static void main(String[] args) {
		
		
		int[] sayilar = new int[] {1,2,7,3,4,5,6,7,7};
		
		int aranacak= 7;
		int kacTane=0;
		
		
		
		for (int sayi:sayilar) {
			
			if (aranacak==sayi) {
				kacTane=kacTane+1;
				
			} 
		}
		
		if (kacTane>0) {
			System.err.println(aranacak +
						" sayisindan dizide "+ kacTane +" adet mevcut");
			
		} else {
			System.err.println(aranacak +  " sayısı dizide mevcut değil.");

		}
			
		}

}
