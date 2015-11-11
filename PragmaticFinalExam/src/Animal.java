public class Animal {
	private String date;
	private String color;
	private String breed;
	private String gender;
	private String state;


	private String name;
	private String entry;

	public Animal(String date, String color, String breed, String gende,
			String gender, String name, String entry) {
		setDate(date);
		setColor(color);
		setBreed(breed);
		setGender(gender);
		setName(name);
		setEntry(entry);

	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public String toString() {
		return getDate() + "," + getColor() + "," + getBreed() + ","
				+ getGender() + "," + getName() + "," + getEntry();

	}
}
