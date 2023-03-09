

public class ders1video18 {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		String mesaj2 = "     Bugün hava çok güzel.     ";
		
		String yeniMesaj =mesaj.replace(' ', '-');
		System.err.println(yeniMesaj);
		System.err.println("---------------");
		System.err.println(mesaj.replace(' ', '-'));
		System.err.println("---------------");
		String subMesaj= mesaj.substring(2);
		System.err.println(subMesaj);
		System.err.println("---------------");
		String subMesaj2= mesaj.substring(2,4);//4.indexi hesaba katmaz
		System.err.println(subMesaj2);
		
		for (String kelime:mesaj.split(" ")) {
			
			System.err.println(kelime);
		
			
		}
		System.err.println("---------------");
		System.err.println(mesaj.toLowerCase());
		System.err.println("---------------");
		System.err.println(mesaj.toUpperCase());
		System.err.println(mesaj2.trim());
		System.err.println(mesaj2);
		
		
	}

}
