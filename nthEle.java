

public class nthEle {

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

    public void nthElement(){
       
        Node current=head;
        while(current.next!=null){
            
            current=current.next;
        }
        System.out.println(current.data);


    }


      public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+ "->");
            current=current.next;
        }
        System.out.println(" null");
    }


    public static void main(String[] args){
        nthEle ne=new nthEle();
        ne.insertAtbeg(5);
        ne.insertAtbeg(10);
        ne.insertAtbeg(3);
        ne.insertAtbeg(2);
        ne.nthElement();


    }
    
}
