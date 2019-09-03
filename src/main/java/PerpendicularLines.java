import java.util.*;

class PerpendicularLines {


    List<Coordinates> createListOfCordinates() {
        Random random = new Random();
        int numberOfPoints = 100;
        int rangeOfCordinates = numberOfPoints * 20;
        List<Coordinates> listofcoordinates = new ArrayList<>();

        for (int i = 0; i < numberOfPoints; i++) {
            listofcoordinates.add(new Coordinates(random.nextInt(rangeOfCordinates) - rangeOfCordinates / 2, random.nextInt(rangeOfCordinates) - rangeOfCordinates / 2));

        }
        return listofcoordinates;
    }

    List<List<Coordinates>> printListOf3Points(List<Coordinates> listofcoordinates) {
        int licznik = 0;
        List<List<Coordinates>> result = new ArrayList<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < listofcoordinates.size(); i++) {

            for (int j = 0; j < listofcoordinates.size(); j++) {

                for (Coordinates listofcoordinate : listofcoordinates) {

                    if (!(listofcoordinates.get(j).getX() == listofcoordinate.getX() && listofcoordinates.get(j).getY() == listofcoordinate.getY()))
                        if (!(listofcoordinate.getX() == listofcoordinates.get(i).getX() && listofcoordinates.get(i).getY() == listofcoordinate.getY()))
                            if (!(listofcoordinates.get(i).getX() == listofcoordinates.get(j).getX() && listofcoordinates.get(i).getY() == listofcoordinates.get(j).getY()))
                                if (Math.pow(listofcoordinates.get(i).getX() - listofcoordinates.get(j).getX(), 2) + Math.pow(listofcoordinates.get(i).getY() - listofcoordinates.get(j).getY(), 2) + Math.pow(listofcoordinates.get(j).getX() - listofcoordinate.getX(), 2) + Math.pow(listofcoordinates.get(j).getY() - listofcoordinate.getY(), 2) == Math.pow(listofcoordinates.get(i).getX() - listofcoordinate.getX(), 2) + Math.pow(listofcoordinates.get(i).getY() - listofcoordinate.getY(), 2)) {

                                    licznik++;

                                    List<Coordinates> resulta = new ArrayList<>();
                                    resulta.add(listofcoordinates.get(i));
                                    resulta.add(listofcoordinates.get(j));
                                    resulta.add(listofcoordinate);
                                    Collections.sort(resulta);
                                    result.add(resulta);


                                }
                }
            }


        }

        long t2 = System.currentTimeMillis();
        System.out.println("czas: " + (t2 - t1) / 1000 + "s");
        System.out.println("znaleziono " + licznik / 2 + " wynikow");
        Collections.sort(result, new ListComparator<>());
        List<List<Coordinates>> bestList = new ArrayList<>();
        for (int i = 0; i < result.size(); i = i + 2) {
            bestList.add(result.get(i));

        }
        return bestList;
    }
}
