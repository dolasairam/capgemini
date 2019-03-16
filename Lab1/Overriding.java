class Animal
{
	public static void eat()
	{
		System.out.println("Animal eats");
	}
	public void legs()
	{
		System.out.println("Animal legs");
	}
}

class Dog extends Animal
{
	public static void eat()
	{
		System.out.println("Dog eats");
	}
	public void bark()
	{
		System.out.println("Bark!!!");
	}
}

class Overriding
{
	public static void main(String args[])
	{
		Dog a = new Dog();
		a.eat();
		a.legs();
		//a=new Dog();
		a.eat();
		((Dog)a).bark();
	}
}
//java.lang.ClassCastException