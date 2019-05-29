package revision;

import revision.figure.Figure;
import revision.figure.shape.Block;
import revision.figure.shape.Circle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Circle(5.0);
        Figure figure2 = new Block(2.0, 3.0, 5.0);

        List<Figure> figureList = new ArrayList<>();
        figureList.add(new Circle(5.0));
        figureList.add(new Block(2.0, 3.0, 5.0));

        for (Figure f : figureList){
            FigurePrinter printer =  new FigurePrinter(f);
            printer.print();
        }

        // open closed example
        try{
            String shape = "Circle";
            Figure figureOpen =  (Figure) Class.forName("revision.figure.shape."+shape).newInstance();
            System.out.println(figureOpen.name());

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Shape tidak ditemukan");
        }
        // open closed example end

    }
}
