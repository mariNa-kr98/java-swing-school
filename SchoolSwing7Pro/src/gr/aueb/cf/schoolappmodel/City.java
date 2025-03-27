package gr.aueb.cf.schoolappmodel;

public class City {

	private int id;
	private String name;
	
	public City() {}

	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
