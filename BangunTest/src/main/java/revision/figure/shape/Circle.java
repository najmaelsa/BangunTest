package revision.figure.shape;

import revision.figure.TwoDimensionalFigure;

public class Circle implements TwoDimensionalFigure {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public Integer sides() {
        return 0;
    }

    @Override
    public Double calculateArea() {
        return (radius * radius * 3.14);
    }

    @Override
    public String toString() {
        return "Name: " + getClass().getSimpleName() +
                "\n Side " + sides() +
                "\n Radius " + getRadius() +
                "\n Area " + calculateArea()
                ;
    }
}
