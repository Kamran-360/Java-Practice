//remove duplicates from the list
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
    public static void removeDuplicates(){
        ListNode current = head;
        while (current!=null ){
           ListNode runner = current;
           while (runner.next != null){
               if(runner.next.data ==current.data){runner.next=runner.next.next;}
               else {runner = runner.next;}
           }
            current = current.next;
        }
    }

    //driver
    public static void main(String[] args) {
        //connecting all nodes like : 2019 --> 2020 --> 2021 --> 2022 --> 2023 --> null
        head = new ListNode(2019);
        head.next = new ListNode(2020);
        head.next.next = new ListNode(2023);
        head.next.next.next = new ListNode(2023);
        head.next.next.next.next = new ListNode(2023);
        head.next.next.next.next.next = new ListNode(2024);

        //Print the list before running removeDuplicates()
        printList();
        //check for duplicates and remove them to clean the redundant data
        removeDuplicates();
        //Print the list after running removeDuplicates()
        System.out.println();
        printList();

    }
}
