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

// deleting kth element from the linked list

class solution {
    public  Node deletek(Node head, int k){
        if(head == null ) return head;
        
        if( k == 1){
            Node temp = head;
            head = head.next;
            return head;
        }

        int cnt = 0;
        Node temp = head;
        Node prv = null;
        while( temp != null ){
            cnt++;
            if(cnt == k){
                prv.next = prv.next.next;
                break;

            }
            prv = temp;
            temp = temp.next;


        }
        return head;

    }
}

class solutioN {
    public  Node deleteEl(Node head, int el){
        if(head == null ) return head;
        
        if(head.data == el){
            Node temp = head;
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prv = null;
        while( temp != null ){
            
            if(temp.data == el){
                prv.next = prv.next.next;
                break;

            }
            prv = temp;
            temp = temp.next;


        }
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