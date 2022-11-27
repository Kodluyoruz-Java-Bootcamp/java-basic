package hafta1;

public class D extends E implements A{
	
	
	static int STATIC_DEGISKEN = 5; // static değişken nedir?
	
	int normalDegisken = 7;	
	
	
    public D () {
		
	}

	
	public D (int a) {
		
	}
	
	public D (int a, String s) {
		
	}

	@Override
	public void add() {
		System.out.println("D classı");
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}
	
	public void sum(final int sayi, int sayi2) {	
		//  sayi = 5;
		sayi2 = 9;
		
	}	

	public int sum(int sayi, int sayi2, int sayi3) {
		return sayi + sayi2;		
	}

	//override edilemez çünkü final method
    /*	public void subtract() {
		System.out.println("D içerisindeki sub methodu ");
	}*/


}
