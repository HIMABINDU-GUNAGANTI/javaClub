package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistConcept_02 {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<String>();
        arr.add("julia");
        arr.add("alia");
        arr.add("mytra");
        arr.add("duo");
        arr.add("kapur");
        arr.add("david");

        ArrayList<String> arr_name=new ArrayList<String>();
        arr_name.addAll(arr);
        System.out.println(arr_name);

        arr_name.removeAll(arr);
        System.out.println("After removing all elements:"+arr_name);

        System.out.println("list of elements in the arraylist"+arr);
        Collections.sort(arr);
        System.out.println("After Sorting elements:"+arr);

        Collections.sort( arr, Collections.reverseOrder());
        System.out.println(arr);

        Collections.shuffle(arr);
        System.out.println("After shuffling order:"+arr);

        arr.clear();
        System.out.println("After clear all element in the array list:"+arr);





    }
}
