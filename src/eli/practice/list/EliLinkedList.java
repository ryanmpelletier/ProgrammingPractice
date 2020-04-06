package eli.practice.list;

public class EliLinkedList implements EliList {


    private Link head;
    public EliLinkedList(){
        head = null;
    }
    @Override
    public void add(int number) {
        if(head == null){
            head = new Link(number, null);
        }else{
            Link temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Link(number, null));
        }
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int getSize() {
        int counter = 0;
        Link temp = head;
        while(temp != null){
            temp = temp.getNext();
            counter = counter + 1;
        }
        return counter;
    }

    @Override
    public int get(int index) {
        Link temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp.getValue();
    }
    @Override
    public void printList() {
        Link temp = head;
        while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }
}
