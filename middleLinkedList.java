public class middleLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
      private Node head=null;
    //insetAtbeg()
    public void insertAtbeg(int data){// 5 10 4 15
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }

     public void display(){// 5 10 4 15
        Node current=head;
        while(current!=null){
            System.out.print(current.data+ "->");
            current=current.next;
        }
        System.out.println(" null");
    }
    //find middle element
    public void middleEle(){ // 10 or 4
        Node p1=head;
        Node p2=head.next.next;

        while(p2!=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }

        System.out.println("Middle element is: " + p1.data);


    }


    public static void main(String[] args){
        middleLinkedList mi=new middleLinkedList();
        mi.insertAtbeg(5);
        mi.insertAtbeg(10);
        mi.insertAtbeg(4);
        mi.insertAtbeg(15);
        mi.middleEle();

    }
    
}
