package les_1.task_4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionChecker {
    public void showClassName(Object o) {
        Class clazz = o.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassFields(Object o) {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    public void showClassMethod(Object o) {
        Class clazz = o.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    public void showMethodAnnotations(Object o) {
        Class clazz = o.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.toString());
            }
        }
    }

    public void setClassFields(Object o) throws IllegalAccessException {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            field.set(o, "qqq");
            field.setAccessible(false);
        }
    }

    public void testMethods(Object o) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException, InstantiationException {
        Class noparams[] = {};
        Class clazz = o.getClass();
        o = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("print", noparams);
        method.invoke(o, null);
    }
}
