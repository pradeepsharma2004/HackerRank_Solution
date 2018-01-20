/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) 
{
    Node n1=headA,n2=headB;
    Node sort,new_head;
    sort=null;
    if(n1==null)
    {
        return n2;
    }
    else if(n2==null)
    {
        return n1;
    }
    else
    {
        if(n1.data<=n2.data)
        {
            sort=n1;
            n1=sort.next;
        }
        else
        {
            sort=n2;
            n2=sort.next;
        }
    }
    new_head=sort;
    while(n1!=null && n2!=null)
    {
        if(n1.data<=n2.data)
        {
            sort.next=n1;
            sort=n1;
            n1=sort.next;
        }
        else
        {
            sort.next=n2;
            sort=n2;
            n2=sort.next;
        }
    }
    if(n1==null)
    {
        sort.next=n2;
    }
    if(n2==null)
    {
        sort.next=n1;
    }
    return new_head;
}
