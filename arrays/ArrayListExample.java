import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(67);
//        list.add(667);
//        list.add(672);
//        list.add(670);
//        list.add(617);
//        list.add(673);
//        list.add(676);
//
//        System.out.println(list.contains(67));
//        list.set(0,56);
//        list.remove(2);
//        System.out.println(list);

//        input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
//     get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
//        System.out.println(list);
    }
}

