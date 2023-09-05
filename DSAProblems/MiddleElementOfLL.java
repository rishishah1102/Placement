package DSAProblems;

// print middle element of linkedlist with least time complexity
public class MiddleElementOfLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // add element to head of linked list
    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void middleElement() {
        Node temp1 = head, temp2 = head;
        while ((temp2 != null) && (temp2.next != null)) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        System.out.println(temp1.data);
    }

    public static void main(String[] args) {
        MiddleElementOfLL llist = new MiddleElementOfLL();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
        llist.push(55);
        llist.push(45);
        llist.push(75);

        llist.middleElement();
    }
}
