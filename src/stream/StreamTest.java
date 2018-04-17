package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/4/16.
 */
public class StreamTest {
    public static void main(String[] args) {

        System.out.println("========================================================================");

        /**
         * 集合接口有两个方法来生成流：
         * stream() − 为集合创建串行流。
         * parallelStream() − 为集合创建并行流。
         */
        List<String> strs = Arrays.asList("1", "2", "3", "4", "5");
        List<String> newStrs = strs.stream().filter(str -> Integer.valueOf(str) > 3).collect(Collectors.toList());
        //forEach   Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。
        newStrs.stream().forEach(System.out::println);

        System.out.println("========================================================================");

        //map 方法用于映射每个元素到对应的结果
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> squaresList = numbers.stream().map(num -> num * num).distinct().collect(Collectors.toList());
        squaresList.stream().forEach(System.out::println);

        System.out.println("========================================================================");

        //filter 用于通过设置的条件过滤出元素
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 50, 10);
        List<Integer> list2 = list1.stream().filter(i -> i > 3).collect(Collectors.toList());
        list2.stream().forEach(System.out::println);

        System.out.println("========================================================================");

        //limit limit 方法用于获取指定数量的流。
        list1.stream().limit(2).forEach(System.out::println);

        System.out.println("========================================================================");

        //sorted sorted 方法用于对流进行排序
        list1.stream().sorted().forEach(System.out::println);

        System.out.println("========================================================================");

        //parallelStream 是流并行处理程序的代替方法
        int n = 0;
        long count = list1.parallelStream().filter(i -> i > n).count();
        System.out.println("大于" + n + "的有" + count + "个");

        System.out.println("========================================================================");

        //Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串
        System.out.println(list1.stream().collect(Collectors.counting()));

        System.out.println("========================================================================");

        //统计
        IntSummaryStatistics stats = list1.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("最大：" + stats.getMax());
        System.out.println("最小：" + stats.getMin());
        System.out.println("平均数：" + stats.getAverage());
        System.out.println("求和：" + stats.getSum());

        System.out.println("========================================================================");

    }
}
