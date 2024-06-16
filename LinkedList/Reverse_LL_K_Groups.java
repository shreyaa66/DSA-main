public class Reverse_LL_K_Groups {
    public static Node reverse(Node head, int k)
    {
        //Base Case
        if(head==null){
            return null;
        }
        
        //Reverse k Nodes
        Node next = null;
        Node curr = head;
        Node prev = null;
        int count = 0;
        
        while(curr!=null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
            count++;
        }
        
        //Recursive (Call Stack)
        if(next!=null){
            head.next = reverse(next,k);
        }
        
        
        //Return Head of the new LinkedList
        return prev;
    }
}
