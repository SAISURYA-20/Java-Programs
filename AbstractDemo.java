package day23;

abstract class Animal {
	int lifetime=-1;
	abstract void makesound(); 
	void describe() {
		System.out.println("This is abstract class");
	}

}
class cat extends Animal{    // all child classes have common

	@Override
	void makesound() {
		// TODO Auto-generated method stub
		System.out.println("mewo");
		
	}
}
class Dog extends Animal{

	@Override
	void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Lol-Lol");
		
	}
	
}
abstract class Bird extends Animal{
}
	class Crows extends Bird{

		@Override
		void makesound() {
			// TODO Auto-generated method stub
			System.out.println("ka-ka");
			
		}
		
	}
	

public class AbstractDemo{
	public static void main(String[] args) {
		//Animal animal=new Animal();///err
		Animal a1=new cat();
		a1.makesound();
		a1=new Dog();
		a1.makesound();
		a1.describe();
		Crows b1=new Crows();
		System.out.println(b1 instanceof Crows);
		System.out.println(b1  instanceof Animal);
		
	}
}
