package pl.zzpj2020.solid.lsp.shape;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double countArea() {
        return a*b;
    }

    @Override
    public double countPerimeter() {
        return 2*(a+b);
    }
}
