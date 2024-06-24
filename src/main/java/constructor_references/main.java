package constructor_references;

public class main {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, RGB> triFunc = RGB::new;
        RGB color = triFunc.apply(123, 24, 25);
        System.out.println(color);
    }
}
