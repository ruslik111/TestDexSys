package org.example;

import java.util.ArrayList;

public class Commands {
    public static final String[] commands ={"add","print","remove","clear","help"};
    public static ArrayList<Double> valueX1= new ArrayList<>();
    public static ArrayList<Double> valueY1= new ArrayList<>();
    public static ArrayList<Double> valueX2= new ArrayList<>();
    public static ArrayList<Double> valueY2= new ArrayList<>();
    public static ArrayList<Double> valueX3= new ArrayList<>();
    public static ArrayList<Double> valueY3= new ArrayList<>();
    public static ArrayList<Double> valueXNO= new ArrayList<>();
    public static ArrayList<Double> valueYNO= new ArrayList<>();
    public static void add(double x,double y){
       if(Commands.NoGroup(x,y)) {
           if (y >= x) {
               valueX1.add(x);
               valueY1.add(y);
           }
           if (y >= x*x) {
               valueX2.add(x);
               valueY2.add(y);
           }
           if (y >= x*x*x) {
               valueX3.add(x);
               valueY3.add(y);
           }
       }
       else {
           valueXNO.add(x);
           valueYNO.add(y);
       }

    }
    public static void print(){
        if(valueX1.isEmpty()||valueY1.isEmpty()){
            System.out.println("Группа 1 пуста");
        }
        else{
            System.out.print("Группа 1: ");
            for(int i=0;i<valueX1.size();i++){
                System.out.print(valueX1.get(i)+" "+valueY1.get(i)+" ");
            }
        }
        System.out.println();
        if(valueX2.isEmpty()||valueY2.isEmpty()){
            System.out.println("Группа 2 пуста");
        }
        else{
            System.out.print("Группа 2: ");
            for(int i=0;i<valueX2.size();i++){
                System.out.print(valueX2.get(i)+" "+valueY2.get(i)+" ");
            }
        }
        System.out.println();
        if(valueX3.isEmpty()||valueY3.isEmpty()){
            System.out.println("Группа 3 пуста");
        }
        else{
            System.out.print("Группа 3: ");
            for(int i=0;i<valueX3.size();i++){
                System.out.print(valueX3.get(i)+" "+valueY3.get(i)+" ");
            }
        }
        System.out.println();
        if(valueXNO.isEmpty()||valueYNO.isEmpty()){
            System.out.println("Группа 4 пуста");
        }
        else {
            System.out.print("Группа 4: ");
            for (int i = 0; i < valueXNO.size(); i++) {
                System.out.print(valueXNO.get(i) + " " + valueYNO.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void print(String GroupID){
        int groupID=Integer.parseInt(GroupID);
        switch (groupID){
            case 1:if(valueX1.isEmpty()||valueY1.isEmpty()){
                    System.out.println("Группа 1 пуста");
                }
                else{
                    System.out.print("Группа 1: ");
                    for(int i=0;i<valueX1.size();i++){
                        System.out.print(valueX1.get(i)+" "+valueY1.get(i)+" ");
                    }
                }
                break;
            case 2: if(valueX2.isEmpty()||valueY2.isEmpty()){
                System.out.println("Группа 2 пуста");
            }
            else{
                System.out.print("Группа 2: ");
                for(int i=0;i<valueX2.size();i++){
                    System.out.print(valueX2.get(i)+" "+valueY2.get(i)+" ");
                }
            }
            break;
            case 3:if(valueX3.isEmpty()||valueY3.isEmpty()){
                System.out.println("Группа 3 пуста");
            }
            else{
                System.out.print("Группа 3: ");
                for(int i=0;i<valueX3.size();i++){
                    System.out.print(valueX3.get(i)+" "+valueY3.get(i)+" ");
                }
            }
            break;
            case 4:if(valueXNO.isEmpty()||valueYNO.isEmpty()){
                System.out.println("Группа 4 пуста");
            }
            else {
                System.out.print("Группа 4: ");
                for (int i = 0; i < valueXNO.size(); i++) {
                    System.out.print(valueXNO.get(i) + " " + valueYNO.get(i) + " ");
                }
            }
            break;
            default:System.out.println("Неизвестная группа");
            break;
        }
        System.out.println();

    }
    public static void clear(){
        valueYNO.clear();
        valueXNO.clear();
        valueY1.clear();
        valueX1.clear();
        valueX2.clear();
        valueY2.clear();
        valueX3.clear();
        valueY3.clear();
    }
    public static void help(){
        System.out.println("add <point> - добавить в память программы точки, координаты передаются парами чисел через пробел");
        System.out.println("print - напечатать построчно каждую группу");
        System.out.println("print<group_num> - напечатать точки,входяшие в группу(ы) ");
        System.out.println("clear - очистить память");
        System.out.println("remove<group_num> - удалить из памяти все точки,входящие в эту группу.");
    }
    public static void remove(int first){
        switch (first){
            case 1:valueY1.clear();
                valueX1.clear();

                break;
            case 2:valueX2.clear();
                valueY2.clear();
                break;
            case 3: valueX3.clear();
                valueY3.clear();
                break;
            case 4: valueYNO.clear();
                valueXNO.clear();
                break;
        }
    }
    public static void remove(int first,int second){
        switch (first){
            case 1:valueY1.clear();
                valueX1.clear();
                break;
            case 2:valueX2.clear();
                valueY2.clear();
                break;
            case 3: valueX3.clear();
                valueY3.clear();
                break;
            case 4: valueYNO.clear();
                valueXNO.clear();
                break;
        }
        switch (second){
            case 1:valueY1.clear();
                valueX1.clear();
                break;
            case 2:valueX2.clear();
                valueY2.clear();
                break;
            case 3: valueX3.clear();
                valueY3.clear();
                break;
            case 4: valueYNO.clear();
                valueXNO.clear();
                break;
        }

    }
    public static void remove(int first,int second,int third){
        switch (first){
            case 1:valueY1.clear();
                valueX1.clear();
                break;
            case 2:valueX2.clear();
                valueY2.clear();
                break;
            case 3: valueX3.clear();
                valueY3.clear();
                break;
            case 4: valueYNO.clear();
                valueXNO.clear();
                break;
        }
        switch (second){
            case 1:valueY1.clear();
                valueX1.clear();
                break;
            case 2:valueX2.clear();
                valueY2.clear();
                break;
            case 3: valueX3.clear();
                valueY3.clear();
                break;
            case 4: valueYNO.clear();
                valueXNO.clear();
                break;
        }
        switch (third){
            case 1:valueY1.clear();
                valueX1.clear();
                break;
            case 2:valueX2.clear();
                valueY2.clear();
                break;
            case 3: valueX3.clear();
                valueY3.clear();
                break;
            case 4: valueYNO.clear();
                valueXNO.clear();
                break;
        }

    }

    public static boolean NoGroup(double x,double y){
        if(y>=x){
            return true;
        }
        if(y>=Math.pow(x,2)){
            return true;
        }
        if(y>=Math.pow(x,3)){
           return true;
        }
        return false;

    }
}
