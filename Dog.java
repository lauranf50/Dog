public class Dog
{
	// My private variables for the class Dog
	private int age;
	private String name;
	private String breed;
	private char gender;

	public Dog()
	{
	}

	// My getter for each of the variables so that they can be set to public variables
	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public String getBreed()
	{
		return breed;
	}

	public char getGender()
	{
		return gender;
	}
	// My setter for each variable, now that they are public
	public void setAge(int newValue)
	{
		age = newValue;
	}

	public void setName(String newValue)
	{
		name = newValue;
	}

	public void setBreed(String newValue)
	{
		breed = newValue;
	}

	public void setGender(char newValue)
	{
		gender = newValue;
	}

	public void Bark()
	{
		System.out.println("woof");
	}

	public void setProp(int age1, String name1, String breed1, char gender1)
	{
		age = age1;
		name = name1;
		breed = breed1;
		gender = gender1;
	}

	public void setProp(int age1, String name1)
	{
		age = age1;
		name = name1;
	}
}

