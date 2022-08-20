package collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistConcept {
    public static void main(String[] args) {

        ArrayList<Object>arr=new ArrayList<Object>();
           /**adding elements into array using add method*/
        arr.add(90);
        arr.add("julia");
        arr.add('z');
        arr.add(true);
        arr.add(false);
        System.out.println(arr);

          /** finding number of element in arraylist using size method */
        System.out.println("total number of elements in arraylist:"+arr.size());

          /** removing one element from the array list using remove method */
        arr.remove(4);
        System.out.println("After removing one element:"+ arr);

        arr.add(2,"javaTpoint");
        System.out.println("After inserting one element :"+arr);

        /**retreive a specific element using get method*/
        System.out.println(arr.get(1));

        /**replace a element using set method*/
        arr.set(2,"python");
        System.out.println("After replacing a element:"+ arr);

        /**searching a element using contain method*/
        System.out.println(arr.contains("python"));
        System.out.println(arr.contains(100));

        /** array list is mpty or not using isEmpty method*/
        System.out.println(arr.isEmpty());

        /** Reading element using for loop*/
        for(Object e:arr){
            System.out.println(e);
        }


        //using interator loop
        Iterator array=arr.iterator();
         while (array.hasNext()){
             System.out.println(array.next());
         }



    }
}
