

public class ders1video14 {

	public static void main(String[] args) {
		
		String [] ogrenciler = new String[3];
		
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		
		for(int i=0 ; i<ogrenciler.length ; i++) {
			
			System.err.println(ogrenciler[i]);
			
		}
		
		System.err.println("------------");
		
		for(String ogrenci:ogrenciler) {
			
			System.err.println(ogrenci);
		}
		
		
		
	}

}
