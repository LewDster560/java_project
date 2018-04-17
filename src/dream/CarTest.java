package dream;

/**
 * Created by Administrator on 2018/4/16.
 */
public class CarTest {
    public static void  main(String[] args){
        Car car = new Car();
        car.print();

        AnotherCar car1 = new AnotherCar();
        car1.print();

        ThreeWheeler.blowHorn();
    }
}
