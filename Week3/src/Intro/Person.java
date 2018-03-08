package Intro;

public class Person {
	
	public String name;
	private int age;
	public String jobTitle;
	
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.setAge(age);
		this.jobTitle = jobTitle;
	}

	
	public void getAge() {
		System.out.println(age);
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}

}