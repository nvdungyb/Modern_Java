package constructor_references;

public class RGB {
    private int x, y, z;

    public RGB(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "[X = " + x + ", Y = " + y + ", Z = " + z + "] ";
    }
}
