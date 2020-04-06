package eli.practice.list;

public class Main {
    public static final int MILLION = 1000000;

    public static void main(String[] args) {

        EliList linkedList = new EliLinkedList();
        testAll(linkedList);
        System.out.println();
        EliList arrayList = new EliArrayList();
        testAll(arrayList);

    }

    public static void testAll(EliList eliList){
        System.out.println("Took " + testAdd(eliList) + " milliseconds to add 1,000,000 items to " + eliList.getClass().getName());
        System.out.println("Took " + testGet(eliList) + " milliseconds to get 1,000,000 items to " + eliList.getClass().getName());
        System.out.println("Took " + testRemove(eliList) + " milliseconds to remove 1,000,000 items " + eliList.getClass().getName());
    }

    public static long testAdd(EliList eliList){
        System.out.println("Adding 1,000,000 items to " + eliList.getClass().getName());
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < MILLION; i++){
            eliList.add(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long testGet(EliList eliList){
        System.out.println("Getting 1,000,000 from " + eliList.getClass().getName());
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < MILLION; i++){
            eliList.get(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long testRemove(EliList eliList){
        System.out.println("Removing 1,000,000 from " + eliList.getClass().getName());
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < MILLION; i++){
            eliList.remove(0);
        }
        return System.currentTimeMillis() - startTime;
    }



}
