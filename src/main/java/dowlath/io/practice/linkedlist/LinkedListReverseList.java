package src.java.io.dowlath.dsapractice.linkedlist;

public class LinkedListReverseList {
    ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertLast(int value){
        ListNode node = new ListNode(value);
        if(head == null){
            head = node;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void printList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->" );
            current = current.next;
        }
        System.out.println("nuil");
    }

    public ListNode reverseList(){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        LinkedListReverseList list = new LinkedListReverseList();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.printList();
        ListNode newNode = list.reverseList();
        list.head = newNode;
        System.out.println("ReverseList ....");
        list.printList();

    }
}