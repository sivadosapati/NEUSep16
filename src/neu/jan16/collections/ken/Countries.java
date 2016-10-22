package neu.jan16.collections.ken;

import java.util.ArrayList;

class Country{
	String name;
	String capital;
}
public class Countries {
	private ArrayList<String[]> countries = new ArrayList();

	public void addCountry(String name, String capCity) {
		String[] data = { name, capCity };
		countries.add(data);
	}

	public String getCapital(String country) {
		for (String[] data : countries) {
			if (data[0].equals(country)) {
				return data[1];
			}
		}
		return null;
	}

	public int getCountryCount() {
		return countries.size();
	}
}