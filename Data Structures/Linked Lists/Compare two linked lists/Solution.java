/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) 
{
    Node n1=headA;
    Node n2=headB;
        while(n1!=null &&n2!=null)
        {
            if(n1.data!=n2.data)
            {
               return 0;
            }
             n1=n1.next;
             n2=n2.next;
        }
    if(n1==null &&n2==null)
    {
        return 1;  
    } 
    return 0;
}
