//Detecting loop in the list with Floyd's Detection Algorithm
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
    public static boolean detectLoop(){
        //Floyd's Cycle Detection Algorithm
     ListNode slowptr = head;
     ListNode fastptr = head;
     while (slowptr!=null && fastptr!=null){
         slowptr = slowptr.next;
         fastptr = fastptr.next.next;
         if(slowptr == fastptr){
             return true;
         }
     }
     return false;
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
        //creating a loop : 2019 --> 2020 --> 2021 --> 2022 --> 2023 --> 2024 --> 2022
        head.next.next.next.next.next.next = head.next.next.next;
        //check for duplicates and remove them to clean the redundant data
        System.out.println(detectLoop());
    }
}
