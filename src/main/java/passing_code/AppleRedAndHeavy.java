package passing_code;

public class AppleRedAndHeavy implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        if (apple.getColor().equals(AppleColor.RED.name()) && apple.getWeight() > 200)
            return true;
        return false;
    }
}
