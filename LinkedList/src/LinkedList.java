/**
 * Author: Troy Verwayen
 * Singly Linked List Implementation
 *
 * Time Complexity
 *          Worst:     Average:
 * Search   - O(n)       O(N)
 * Insert   - O(1)       O(1)
 * Deletion - O(1)       O(1)
 */
public class LinkedList {
    Node head;
    int nodes;

    /**
     * Constructor for LinkedList DS.
     */
    public LinkedList() {
        this.head = null;
        this.nodes = 0;
    }

    /**
     * Constructor for LinkedList DS
     * @param value Value of the node.
     */
    public LinkedList(int value) {
        this.head = new Node(value , null);
        this.nodes = 0;
    }

    // Insert at beginning
    public void insertFirst(int value) {
        head = new Node(value, head);
        nodes++;
    }

    // Insert at end
    public void insert(int value) {
        Node currentNode = head;
        Node newNode = new Node(value, null);

        if (head == null)
        {
            head = newNode;
        } else
        {
            if (currentNode.Next != null)
            {
                while (currentNode.Next != null)
                {
                    currentNode = currentNode.Next;
                }
            }
            currentNode.Next = newNode;
        }
        nodes++;
    }

    // Insert at position
    public void insertMiddle(int value) {
        if (nodes == 0)
        {
            insert(value);
        } else
        {
            int mid = Math.floorDiv(nodes, 2);
            Node currentNode = head;
            System.out.println(mid);
            for (int i = 0; i < mid; i++)
            {
                currentNode = currentNode.Next;
            }
            currentNode.Next = new Node(value, currentNode.Next);
        }
        nodes++;
    }

    // Delete at end
    public void deleteLast() {
        if (head.Next == null)
        {
            head = null;
        } else
        {
            Node currentNode = head;
            while (currentNode.Next.Next != null)
            {
                currentNode = currentNode.Next;
            }
            currentNode.Next = null;
            System.out.println(currentNode.value);
        }
        nodes--;
    }

    // Delete at beginning
    public void deleteFirst() {
        if (head.Next == null)
        {
            head = null;
        } else
        {
            head = head.Next;
        }
        nodes--;
    }

    // Search
    public boolean search(int value) {
        Node currentNode = head;
        while (currentNode.Next != null)
        {
            if (currentNode.value == value)
            {
                return true;
            }
            currentNode = currentNode.Next;
        }
        return currentNode.value == value;
    }

    // Sort
    public void sort() {
        Node currentNode = head;
        Node index;
        if (head != null)
        {
            while (currentNode != null)
            {
                index = currentNode.Next;
                while (index != null)
                {
                    if (currentNode.value > index.value)
                    {
                        int temp = currentNode.value;
                        currentNode.value = index.value;
                        index.value = temp;
                    }
                    index = index.Next;
                }
                currentNode = currentNode.Next;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringRep = new StringBuilder();

        Node temp = head;

        while (temp.Next != null) {
            stringRep.append(temp.value).append(" -> ");
            temp = temp.getNext();
        }

        stringRep.append(temp.value);
        if (temp.getNext() == null) {
            stringRep.append(" -> null");
        }

        return stringRep.toString();
    }
}
