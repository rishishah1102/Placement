package DSAProblems;

// print nth element from linked list from end.

class NthElementFromEndOfLL {
    Node head; // head of the list
    int len = 0;

    /* Linked List node */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printNthFromLast(int N) {
        if (len < N) {
            return;
        }

        Node temp = head;

        // get the (len-N+1)th node from the beginning
        for (int i = 1; i < len - N + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }

    /* Inserts a new Node at end of the list. */
    public void push(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            len++;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
            len++;
        }
    }

    // Driver's code
    public static void main(String[] args) {
        NthElementFromEndOfLL llist = new NthElementFromEndOfLL();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        // Function call
        llist.printNthFromLast(4);
    }

}