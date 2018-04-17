package dream;

/**
 * Created by Administrator on 2018/4/16.
 */
public interface ThreeWheeler {
    default void print() {
        System.out.println("我是三轮");
    }

    // 静态方法
    static void blowHorn() {
        System.out.println("按喇叭!!!");
    }
}
