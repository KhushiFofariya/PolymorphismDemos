package PolymorphismDemos;

public class RuntimePolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();
	}

}
