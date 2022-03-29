// Polymorphism
class Animal{

	public void sound(){
		System.out.println("Animal makes sound");

	}

}

class Dog extends Animal{

	public void sound(){
		System.out.println("Dogs BARK");

	}
}
class Cat extends Animal{
	public void sound(){
		System.out.println("Cats MEOW MEOW");
	}

}

public class Day16{
	public static void main(String aa[]){

		Animal Anim = new Animal();
		Dog dogy = new Dog();
		Cat chomy = new Cat();
		Anim.sound();
		dogy.sound();
		chomy.sound();

	}




}




