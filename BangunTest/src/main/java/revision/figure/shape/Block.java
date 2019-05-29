package revision.figure.shape;

import revision.figure.ThreeDimensionalFigure;

public class Block implements ThreeDimensionalFigure {
    private Double x;
    private Double y;
    private Double z;

    public Block(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public Integer sides() {
        return 12;
    }

    @Override
    public String name() {
        return "Persegi Panjang";
    }

    @Override
    public Double calculateVolume() {
        return x * y * z;
    }

    @Override
    public String toString() {
        return "Name: " + getClass().getSimpleName() +
                "\n Side " + sides() +
                "\n Volume " + calculateVolume()
                ;
    }

}
