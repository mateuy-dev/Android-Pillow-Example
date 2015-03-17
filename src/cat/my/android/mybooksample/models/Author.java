package cat.my.android.mybooksample.models;

import cat.my.android.pillow.AbstractIdentificableModel;

public class Author extends AbstractIdentificableModel{
	String name;
	String surname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return getName()+" "+getSurname();
	}
}
