import java.util.ArrayList;

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
        System.out.println(arrayListJava);
    }
}