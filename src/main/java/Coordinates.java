import java.util.Comparator;

public class Coordinates implements Comparable<Coordinates>{

 private int x;
    private int y;

    Coordinates(int x, int y) {

        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }



    @Override
    public int compareTo(Coordinates compareCor) {

        return  Comparator.comparing((Coordinates::getX))
                .thenComparing((Coordinates::getY)).compare(this, compareCor);
//int compareX =((Coordinates)compareCor).getX();           // tutaj porownywal tylko X

//
//        return this.x-compareX;
    }




    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
