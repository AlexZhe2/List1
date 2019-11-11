import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class List {

    String[] stringArr = {"1", "22", "333", "4444", "55555", "666666", "7777777", "88888888", "55555", "999999999"};

    LinkedList<String> allA = new LinkedList<>();

    public void task1() {

        allA.addAll(Arrays.asList(stringArr));

        for (int i = 0; i < allA.size(); i++) {

            if (i != 0) {
                if (allA.get(i - 1).length() > allA.get(i).length()) {
                    System.out.println("Element # " + i + " broke the rule");
                    break;
                }
            }
        }
    }

    Integer[] intArr = {1, 2, 3, 4, 5, 66, 77, 88, 99, 32, 12, 25, 78, 87, 43, 68, 99, 16, 12, 20};

    LinkedList<Integer> zeroLtist = new LinkedList<>();
    LinkedList<Integer> firstLtist = new LinkedList<>();
    LinkedList<Integer> secondLtist = new LinkedList<>();
    LinkedList<Integer> thirdLtist = new LinkedList<>();

    public void methodFillingLists() {

        zeroLtist.addAll(Arrays.asList(intArr));

        System.out.println("zeroLtist: " + zeroLtist);

        for (Integer i : zeroLtist) {

            if (i % 2 == 0) {
                firstLtist.add(i);
            }
            if (i % 3 == 0) {
                secondLtist.add(i);
            }
            if (i % 2 != 0 && i % 3 != 0) {
                thirdLtist.add(i);
            }
        }
    }


    public void printList() {
        System.out.println("firstLtist: " + firstLtist);
        System.out.println("secondLtist: " + secondLtist);
        System.out.println("thirdLtist: " + thirdLtist);
    }


    public void printList(LinkedList anyList) {
        System.out.println("элементы указанного списка: " + anyList);
    }

    HashSet<Integer> hashSet = new HashSet<>();

    public void methodFillingSet() {

        hashSet.addAll(Arrays.asList(intArr));
        System.out.println("hashSetBefore: " + hashSet);

        for (int i = 0; i < hashSet.size(); i++) {
            if (hashSet.remove(i)) ;
        }

        System.out.println("hashSetAfter: " + hashSet);

    }

}
