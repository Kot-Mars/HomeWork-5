import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    final static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        randomNum(arrayList, 101);
        randomNum(linkedList,101);


    }
    public static void randomNum(ArrayList arrayList, int cout) {
        long start = System.currentTimeMillis()/1000L;
        for (int i = 0; i < cout; i++) {
            arrayList.add(i, random.nextInt());
        }
        long finish = System.currentTimeMillis() - start;
        System.out.printf("Время добавленния - " + finish + "\n");
        start = System.currentTimeMillis()/1000l;
        arrayList.clear();
        finish = System.currentTimeMillis() - start;
        System.out.printf("Время удалления - " + finish+ "\n" );
    }

    public static void randomNum(LinkedList linkedList, int cout) {
        long start = System.currentTimeMillis()/1000L;
        for (int i = 0; i < cout; i++) {
            linkedList.add(i, random.nextInt());
        }
        long finish = System.currentTimeMillis() - start;
        System.out.printf("Время добавленния - " + finish + "\n");
        start = System.currentTimeMillis()/1000l;
        linkedList.clear();
        finish = System.currentTimeMillis() - start;
        System.out.printf("Время удалления - " + finish + "\n");
    }
}