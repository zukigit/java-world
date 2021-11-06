
interface DanceEnable {

	public abstract void dance() ;
}

abstract class Animal {

	abstract void feed(String food) ;

	abstract void greet();
}

class Monkey extends Animal implements DanceEnable{

	void feed(String food) {
		System.out.println("I'm monkey. I'm eating " + food);
	}

	void greet() {
		System.out.println("hello I'm monkey");
	}

	public void dance() {
		System.out.println("I'm monkey and I dance!");
	}
}

abstract class Elephant extends Animal {

	abstract void wash() ;

	void feed(String food) {
		System.out.println("I'm elephant I'm eating " + food);
	}

	void greet() {
		System.out.println("Hello I'm Elephant");
	}
}

class AsiaElephant extends Elephant implements DanceEnable {

	public void dance() {
		System.out.println("I'm aisia elephant and I dance!");
	}

	void wash() {
		System.out.println("I shower a lot");
	}
}

class AfreciaElephant extends Elephant {

	void wash() {
		System.out.println("we don't shower");
	}
}

class Zoo {

	Animal[] list = new Animal[20];

	boolean add(Animal animal) {
		for(int i = 0 ; i < list.length ; i++) {
			if (list[i] == null){
				list[i] = animal;
				return true;
			}
		}
		return false;
	}

	void wash() {
		for(Animal a : list) {
			if(a instanceof Elephant) {
				Elephant e = (Elephant) a;
				e.wash();
			}
		}
	}

	void feed(String food) {
		for(Animal a : list){
			a.feed(food);
		}
	}
}