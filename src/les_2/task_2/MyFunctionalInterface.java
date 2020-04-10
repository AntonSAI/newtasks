package les_2.task_2;

import java.util.Objects;

@FunctionalInterface
public interface MyFunctionalInterface<T, R> {
    R apply (T t);

    default <V> MyFunctionalInterface<T, V> andThen(MyFunctionalInterface<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

    default <V> MyFunctionalInterface<V, R> compose(MyFunctionalInterface<? super V, ? extends T> before){
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }

    static <T> MyFunctionalInterface<T, T> get() {
        return t -> t;
    }
}
