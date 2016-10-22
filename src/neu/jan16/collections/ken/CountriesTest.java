package neu.jan16.collections.ken;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountriesTest {
	public static void main(String args[]) {
		CountriesWithMap cwm = new CountriesWithMap();
		cwm.addCountry("USA", "Washington DC");
		cwm.addCountry("India", "New Delhi");
		cwm.addCountry("China", "Beijing");
		System.out.println(cwm.getCapital("China"));
		System.out.println(cwm.getCapital("Japan"));

		print(makeNamesMap(new HashMap<String, String>()), "HashMap");
		print(makeNamesMap(new TreeMap<String, String>()), "TreeMap");
		print(makeNamesMap(new LinkedHashMap<String, String>()), "LinkedHashMap");

	}

	private static void print(Map<String, String> map, String type) {
		System.out.println(type + " -> " + map);
	}

	private static Map<String, String> makeNamesMap(Map<String, String> namesMap) {
		namesMap.put("John", "Baker");
		namesMap.put("Abel", "George");
		namesMap.put("Obama", "Barack");
		namesMap.put("Obama", "B");
		return namesMap;
	}
}
