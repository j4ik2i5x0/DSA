package LinkedList;


class Node{  // Node creation
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

class LL{
    Node head;
    Node tail;

    public void insert(int data){   //insert data
        Node n = new Node(data);
        
        if(head == null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n; 
        }
    }

    public void insertAtBeg(int data){ //insert data at the beginning
        Node n = new Node(data);
        
        if(head == null){
            head = n;
            tail = n;
        } 
        else{
            n.next = head;
            head = n;
        }
    }

    public void insertAtPos(int pos, int data){ //insert data at a specific position
        Node n = new Node(data);
        Node temp = head;
        if(head == null){
            head = n;
            tail = n;
        } 
        else{
            for(int i = 0; i < pos - 1; i++){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }

    public void display(){         //display data
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}

public class SinglyLL {
        public static void main(String[] args) { //main method
        LL list = new LL();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insertAtBeg(2);
        list.insertAtBeg(1);
        list.insertAtPos(1,25);
        list.display();
        
    }
}
