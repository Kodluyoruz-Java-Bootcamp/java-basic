package hafta1;

public class MainOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a;
		int b;
		Boolean c ;
		
		String s;
		
		
		
		// Class - Abstract class - interface
		
		// interface -- method'un body kısmı yok. implementasyon yok.
		
		// somut ve soyut(interface, Abstract class) class'lar 
		
		// extends - implements : kalıtım
		
		// Inheritence - Polymorphism(bir objenin başka bir obje gibi davranabilmesi) - Encapsulation
		
		//erişim belirleyiciler: public - private - protected
		
		// hasA ? ve isA?
		
		// constructor overloading - override
		
		//diamond problem
		
		Number number =  Integer.valueOf(1); // number - integer
		
	
		
		//A a2 = new A(); // soyut class dolayısıyla instane oluşturamayız.
		
		
		D d = new D();	
		d.add();
		d.sum();
		d.sum(5, 6);
		int sonuc = d.sum(3, 5, 8);
		
		d.STATIC_DEGISKEN = 11;
		
		D.STATIC_DEGISKEN = 12;
		
		
		System.out.println("clas'a ait değişken " + D.STATIC_DEGISKEN);
		
		System.out.println("instance ait değişken " + d.normalDegisken);
		
		d.normalDegisken = 6;	
			
		
		D d1 = new D(5);
		d1.add();
		d1.normalDegisken = 10;
	
		
	    System.out.println("clas'a ait değişken " + D.STATIC_DEGISKEN);
		
		System.out.println("instance ait değişken " + d1.normalDegisken);
		
		
		
		A a2 = new D();
		a2.add();
		
		
		Object a3 = new D();
		((D)a3).add();
		
		d.subtract();
		
		E e = new D();
		e.subtract();
		
		
		double pi = Math.PI;
		
		System.out.println(Math.min(Math.PI, Math.E));
		
		//Math.PI = 3;  // final değişkenler değiştirilemez
		
				
	}
	

}
