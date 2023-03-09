

public class ders1video16 {

	public static void main(String[] args) {
		
		
		String [][] sehirler = new String[3][3] ;
		
		sehirler [0][0] = "istanbul";
		sehirler [0][1] = "bursa";
		sehirler [0][2] = "ankara";
		sehirler [1][0] = "kastamonu";
		sehirler [1][1] = "karabük";
		sehirler [1][2] = "balıkesir";
		sehirler [2][0] = "izmir";
		sehirler [2][1] = "aydın";
		sehirler [2][2] = "antalya";
		
		for (int i = 0; i <= 2; i++) {
			System.err.println("--------------");
			for (int j = 0; j <= 2; j++) {
				
				System.err.println(sehirler[i][j]);
				
			}
			
		}
		
		
	}

}
