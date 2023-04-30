class SinglyLinkedList{
    private static ListNode head;
    private static class ListNode{
        private int data;
        ListNode  next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static void printList(){
        //As head is global in this case we can directly refer to head
        ListNode current = head;
        //keep moving the current ptr till its null
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public static void countNodes(){
        ListNode c = head;
        //initially count is zero
        int count = 0;
        while (c != null){
            count++;
            c = c.next;
        }
        System.out.println("\nThe list has " + count + " nodes.");
    }
    public static ListNode insertNodeAt(int position,int data){
        ListNode newNode = new ListNode(data);
        //just in case the list is empty no need to knacker memory return null
        if(head == null || head.next == null){
            return null;
        }
        ListNode current = head;
        //if position is equal to 1 it means we have to change head so
        if(position != 1){
            ListNode temp = null;
            int count = 0;
            while (current != null && count != position-1){
                //if the position is the last node or have to insert at the end of list
                if(current.next == null){
                    break;
                }
                current = current.next;
                temp = current.next;
                count ++;
            }
            current.next = newNode;
            newNode.next = temp;
            return head;
        }
        newNode.next = current;
        head = newNode;
        return head;
    }



    public static void main(String[] args) {
        //connecting all nodes  55 --> 77 -->99 --> null
        head = new ListNode(55);
        head.next = new ListNode(77);
        head.next.next = new ListNode(99);
        //Print the list
        printList();
        countNodes();
        //it handles all the cases of insert at start,end or at any desired position
        insertNodeAt(1,100);
        insertNodeAt(4,1777);
        insertNodeAt(5,10000);
        printList();
        countNodes();

    }
}