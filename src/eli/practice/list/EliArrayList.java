package eli.practice.list;

public class EliArrayList implements EliList {

    private int[] numbers;
    private int end = 0;
    public EliArrayList(){
        this.numbers = new int[10];
    }
    /**
     * This method will add a number to the end of the list
     * @param number
     */

    public void add(int number){
        if(end == numbers.length){
            addToArray();
        }
        numbers[end] = number;
        end++;
    }
    public void remove(int index){
        for(int i = index; i < end-1; i++){
            numbers[i] = numbers[i+1];
        }
        end--;
    }
    /**
     * getSize will return the number of items that have been added to the list
     * @return
     */
    public int getSize(){
        return end;
    }
    /**
     * get the value of a given index in the list
     * @param index
     * @return
     */
    public int get(int index){
        return numbers[index];
    }

    /**
     * print out all elements of the list
     */
    public void printList(){
        for(int i = 0; i < end;  i++){
            System.out.print(numbers[i] + ((i == end-1)? "" : ","));
        }
    }
    private void addToArray(){
        int[] newArray = new int[end*2];
        for(int i = 0; i < numbers.length; i ++){
            newArray[i] = numbers[i];
        }
        this.numbers = newArray;
    }

}
