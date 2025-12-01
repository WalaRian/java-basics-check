package at.tasks.consultation;

public class ReflectionExample {
    void checkAnimals(Class classValue) {
//        classValue.isAssignableFrom(Animals.class);
        Animals.class.isAssignableFrom(classValue);
    }

    void checkHasLegs(Class classValue) {
        classValue.isAnnotationPresent(HasLegs.class);
//        classValue.get
    }
}
