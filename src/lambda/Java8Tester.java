package lambda;

/**
 * Lambda 表达式主要用来定义行内执行的方法类型接口，
 * 例如，一个简单方法接口。
 * 在上面例子中，
 * 我们使用各种类型的Lambda表达式来定义MathOperation接口的方法。
 * 然后我们定义了sayMessage的执行。
 * Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
 */
public class Java8Tester {

    final static String salutation = "Hello! ";

    public static void main(String[] args) {
        // 类型声明
        MathOperation additon = (int a, int b) -> a + b;
        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;
        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;


        Java8Tester tester = new Java8Tester();

        System.out.println("10 + 5 = " + tester.operate(10, 5, additon));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //不用括号
        GreetingService greetingService1 = message -> System.out.println("Hello " + message);

        //用括号
        GreetingService greetingService2 = message -> System.out.println("Hello " + message);

        //lambda 表达式只能引用标记了 final 的外层局部变量，这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
        GreetingService greetingService3 = message -> System.out.println(salutation + message);

        greetingService1.sayMessage("liudong");
        greetingService2.sayMessage("zhangsan");
        greetingService3.sayMessage("wangwu");

        int num = 1;

        Coverter<Integer, Integer> coverter = (param) -> System.out.println(String.valueOf(param + num));
        coverter.convert(3);
        //num = 5;
        //lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
        //Error:(50, 100) java: 从lambda 表达式引用的本地变量必须是最终变量或实际上的最终变量

        //在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量
        //        String first = "";
        //        Comparator<String> comparator = (first,second) -> Integer.compare(first.length() , second.length());

    }

    interface MathOperation {
        int Operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.Operation(a, b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    interface Coverter<T1, T2> {
        void convert(int i);
    }


}
