import java.util.List;

public class PerpendicularLinesMain {

    public static void main(String[] args) {
        PerpendicularLines p = new PerpendicularLines();
        List<Coordinates> listofcoordinates = p.createListOfCordinates();
        listofcoordinates.forEach(x-> System.out.println(x));
       p.printListOf3Points(listofcoordinates).stream().forEach(System.out::println);
    }
}
