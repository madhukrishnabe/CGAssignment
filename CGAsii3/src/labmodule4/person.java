package labmodule4;

public class person{
	private String name;
	private float age;
    person(){}
	person(String name,float age)
	{
	this.name=name;
	this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	

}
