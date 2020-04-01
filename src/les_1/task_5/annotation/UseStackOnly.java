package les_1.task_5.annotation;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface UseStackOnly {
}
