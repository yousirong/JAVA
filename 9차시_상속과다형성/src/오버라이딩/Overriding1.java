package �������̵�;

class Car2{
    public void accelate(){
        System.out.println("�Ϲ� ���� ���");
    } 
    public static void stop(){
        System.out.println("�Ϲ� �극��ũ ���");
    }
} 

class RacingCar2 extends Car2{
    @Override
    public void accelate(){
        System.out.println("���̽�ī ���� ���� ���");
    }    
    public static void stop(){
        System.out.println("���̽�ī ���� �극��ũ ���");
    }
}
 
public class Overriding1 {
    public static void main(String[] args) {
        Car2 myCar = new RacingCar2();
        //�Ϲ� �޼���
        myCar.accelate();
        //Ŭ���� �޼���
        myCar.stop();
    }
}
