package dream;

/**
 * 可以使用 super 来调用指定接口的默认方法
 */
public class AnotherCar implements FourWheeler, ThreeWheeler {
    @Override
    public void print() {
        //调用三轮的接口
        ThreeWheeler.super.print();
    }
}
