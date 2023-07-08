package collectionFrameWork;

import java.util.LinkedList;

public class LinkedlistConcept {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        /**adding elements to the arraylist*/
        list.add(100);
        list.add(80.5f);
        list.add(8999);
        list.add('Z');
        list.add('Z');
        list.add("javaClass");
        list.add(true);
        list.add(6,false);
        list.addFirst("nyna");
        list.addLast("aksha");
        System.out.println(list);

        /**coping list elements into linkedlist i.e:one class to another class*/
        LinkedList linkedList=new LinkedList();
        linkedList.addAll(list);
        System.out.println(linkedList);

        /**Total number of elements using size method*/
        System.out.println(list);
        System.out.println("number of elements in the arraylist"+list.size());


        System.out.println(linkedList.contains(90));
        System.out.println(linkedList.clone());

        System.out.println(linkedList.get(5));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getClass());
        /**add a specified element in the arraylist using offer method*/
        linkedList.offer(15);
        System.out.println(linkedList);
        linkedList.offerFirst(12);
        System.out.println(linkedList);
        linkedList.offerLast(13);
        System.out.println(linkedList);

        
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekLast());

        linkedList.poll();
        linkedList.pollLast();
        System.out.println(linkedList);

        linkedList.push(70);
        System.out.println(linkedList);

        linkedList.remove();

        linkedList.remove(7);
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);

        linkedList.set(3,89999);
        System.out.println(linkedList);

        linkedList.removeAll(linkedList);
        System.out.println(linkedList);
    }
}
