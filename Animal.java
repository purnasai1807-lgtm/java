abstract class Animal{
	abstract public void sound();
	abstract public void eat();
}
class Dog extends Animal{
	@Override
	public void eat(){
		System.out.println("Dog is eating meat");
	}
	@Override
    public void sound(){
		System.out.println("Dog is BARKING");
	}
}
class Lion extends Animal{
public void eat(){
		System.out.println("Lion is eating deer");
	}
	@Override
    public void sound(){
		System.out.println("Lion is ROARING");
	}
}
		