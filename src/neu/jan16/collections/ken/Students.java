package neu.jan16.collections.ken;

import java.util.HashMap;
import java.util.Map;

public class Students {
	private Map<Student, String> map = new HashMap<Student, String>();

	public void add(Long id, String name){
		Student s = new Student(id, name);
		map.put(s, s.getName());
	}
	public String toString(){
		return map.toString();
	}

	public String getName(Long id) {
		Student x = new Student();
		x.setId(id);
		return map.get(x);
	}
}
