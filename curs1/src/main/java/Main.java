import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Person.PersonBuilder personBuilder =
//                Person.builder()
//                        .age(23)
//                        .firstname("Dsa")
//                        .lastname("ads")
//                        .job("dsa");
//
//        Person person = personBuilder.build();
//        System.out.println(person);

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[0]);
        }

        for (int i : array) {
            System.out.println(i);
        }

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (int i : arrayList) {
            System.out.println(i);
        }


        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }


}
