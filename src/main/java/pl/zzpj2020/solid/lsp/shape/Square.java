package pl.zzpj2020.solid.lsp.shape;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double countArea() {
        return a*a;
    }

    @Override
    public double countPerimeter() {
        return 4*a;
    }
}
