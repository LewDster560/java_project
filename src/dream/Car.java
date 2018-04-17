package dream;

/**
 * 创建自己的默认方法，来覆盖重写接口的默认方法：
 */
public class Car implements FourWheeler,ThreeWheeler {
    @Override
    public void print() {
        System.out.println("我重写了自己的默认方法，我有多个轮");
    }
}
