package hafta1;


public class Main {

	public static void main(String[] args) {
		
		//primitive - wrapper class'ları mevcut
		
		// integer: tam sayı 32bit
		// float: virgüllü sayılar, ondalıklı
		// doluble
		
		
		float f1;
		
		f1 = 2.5f;
		
		int a = 5;
		
		char c1 = 'c';
		
		String s1 = "Solmaz Gümrük";
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		boolean isTrue;
		
		isTrue = true;
		
		isTrue = false;
		
		String name;
		if (isTrue && 2 > 5 || 2 == 6) { // scope: değişkenlerin yaşam döngüsü
			// TODO:
			
			name = "Cevher";
		}
		
		name = "cem";
		
		// döngüler for - while - do while - forech
		
		int i = 0;
		
		for (;i < args.length; ) {
			// TODO
			
			i++;
		}
		
		isTrue = true;
		
	/*	while(isTrue) { // sonsuz döngü
			//TODO
		}
		
		
		do {
			//TODO
			
			// en az bir kere kesin çalışır.
		}while(isTrue == true); // true == true
		*/
		
		//array; indeksi 0'dan başlar ve boyutun ilk başta tanımlanmış olması
		
		int[] sayilar = new int[5];
		sayilar[0] = 1; //1.eleman
		sayilar[1] = 2;//2.eleman
		sayilar[2] = 3;//3.eleman
		sayilar[3] = 4;//4.eleman
		sayilar[4] = 5; //5.eleman
		
		//sayilar[5] = 6; //5.eleman java.lang.ArrayIndexOutOfBoundsException
		
		for (int j = 0; j < sayilar.length; j++) {
			System.out.println("i. indeks = " + sayilar[j]);
		}
		
		int sayilar2[] = {1,2,3};
		
		String[] isimler = {"mahmut, mehmet, zeynep, eren"};
		
		
		// iki boyutlu(çok boyutlu) array : array of array
		
		int[][] ikiBoyutluArray = new int[2][3];
		
		ikiBoyutluArray[0][0] = 1;
		ikiBoyutluArray[0][1] = 2;
		ikiBoyutluArray[0][2] = 3;
		
		ikiBoyutluArray[1][0] = 1;
		ikiBoyutluArray[1][1] = 2;
		ikiBoyutluArray[1][2] = 3;
		
		System.out.println("array boyut: " + ikiBoyutluArray.length);
		
		for (int j = 0; j < ikiBoyutluArray.length; j++) { //
			
			for (int k = 0; k < ikiBoyutluArray[0].length; k++) {
				System.out.print( ikiBoyutluArray[j][k]); //0-0:1, 0-1:2			
			}
			System.out.println();
		}
		
		System.out.println("--------");
		
	/*	for (int j = 0; j < 100000; j++) {
			if (j % 100 == 0) {
				System.out.println();
			}
			System.out.print((char)(j));
		}*/
		
		
		
		//operatörler
		
		// toplama çıkarma çarpma bölme mod
		
		
		int b = 2+5;
		//b++; // k+1
		//b+=1;		
		
		//b = b+1;  //b+1 = b;
		System.out.println(b);//7
		System.out.println(b++); //8
		System.out.println(b+=1); //9
		System.out.println(++b); //10

	}

}
