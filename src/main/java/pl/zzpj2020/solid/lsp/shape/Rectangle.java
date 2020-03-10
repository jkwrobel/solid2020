package pl.zzpj2020.solid.lsp.shape;

public class Rectangle implements Shape {
    float length = 0.0f;
    float width = 0.0f;

    @Override
    public float calcArea() {
        return length * width;
    }

    @Override
    public float calcCircumference() {
        return 2 * (length + width);
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
