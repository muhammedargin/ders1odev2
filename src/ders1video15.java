

public class ders1video15 {

	public static void main(String[] args) {
		
	 double[] myList = {1.2,3.4,1.4};
	 double total=0;
	 double max = myList[0];
	 for(double ondalikliSayi : myList) {
		 total= total + ondalikliSayi;
		 System.err.println(ondalikliSayi);
		 if (max<ondalikliSayi) {
			max=ondalikliSayi;
		} 
		 
		 
	 }
		System.err.println("Toplam" + total);
		System.err.println("En büyük:" + max);

	}

}
