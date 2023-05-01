                                 //deletion of nodes in Singly Linked List
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

    public static ListNode delete(int position){
        //check if the list is empty
        if(head == null || head.next == null){
            System.out.println("The linkedList is empty yet.");
        }
        ListNode current = head;
        if(position != 1){
            int count = 1;
            ListNode temp = null;
            ListNode temp2 = null;
            while (current != null && count < position){
                if(current.next.next == null){
                    current.next = null;
                    return head;
                }
                temp = current.next.next;
                temp2 = current;
                current = current.next;
                count++;
            }
            System.out.println(current.data);
            current = temp2;
            current.next = temp;
            return head;
        }
        ListNode temp = current.next;
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        //connecting all nodes like : 2019 --> 2020 --> 2021 --> 2022 --> 2023 --> null
        head = new ListNode(2019);
        head.next = new ListNode(2020);
        head.next.next = new ListNode(2021);
        head.next.next.next = new ListNode(2022);
        head.next.next.next.next = new ListNode(2023);

        //Print the list
        printList();
        countNodes();
        //it handles all the cases of delete at start,end or at any desired position
        //now delete the last node which is 5th
        delete(5);
        printList(); //list after deletion
        countNodes();
        //delete first node
        delete(1);
        printList(); //list after deletion
        countNodes();
        //delete the 2 node
        delete(2);
        printList(); //list after deletion
        countNodes();
     
    }
}
