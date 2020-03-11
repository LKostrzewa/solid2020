package pl.zzpj2020.solid.lsp.shape;

public class Circle implements Shape {
    private double r;

    @Override
    public double countArea() {
        return Math.PI*r*r;
    }

    @Override
    public double countPerimeter() {
        return 2*Math.PI*r;
    }
}
