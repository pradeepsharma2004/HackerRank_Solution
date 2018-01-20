/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) 
{
    Node n1,n2;
    n1=head;
    n2=n1.next;
    if(head==null)
    {
        return head;
    }
    else
    {
        while(n2!=null)
        {
            if(n1.data==n2.data)
            {
                n2=n2.next;
                n1.next=n2;
            }
            else
            {
                n2=n2.next;
                n1=n1.next;
            }
            
        }
        return head;
    }
    

}
