package com.example.scaffold.scaffold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ScaffoldShaftService {


    ArrayList<Integer> scaffolddimensions = new ArrayList<>();
    ArrayList<Integer> scaffolddimensionreal = new ArrayList<>();


    int one = 45;
    int two = 73;
    int tree = 109;
    int four = 157;
    int five = 207;
    int six = 257;
    int seven = 307;
    int realdemension = 19;
    String plus = "+";
    //dopisz aby 19 cm bylo dodawane do caloego wyrazenia

    public void addscaffolddimensions() {
        scaffolddimensions.addAll(Arrays.asList(one, two, tree, four, five, six, seven));
        scaffolddimensions.sort(Comparator.reverseOrder());

    }



    public void scaffoldasideaget(ScaffoldShaft temp) {

        ArrayList result = new ArrayList();
        int size = temp.getDeclaredwalla() - temp.getDeclaredfreespacewalla() - temp.getDeclaredfreespacewalla() - realdemension;


        for (Integer x : scaffolddimensions) {

            int module = x;
            int quantity = (size / x);
            size = (size - quantity * x);
            temp.setFreespacea(size / 2);

            if (quantity > 0) {
                result.add(quantity);
                result.add("x");
                result.add(module);
                result.add("cm" + " " + plus);

            }
        }
        result.remove(result.size() - 1);
        String formattedString = result.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
        temp.setResulta(formattedString);
    }


    public void scaffoldasidebget(ScaffoldShaft temp) {

        ArrayList result = new ArrayList();
        int size = temp.getDeclaredwallb() - temp.getDeclaredfreespacewallb() - temp.getDeclaredfreespacewallb() - realdemension;

        for (Integer x : scaffolddimensions) {

            int module = x ;
            int quantity = (size / x);

            size = (size - quantity * x);
            temp.setFreespaceb(size / 2);

            if (quantity > 0) {

                result.add(quantity);
                result.add("x");
                result.add(module);
                result.add("cm" + " " + plus);

            }


        }
        result.remove(result.size() - 1);

        String formattedString = result.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
        temp.setResultb(formattedString);
        result.add("cm");
    }
}
