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


    public static void main(String[] args) {
        //connecting all nodes  55 --> 77 -->99 --> null
        head = new ListNode(55);
        head.next = new ListNode(77);
        head.next.next = new ListNode(99);
        //Print the list
        printList();
        countNodes();
    }
}
