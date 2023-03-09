


public class ders1video19 {

	public static void main(String[] args) {
		
		/*int kontrolSayisi=43;
		int kalan ;
		int[] bölenSayılar = {2,3,5,7,11};
		
		for(int i=0; i<bölenSayılar.length ; i++) {
			  
			kalan=kontrolSayisi%bölenSayılar[i];
			System.err.println(kalan);*/
			
		int number = 77;
		
		boolean isPrime=true;
		if(number==1) {
			
			System.err.println("1 asal sayı değildir.");
		}
		else if (number<1){
			System.err.println("Geçersiz bir sayı girdiniz.Birden küçük olamaz");
		}
		
		else {
			
			for(int i=2; i<number;i++) {
				
				if(number%i == 0)
					
					isPrime=false;
			
			}
			
			if (isPrime) {
				System.err.println("Sayı asaldır");
				
				
			}	
			else {
				System.err.println("Sayı Asal değildir.");
			}
			
		}
		
		
	}
}

