package 오버라이딩;

class Car2{
    public void accelate(){
        System.out.println("일반 엔진 사용");
    } 
    public static void stop(){
        System.out.println("일반 브레이크 사용");
    }
} 

class RacingCar2 extends Car2{
    @Override
    public void accelate(){
        System.out.println("레이싱카 전용 엔진 사용");
    }    
    public static void stop(){
        System.out.println("레이싱카 전용 브레이크 사용");
    }
}
 
public class Overriding1 {
    public static void main(String[] args) {
        Car2 myCar = new RacingCar2();
        //일반 메서드
        myCar.accelate();
        //클래스 메서드
        myCar.stop();
    }
}
