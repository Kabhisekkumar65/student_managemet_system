package model;

public class Student {
	 private int id ;
	private String Name;
	private int age;
	//
	public Student(int id, String name, int age) {
		this.id = id;
		Name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display() {
		System.out.println("========================");
		
		System.out.println("ID"+id);
		System.out.println("Name"+Name);
		System.out.println("Age"+age);
		System.out.println("========================");
	}

}
