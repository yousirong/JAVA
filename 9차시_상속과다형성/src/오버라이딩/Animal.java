package �������̵�;

public class Animal {
    public static void eat() {
        System.out.println("Animal�� ���� �޼ҵ� eat()");
    }
    public void sound() {
        System.out.println("Animal�� �ν��Ͻ� �޼ҵ� sound()");
    }
}
class Cat extends Animal {
    public static void eat() {
        System.out.println("Cat�� ���� �޼ҵ� eat()");
    }
    public void sound() {
        System.out.println("Cat�� �ν��Ͻ� �޼ҵ� sound()");
    }
  
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.eat();
        myAnimal.sound();
    }
}