package datos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		Map<String, Double> map  = new HashMap<String, Double>();
		map.put("Redmi a40", 3000.00);
		map.put("Redmi a50", 4000.00);
		map.put("Redmi a60", 5000.00);
		map.put("Redmi a70", 6000.00);
		map.put("Redmi a80", 7000.00);
		map.put("Redmi a90", 8000.00);
		System.out.println("Precios: ");
		for (String precios:map.keySet()) {
			System.out.println(map.get(precios));
		}
		
		System.out.println("--------------------------------");
		
		System.out.println("Nombres y Precios: ");
		
		System.out.println("");
		Iterator it=map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry np=(Map.Entry)it.next();
			System.out.println("Nombre: " + np.getKey() + 
			" y " + " Precio " + np.getValue());
			
		System.out.println("--------------------------------");
		}
	}
}