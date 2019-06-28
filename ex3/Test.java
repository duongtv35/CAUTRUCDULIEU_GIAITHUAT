package ex3;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //Creat a list
    MyArrayList<String> list = new MyArrayList<String>();



    list.add("America");
        System.out.println("1" +list);
    list.add(0,"Canada");
        System.out.println("(2)"+list);
    list.add("Russia");
        System.out.println("(3)" +list);
    list.add("France");
        System.out.println("(4)" +list);
    list.add(3,"Germany");
        System.out.println("(5" +list);
    list.add(4,"Norway");
        System.out.println("(6" +list);
    list.remove("Canada");
        System.out.println("(7)" + list);
    list.remove("America");
        System.out.println("(8)" +list);
//        for (String s:list
//             ) {
//            System.out.println(s.toUpperCase()+ "");
//
//        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
