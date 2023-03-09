

public class ders1video10 {

	public static void main(String[] args) {

		char grade = 'A';
		
		switch (grade) {
		   case 'A' :
		    	System.err.println("Mükemmel : Geçtiniz");
		    	break;
		   case 'B' :
		   		System.err.println("Çok Güzel : Geçtiniz");
		   		break;
		   case 'C' :
		   		System.err.println("İyi: Geçtiniz");
		   		break;
		   case 'D' :
		   		System.err.println("Fena Değil : Geçtiniz");
		   		break;
		   case 'F' :
				System.err.println("Maalesef Kaldınız.");
				break;
			default :
				System.err.println("Geçersiz not girdiniz");
		   }
	}

}
