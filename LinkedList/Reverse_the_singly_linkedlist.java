class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
    }
}

class Reverse_the_singly_linkedlist
{
    //Iterative Approach
    Node reverseList(Node head)
    {
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    //Recursive Approach
    Node reverse(Node head){
        if(head==null || head.next==null ){
            return head;
        }
        //Call Stack Formation and Recursive Faith
        Node newHead = reverseList(head.next);
        
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        
        return newHead;
    }    
}
