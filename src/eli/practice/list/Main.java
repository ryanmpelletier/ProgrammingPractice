package eli.practice.list;

public class Main {
    public static void main(String[] args) {
        EliList list = new EliLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();
        System.out.println(list.get(5));
    }
}
