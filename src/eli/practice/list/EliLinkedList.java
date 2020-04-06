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
        //initial state
        Link previous = null;
        Link temp = head;
        int counter = 0;
        boolean removed = false;
        while(temp != null && !removed){
            //if counter == index, then temp is the item removed
            if(counter == index){
                if(previous == null){
                    head = temp.getNext();
                }else{
                    previous.setNext(temp.getNext());
                }
                removed = true;
            }

            //update
            previous = temp;
            temp = temp.getNext();
            counter++;
        }
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
