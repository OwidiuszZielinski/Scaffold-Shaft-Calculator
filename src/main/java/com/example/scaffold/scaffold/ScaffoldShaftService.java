package com.example.scaffold.scaffold;

import java.util.ArrayList;

public class ScaffoldShaftService {



    ArrayList<Integer> scaffolddimensions = new ArrayList<>();
    ArrayList<Integer> scaffolddimensionreal = new ArrayList<>();
    ArrayList<Integer> scaffold = new ArrayList<Integer>();


    int one = 45;
    int two = 73;
    int tree = 109;
    int four = 157;
    int five = 207;
    int six = 257;
    int seven = 307;
    int realdemension = 19;

    public  void addscaffolddimensions(){
        scaffolddimensions.add(one);
        scaffolddimensions.add(two);
        scaffolddimensions.add(tree);
        scaffolddimensions.add(four);
        scaffolddimensions.add(five);
        scaffolddimensions.add(six);
        scaffolddimensions.add(seven);

    }

    public  void addscaffolddimensionsreal(){
        for (Integer i:scaffolddimensions) {
            scaffolddimensionreal.add(i+realdemension);
        }

    }




    public void scaffoldasidebget(ScaffoldShaft temp) {
        int sizelogic = 50;
        int size = temp.getTempb() - temp.getTemp2b()  - temp.getTemp2b();

        for (Integer i : scaffolddimensionreal) {
            int freesize = size - i;
            int scaffolddim = i - realdemension;

            if (i <= size) {
                temp.setScaffloddimb(scaffolddim);
                temp.setFreesizeb((size - i) /2);

            }else if(freesize > sizelogic){

            }

        }

    }


    public  void scaffoldasideaget(ScaffoldShaft temp) {
        int sizelogic = 50;
        int size = temp.getTempa() - temp.getTemp2a() - temp.getTemp2a();

        for (Integer i : scaffolddimensionreal) {
            int freesize = size - i;
            int scaffolddim = i - realdemension;

            if (i <= size) {
                temp.setScaffloddima(scaffolddim);
                temp.setFreesizea((size-i)/2);

            }else if (freesize > sizelogic){
                for (Integer x : scaffolddimensionreal){

                }





            }
        }
    }
}