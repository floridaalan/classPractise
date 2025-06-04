

public class kthElem {
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

    //delete kth element
    
    public void deleteKthElement(int k) {
    if (head==null || k<=0) {
        return;
    }
    if (k==1) {
        head=head.next;
        return;
    }
    Node current=head;
    for (int i=1; current!=null && i<k-1; i++) {
        current = current.next;
    }
    if (current==null || current.next==null) {
        return;
    }
    current.next=current.next.next;
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
        kthElem ke=new kthElem();
        ke.deleteKthElement(2);
        ke.insertAtbeg(3);
        ke.insertAtbeg(5);
        ke.insertAtbeg(9);
        ke.insertAtbeg(1);
        ke.insertAtbeg(45);
        ke.insertAtbeg(23);
        ke.insertAtbeg(34);
        ke.display();
        ke.deleteKthElement(2);

      
    }
    
}
