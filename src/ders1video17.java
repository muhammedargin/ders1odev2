

public class ders1video17 {

	public static void main(String[] args) {
	
		
		String mesaj = "Bugün hava çok güzel.";
		
		System.err.println(mesaj);
		System.err.println("Eleman sayısı:"+ mesaj.length());
		System.err.println(mesaj.charAt(5)+ "5. elemandır");
		System.err.println(mesaj.concat("Yaşasın"));
		System.err.println(mesaj.startsWith("B"));
		System.err.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.err.println(karakterler);
		System.err.println(mesaj.indexOf('a'));
		//saymaya 0 dan başlar boşlukları da sayar
		System.err.println(mesaj.indexOf("ava"));
		System.err.println(mesaj.lastIndexOf("a"));
		//sağdan başlayıp denk geldiği ilk a soldan 9. sırada

	}

}
