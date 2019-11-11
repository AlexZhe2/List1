public class Main {

    public static void main(String[] args) {
        List list = new List();

        System.out.println("---Task# 1---");
        list.task1();

        System.out.println("---Task# 2---");
        list.methodFillingLists();
        list.printList();
        list.printList(list.thirdLtist);

        System.out.println("---Task# 3---");
        list.methodFillingSet();
    }

}
