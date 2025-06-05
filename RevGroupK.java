public class RevGroupK {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static Node reverse(Node head) {
        Node curr = head, prev = null, nextt = null;
        while (curr != null) {
            nextt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextt;
        }
        return prev;  
    }

    public static Node getk(Node head,int k){
        k-=1;
        Node temp=head;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;

    }

    public static void view(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        Node n1=new Node(2);
        head.next=n1;
        Node n2=new Node(3);
        n1.next=n2;
        Node n3=new Node(4);
        n2.next=n3;
        Node n4=new Node(5);
        n3.next=n4;
        Node n5=new Node(6);
        n4.next=n5;
        view(head);

        int k=2;

        Node temp=head,prev=null,nextnode;

        while(temp!=null){
            Node kth=getk(temp,k);

            if(kth==null){
                if(prev!=null){
                    prev.next=temp;
                    break;
                }
            }
            nextnode=kth.next;
            kth.next=null;
            kth=reverse(temp);
            
            if(temp==head){
                head=kth;
            }
            else{
                prev.next=kth;
            }
            prev=temp;
            temp=nextnode;
        }
        view(head);

       
    }
}
