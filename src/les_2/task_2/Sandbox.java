package les_2.task_2;

import java.util.function.*;

public class Sandbox {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println("Predicate: " + predicate.test(1));

        Consumer<Integer> consumer = x -> System.out.println(x);
        System.out.print("Consumer: ");
        consumer.accept(7);

        Function<Integer, String> function = x -> x.toString();
        System.out.println("Function: " + function.apply(12));

        Supplier<Integer> supplier = () -> new Integer(7);
        System.out.println("Supplier: " + supplier.get());

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println("UnaryOperator: " + unaryOperator.apply(10));

        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;
        System.out.println("BinaryOperator: " + binaryOperator.apply(1, 2));

        MyFunctionalInterface<Integer, Integer> mf = x -> x + x;
        MyFunctionalInterface<Integer, Integer> mf2 = x -> x * x;
        // apply method
        System.out.println("MyFunctionalInterface: " + mf.apply(12));
        // default method
        mf.andThen(mf2).apply(5);
        // default method
        mf.compose(mf2).apply(2);
        // static method
        MyFunctionalInterface<Integer, Integer> getStatic = MyFunctionalInterface.get();
        myFunctionalInterfaced2.apply(5);
    }

    public static MyFunctionalInterface<Integer, String> myFunctionalInterfaced2 =
            (t) ->{
                int intValue = t + t;
                String sValue = "" + t + "=" + (t+t);
                return sValue;
            };
}
