package lambda;

/**
 * 方法引用通过方法的名字来指向一个方法。
 * 方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
 * 方法引用使用一对冒号 :: 。
 */
@FunctionalInterface
public interface Supplier<T> {
    T get();
}


class Car {

    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car annother) {
        System.out.println("Following the " + annother.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }


}

