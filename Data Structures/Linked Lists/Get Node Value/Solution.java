/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) 
{
   /*
   //Solution:1
   int size=0,s1;
    Node n2=head;
    if(head!=null)
    {
        Node n1=head;
        while(n1.next!=null)
        {
            size++;
            n1=n1.next;
        }
    }
    else
    {
        size=0;
    }
    s1=size-n;
    for(int i=0;i<s1;i++)
    {
        n2=n2.next;
    }
    return n2.data;
    */
    
    //Solution:2
    Node run=head,curr_node=head;
    for(int i=0;i<n;i++)
    {
        run=run.next;
    }
    while(run.next!=null)
    {
        run=run.next;
        curr_node=curr_node.next;
    }
    return curr_node.data;
    
    
}
