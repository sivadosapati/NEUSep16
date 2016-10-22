package neu.jan16.collections.ken;

public class Student {
	private String name;
	private Long id;

	public String toString() {
		return id + " -> " + name;
	}

	public int hashCode() {
		return id.intValue();
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		return this.id.equals(s.id);
	}

	public Student() {
	}

	public Student(Long id2, String name2) {
		setId(id2);
		setName(name2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
