/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) 
{
    Node node=new Node();
    node.data=data;
    node.next=null;
    if(head==null)
    {
        return node;       
    }
    else if(head!=null && position==0)
    {
        node.next=head;
        head=node; 
        return head;
    }
    else
    {
        Node n=head;
        for(int i=0;i<position-1;i++)
        {
            n=n.next;
        }
        Node n1=n.next;
        n.next=node;
        node.next=n1;
        return head;     
    }
   
}
