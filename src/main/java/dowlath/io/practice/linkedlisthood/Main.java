package src.java.io.dowlath.dsapractice.linkedlisthood;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(2);
        list.append(3);
       /* System.out.println(list.removeLast().value);
        System.out.println(list.removeLast().value);
        System.out.println(list.removeLast());*/
        list.prepend(1);
      //  list.removeFirst();
        // System.out.println(list.get(1).value);
       // list.set(1,4);
   //     list.insert(2,4);
   //     list.remove(2);
        list.reverse();;
      list.printList();
    }
}
