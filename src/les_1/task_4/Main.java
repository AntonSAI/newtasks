package les_1.task_4;

import les_1.task_3.Beagle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException,
            InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        ReflectionChecker checker = new ReflectionChecker();
        Beagle beagle = new Beagle();
        checker.showClassName(beagle);
        Beagle beagle1 = Beagle.class.newInstance();
        Beagle beagle2 = (Beagle) Class.forName("les_1/task_3/Beagle").newInstance();
        Constructor<Beagle> constructor = Beagle.class.getConstructor();
        Beagle beagle3 = constructor.newInstance();
        Beagle beagle4 = constructor.newInstance("Dolly", 99);
    }
}
