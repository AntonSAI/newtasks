package les_2.task_3;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface ThreeFunction<A, B, C, R> {
    R apply(A a, B b, C c);

    default <V> ThreeFunction<A, B, C, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (A a, B b, C c) -> after.apply(apply(a, b, c));
    }
}
