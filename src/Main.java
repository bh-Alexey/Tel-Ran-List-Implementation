import linkedlist.MyLinkedList;
import linkedlist.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList1 = new MyArrayList();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);
        arrayList1.add(6);
        System.out.println(arrayList1);

        ArrayList<Integer> arrayListJava = new ArrayList<>();
        arrayListJava.add(1);
        arrayListJava.add(2);
        arrayListJava.add(3);
        arrayListJava.add(4);
        arrayListJava.add(5);
        arrayListJava.add(6);

        for (int i = 0; i < arrayListJava.size(); i++) {
            System.out.println(arrayListJava.get(i));
        }

        for (Integer integer : arrayListJava) {
            if (integer < 4) {
                int index = arrayListJava.indexOf(integer);
                System.out.println(index);
                arrayListJava.remove(index);
            }
        }

        Iterator<Integer> iterator = arrayListJava.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer integerInteger : arrayListJava) {
            System.out.println(integerInteger);
        }

        ListIterator<Integer> listIterator = arrayListJava.listIterator();
        listIterator.hasPrevious();

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getHead().getNext());
        System.out.println(myLinkedList.getHead().getNext().getNext());
    }
}