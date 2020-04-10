package les_2.task_3;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Long, String> bi = (x, y) -> ""+x+","+y;
        ThreeFunction<Boolean, Integer, Long, String> tri = (x,y,z) -> ""+x+","+y+","+z;
        System.out.println(tri.apply(false, 1, 2L));
        tri = tri.andThen(s -> "["+s+"]");
        System.out.println(tri.apply(true,2,3L));
    }
}
