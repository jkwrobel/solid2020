package pl.zzpj2020.solid.lsp.shape;

public class Circle implements Shape{
    float radius = 0.0f;

    @Override
    public float calcArea() {
        return (float) (Math.PI * radius);
    }

    @Override
    public float calcCircumference() {
        return (float) (2.0f * Math.PI * radius);
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
