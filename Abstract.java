abstract class Animal
{
	public abstract void eat(){};
	public void legs()
	{
		System.out.println("Animal legs");
	}
}

class Dog extends Animal
{
	public void eat()
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
		Animal a = new Dog();
		a.eat();
		a.legs();
		a=new Dog();
		a.eat();
		((Dog)a).bark();
	}
}
//java.lang.ClassCastException