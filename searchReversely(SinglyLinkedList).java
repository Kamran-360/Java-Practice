//search the element at specific index from the end of the list
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
    public static void searchReversly(int p){
        ListNode fastptr = head;
        ListNode slowptr = head;
        int count = 0;
        while (count!=p){
            fastptr = fastptr.next;
            count++;
        }
        while (fastptr!=null){
            slowptr = slowptr.next;
            fastptr =  fastptr.next;
        }
        System.out.println("\nThe element is "+slowptr.data+" at index "+p+" from end of the list.");
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

        //Print the list
        printList();
        //search the element at index 2 from end of list
        searchReversly(1);

    }
}
