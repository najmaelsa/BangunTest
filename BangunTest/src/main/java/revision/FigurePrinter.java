package revision;

import revision.figure.Figure;

public class FigurePrinter {
    private Figure figure;

    public FigurePrinter(Figure figure) {
        this.figure = figure;
    }

    public void print() {
        System.out.println(figure.toString());
    }

}
