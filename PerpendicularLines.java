package Algorytmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PerpendicularLines {

    public static void main(String[] args) {
      Random random = new Random();
int numberOfPoints =1000;
int rangeOfCordinates= numberOfPoints*100;
        List<Coordinates> listofcoordinates = new ArrayList<>();

      for(int i=0;i<numberOfPoints;i++)
      {listofcoordinates.add(new Coordinates(random.nextInt(rangeOfCordinates)-rangeOfCordinates/2,random.nextInt(rangeOfCordinates)-rangeOfCordinates/2));

      }
      listofcoordinates.stream().forEach(x-> System.out.println(x));

int licznik=0;
long t1 = System.currentTimeMillis();
        for (int i = 0; i < listofcoordinates.size(); i++) {

            for (int j = 0; j < listofcoordinates.size(); j++) {
if(i<j)
                for (int k = 0; k < listofcoordinates.size(); k++) {
                    if(j<k)
                   if(!(listofcoordinates.get(j).getX()==listofcoordinates.get(k).getX()&&listofcoordinates.get(j).getY()==listofcoordinates.get(k).getY()))
                   if(!(listofcoordinates.get(k).getX()==listofcoordinates.get(i).getX()&&listofcoordinates.get(i).getY()==listofcoordinates.get(k).getY()))
                       if(!(listofcoordinates.get(i).getX()==listofcoordinates.get(j).getX()&&listofcoordinates.get(i).getY()==listofcoordinates.get(j).getY()))
                           if (Math.pow(listofcoordinates.get(i).getX() - listofcoordinates.get(j).getX(), 2) + Math.pow(listofcoordinates.get(i).getY() - listofcoordinates.get(j).getY(), 2) + Math.pow(listofcoordinates.get(j).getX() - listofcoordinates.get(k).getX(), 2) + Math.pow(listofcoordinates.get(j).getY() - listofcoordinates.get(k).getY(), 2) == Math.pow(listofcoordinates.get(i).getX() - listofcoordinates.get(k).getX(), 2) + Math.pow(listofcoordinates.get(i).getY() - listofcoordinates.get(k).getY(), 2))
                    {
                    System.out.println(listofcoordinates.get(i).toString() + listofcoordinates.get(j).toString() + listofcoordinates.get(k).toString());
                        System.out.println(i+" "+j+" "+k);
licznik++;
                    }
                }
            }


        }
        long t2 = System.currentTimeMillis();
        System.out.println("czas: "+(t2-t1)/1000+"s");
        System.out.println("znaleziono "+licznik+" wynikow");
    }
}
