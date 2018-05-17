package src;

public class Builder {
    public static void main(String[] args) {
        Generator g = new Generator("0001");
        g.buildRectangle(400, 150);
        g.print();
    }
}
