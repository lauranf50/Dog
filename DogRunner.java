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
		//This call will fail at compile time since age is a private variable
		//one.age = 10;

		System.out.println("This dog is " + one.getAge() + " years old");
		System.out.println("The name of this dog is " + one.getName());
		System.out.println("The breed of " + one.getName() + " is" + " a " + one.getBreed());
		System.out.println("Gender: " + one.getGender());
		System.out.println();


		// inheritance
		GoldenRetriever two  = new GoldenRetriever();
		two.setShade("Golden");

		Dog seven = new Dog();
		//The class Dog does not have a 'setShade' method, therefore the following code will fail to compile
		//seven.setShade("Brown");

		Dog eight = new GoldenRetriever();
		//This call also fails to compile since it is still within class Dog
		//eight.setShade("White");q

		// abstract class
		Animal three;
		//Animal is abstract; cannot be instantiated
		//three = new Animal();

		// compile polymorphism
		Dog four = new Dog();
		//Depending on the number of parameters, the corresponding 'setProp' will be called
		four.setProp(10, "Bella", "Dalmatian", 'F');

		Dog five = new Dog();
		five.setProp(10, "Bella");

		// runtime polymorphism
		Dog six = new GoldenRetriever();
		// The Bark method from the GoldenRetriever class will be called becuase the object is of type GoldenRetrievr
		System.out.println("The Golden Retriever makes this kind of sound: " +six.Bark());


	}
}

