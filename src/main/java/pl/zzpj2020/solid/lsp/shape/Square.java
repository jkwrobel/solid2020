package pl.zzpj2020.solid.lsp.shape;

public class Square implements Shape {
    float side = 0.0f;

    @Override
    public float calcArea() {
        return side * side;
    }

    @Override
    public float calcCircumference() {
        return 2 * side;
    }

    public Square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
}
