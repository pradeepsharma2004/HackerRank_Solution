/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) 
{
    if(head==null)
    {
        return null;
    }
    else if(head!=null &&position==0)
    {
        head=head.next;
        return head;
    }
    else
    {
        Node n=head;
        Node n1;
        for(int i=0;i<position-1;i++)
        {
            n=n.next;
        }
        n1=n.next;
        n.next=n1.next;
        return head;
        
    }
}

