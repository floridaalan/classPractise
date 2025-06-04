import java.util.ArrayList;


public class revLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    //head
    private Node head=null;
    //insetAtbeg()
    public void insertAtbeg(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }
    //reverse
    public void reverse(){   // 5 10 4 15
        ArrayList<Integer> dataList=new ArrayList<>();
        Node current=head;
        while(current!=null){
            dataList.add(current.data);
            current=current.next;

        }

        //rewrite the data in reversed order
        current=head;
        for(int i=dataList.size()-1;i>=0;i--){
            current.data=dataList.get(i);
            current=current.next;
        }

    }
    //display
    public void display(){ // 15 4 10 5
        Node current=head;
        while(current!=null){
            System.out.print(current.data+ "->");
            current=current.next;
        }
        System.out.println(" null");
    }

    public static void main(String[] args){
        revLinkedList rv=new revLinkedList();
        rv.insertAtbeg(5);
        rv.insertAtbeg(10);
        rv.insertAtbeg(4);
        rv.insertAtbeg(15);
        rv.display();
        System.out.println();
        rv.reverse();
        rv.display();

    }
}
