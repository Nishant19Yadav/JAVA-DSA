// Node class represents a node in the linked list
class Node {
    int data;      // Data value
    Node next;     // Pointer to next node

    // Constructor with data and next
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    Node(int data1) {
        data = data1;
        next = null;
    }
}

class Solution {
    // Function to delete tail node of linked list
    public Node deleteTail(Node head) {
        // If list is empty or has one node
        if (head == null || head.next == null) {
            return null;
        }

        // Traverse to the second last node
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        // Delete tail node
        curr.next = null;

        // Return updated head
        return head;
    }
}

public class Linked {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {2, 5, 8, 7};

        // Create first node
        Node y = new Node(arr[0]);

        // Print memory reference of node
        System.out.println(y);

        // Print data stored in node
        System.out.println(y.data);
    }
}