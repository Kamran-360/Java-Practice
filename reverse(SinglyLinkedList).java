                                                             //Reverse the list
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
    public static ListNode reverseTheList(){
        //useful check
        if(head == null){
            return null;
        } else if (head.next == null) {
            return head;
        }
        //basically we are reversing the links that's it moving current and breaking link of first node in each newly created linklist
        //using next pointer and linking them to the prev and keep doing this untill current reaches to null;
        //for more explaination go to note 1 at the last of program
        ListNode current = head;
        ListNode prev = null;
        ListNode temp;
       while (current != null ){
           temp = current.next;
           current.next = prev;
           prev = current;
           current = temp;
       }
        head = prev;
        return head;
    }

    //driver 
    public static void main(String[] args) {
        //connecting all nodes like : 2019 --> 2020 --> 2021 --> 2022 --> 2023 --> null
        head = new ListNode(2019);
        head.next = new ListNode(2020);
        head.next.next = new ListNode(2021);
        head.next.next.next = new ListNode(2022);
        head.next.next.next.next = new ListNode(2023);

        //Print the list
        printList();
        //search the element
        reverseTheList();
        System.out.println("\nThe list has been reversed :");
        printList();

    }
}

//Still Stuck No worries (READ THIS)
//Note 1 : consider a linked-list 10 --> 3 --> null now reverse it using reverseTheList() func
// * At 1st iteration next pointer will be containing 3 --> null and current pointer will be containing 10 --> 3 --> null
// as previous pointer default value is null so current.next = prev ; will be null means 10 --> null and as
// we are storing it back to the previous pointer again so prev will be 10 --> null,and then we are making
// current = next so now current will be now 3 --> null
// * At 2nd iteration next will be null and current will be 3 --> null and previous will be 3 --> 10 --> null
// * As current reaches to null finally prev containing the reverse list 3 --> 10 --> null
