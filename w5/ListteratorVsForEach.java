import java.util.LinkedList;
import java.util.ListIterator;

public class ListteratorVsForEach
{

    /*
     * For Each 
     *  Simplicity - easy to code, read and modify
     *  Only read only access - cannot modify (add, edit, remove)
     *  cannot get the index values during the iteration
     * 
     * List Iterator
     *  Modifcations while iteraion is possible - add, edit, delete
     *  Bidirectional iteration - allows you to iterate in both directions (forward and backward) through the list.
     *  Buit in methods to find index values
     *  
     */

    public static void main(String[] args) {
      
        ListteratorVsForEachTest obj = new ListteratorVsForEachTest();

        obj.displayAll();

        // add 'test ' to index 1
        obj.addToIndex(1, "test");
        obj.displayAll();

        obj.editByIndex(1, "test+");
        obj.displayAll();

        obj.deleteItem("test+");
        obj.displayAll();

        obj.backwordIteration();
    }
}

class ListteratorVsForEachTest
{
    private LinkedList<String> fruits = new LinkedList<String>();
    public ListteratorVsForEachTest() {
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.add("Guava");
    }

    // https://stackoverflow.com/questions/2102499/iterating-through-a-list-in-reverse-order-in-java
    public void backwordIteration() {
        ListIterator<String> itr = fruits.listIterator(fruits.size());
       
        while (itr.hasPrevious()) {  
            System.out.println(itr.previousIndex() + " --> " +  itr.previous());
        }
    }

    public void deleteItem(String valueToRemove) {

        ListIterator<String> itr = fruits.listIterator();
        while (itr.hasNext()) {  
            var current = itr.next();          
            if(current.equals(valueToRemove))
            {
                itr.remove();
            }
        }
    }

    public void editByIndex(int index, String value) {
       
        ListIterator<String> itr = fruits.listIterator();

        while (itr.hasNext()) {
            itr.next();
            if(itr.nextIndex() - 1 == index)
            {
                itr.set(value);
            }
        }
    }

    public void addToIndex(int index, String value) {
       
        ListIterator<String> itr = fruits.listIterator();

        while (itr.hasNext()) {
            itr.next();
            if(itr.nextIndex() == index)
            {
                itr.add(value);
            }
        }
    }

    public void displayAll() 
    {
        int index = 0;          // to show that for each do not maintain an index with in loop structure, you have to maintain it manualy 
        for (String fruite : fruits) {
            System.out.println(index++ + " -> " + fruite);
        }
        System.out.println("\n");
    }
}