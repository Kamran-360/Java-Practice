                                                                    //Finding mid of linked List
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
    //print the list
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
    
    //find the middle node
    public static void findtheMiddleNode(){
        //useful check
        if(head == null){
            System.out.println("The list is empty.");
        } else if (head.next == null) {
            System.out.println(head.data);
        }
        ListNode slowptr = head;
        ListNode fastptr = head;
        while (fastptr != null && fastptr.next !=null ){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        System.out.println("\nThe middle node is "+ slowptr.data+".");

    }

    //driver
    public static void main(String[] args) {
        //connecting all nodes like : 2019 --> 2020 --> 2021 --> 2022 --> 2023 --> null
        head = new ListNode(2019);
        head.next = new ListNode(2020);
        head.next.next = new ListNode(2021);
        head.next.next.next = new ListNode(2022);
        head.next.next.next.next = new ListNode(2023);
        head.next.next.next.next.next = new ListNode(2024);

        //find mid
        findtheMiddleNode();

    }
}
// To do:
// swap the position of left and right statements of && in while condition
// it would give an error
// Because when fastptr becomes null then accessing fastptr.null is illogical
// now why it would not give error without swapping
// the answer is "short circuit evaluation" it would just check the left condition if it is
// false no need to check further because checking further conditions would be meaningless then.
