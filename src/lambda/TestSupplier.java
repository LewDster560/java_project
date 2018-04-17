package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
        */
public class TestSupplier {
    public static void main(String[] args) {
        //构造器引用.它的语法是Class::new，或者更一般的Class< T >::new实例如下：
        final Car car = Car.create(Car::new);
        final Car car1 = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car,car1);

        //静态方法引用：它的语法是Class::static_method，实例如下：
        cars.forEach(Car::collide );

        //特定类的任意对象的方法引用：它的语法是Class::method实例如下：
        cars.forEach(Car::repair);

        //特定对象的方法引用：它的语法是instance::method实例如下：
        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);

        List<String> names = new ArrayList<String>();
        names.add("taiguo");
        names.add("xinjiapo");
        names.add("yindunixiya");

        names.forEach(System.out::println);
    }
}
