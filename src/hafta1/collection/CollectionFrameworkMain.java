package hafta1.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionFrameworkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] sayiArray = {2,35,6};
				
		List<Integer> sayilar = new ArrayList<>();
		
		sayilar.add(23);
		sayilar.add(234);
		sayilar.add(44);
		
	
		
		//sayilar.add("özer");
		
		
		
		List<String> isimler = new ArrayList<>();
		isimler.add("özer");
		//isimler.add(123);
		
		List<Boolean> booleans = new ArrayList<>(20);
		
		
		Set<String> benzersizIsimler = new HashSet<>();
		
		benzersizIsimler.add("şeyma");
		benzersizIsimler.add("şeyma");
		benzersizIsimler.add("mehmet");
		benzersizIsimler.add("özer");
		benzersizIsimler.add("esra");
		benzersizIsimler.add("sami");
		
		
		System.out.println(benzersizIsimler.size());		
		System.out.println(benzersizIsimler.isEmpty());
		System.out.println(benzersizIsimler.contains("şeyma"));
		System.out.println(benzersizIsimler);
		System.out.println(benzersizIsimler.remove("cem"));
		System.out.println(benzersizIsimler.add("cem"));
		System.out.println(benzersizIsimler.remove("cem"));
		
		
		TreeSet<String> benzersizIsimler2 = new TreeSet<>(benzersizIsimler);
		
		benzersizIsimler2.add("beytullah");
		benzersizIsimler2.add("pelin");
		benzersizIsimler2.add("cem");
		benzersizIsimler2.add("ahmet");
		benzersizIsimler2.add("ali");
		
		System.out.println(benzersizIsimler2);
		
		
		Map<Integer, String> anahtarlar = new HashMap<>();
		
		anahtarlar.put(1, "Pelin");
		anahtarlar.put(2, "cem");
		anahtarlar.put(3, "mehmet");
		anahtarlar.put(4, "esra");
		
		System.out.println(anahtarlar.containsValue("Pelin"));
		System.out.println(anahtarlar);		
		System.out.println(anahtarlar.get(1));	
		

	}

}
