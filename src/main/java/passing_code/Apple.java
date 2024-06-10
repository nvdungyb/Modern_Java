package passing_code;

public class Apple {
    private int weight;
    private String color;

    Apple(int weight, AppleColor color) {
        this.weight = weight;
        this.color = color.name();
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "[" + this.weight + ", " + this.color + "] ";
    }
}
