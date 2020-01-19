public class DogRunner
{
	public static void main(String args[])
	{
		// encapsulation
		Dog one = new Dog();
		one.setAge(10);
		one.setName("Snoopy");
		one.setBreed("Husky");
		one.setGender('m');

		// inheritance
		GoldenRetriever two  = new GoldenRetriever();
		two.setShade("Golden");

		// abstract class
		Animal three;
		//Animal is abstract; cannot be instantiated
		//three = new Animal();

		// compile polymorphism
		Dog four = new Dog();
		four.setProp(10, "Bella", "Dalmatian", 'F');

		Dog five = new Dog();
		five.setProp(10, "Bella");

		// runtime polymorphism
		Dog six = new GoldenRetriever();
		six.Bark();

	}
}

