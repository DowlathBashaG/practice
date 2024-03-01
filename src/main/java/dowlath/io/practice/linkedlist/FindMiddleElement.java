package src.java.io.dowlath.dsapractice.linkedlist;

public class FindMiddleElement {
    ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertNode(int value){
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
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int middleElemment(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null & fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;        }
        return slowPtr.data;
    }

    public static void main(String[] args) {
        FindMiddleElement middle = new FindMiddleElement();
        middle.insertNode(10);
        middle.insertNode(20);
        middle.insertNode(30);
        middle.insertNode(40);
        middle.insertNode(50);
        middle.printList();
        int middleElement = middle.middleElemment();
        System.out.println("Middle Element ..... :" +middleElement);
    }
}
