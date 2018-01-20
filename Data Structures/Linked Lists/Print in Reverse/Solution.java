/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) 
{
    Node n=head;
    if(head!=null)
    {
        ReversePrint(n.next);
        System.out.println(n.data);
        
    }
    
  

}
