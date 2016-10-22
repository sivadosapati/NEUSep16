package neu.jan16.collections.ken;

import java.util.HashMap;
import java.util.Map;

public class CountriesWithMap {
	private Map<String, String> countryCapitals = new HashMap<String, String>();

	public void addCountry(String country, String capital) {
		countryCapitals.put(country, capital);
	}

	public String getCapital(String country) {
		return countryCapitals.get(country);
	}

	public int getCountryCount() {
		return countryCapitals.size();
	}

}
