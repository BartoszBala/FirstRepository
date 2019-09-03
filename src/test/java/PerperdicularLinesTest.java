import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PerperdicularLinesTest {


    @Test
void perperdicularLinesTest()
{PerpendicularLines p = new PerpendicularLines();
    List<Coordinates> lista = new ArrayList<>();

    lista.add(new Coordinates(0,4));
    lista.add(new Coordinates(2,0));
    lista.add(new Coordinates(0,0));
    lista.add(new Coordinates(3,6));
    lista.add(new Coordinates(5,8));

String expected ="[[{x=0, y=0}, {x=0, y=4}, {x=2, y=0}]]";

    List<Coordinates> lista2 = new ArrayList<>();

    lista2.add(new Coordinates(8,0));
    lista2.add(new Coordinates(0,0));
    lista2.add(new Coordinates(8,10));
    lista2.add(new Coordinates(3,5));
    lista2.add(new Coordinates(4,88));
    lista2.add(new Coordinates(-180,11));
    lista2.add(new Coordinates(-1040,103));
    lista2.add(new Coordinates(-1000,106));
    lista2.add(new Coordinates(-100,1003));



 String expectedfinal2 = "[[{x=0, y=0}, {x=8, y=0}, {x=8, y=10}], [{x=3, y=5}, {x=8, y=0}, {x=8, y=10}]]";
    List<Coordinates> lista3 = new ArrayList<>();

    lista3.add(new Coordinates(1000,0));
    lista3.add(new Coordinates(120,-890));
    lista3.add(new Coordinates(8,10));
    String expectedfinal3 = "[]";

    List<Coordinates> lista4 = new ArrayList<>();



   assertEquals(expected,p.printListOf3Points(lista).toString());
  assertEquals(expectedfinal2,p.printListOf3Points(lista2).toString());
  assertEquals(expectedfinal3,p.printListOf3Points(lista3).toString());
  assertEquals("[]",p.printListOf3Points(lista4).toString());

}


}
