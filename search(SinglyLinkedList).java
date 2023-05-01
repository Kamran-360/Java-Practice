                                                                      //Search in Singly Linked List
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
    public static void searchElement(int element) {
        ListNode current = head;
        int index = 0;
        while (current != null){
            index++;
            if(current.data == element){
                System.out.println("\n \""+element +"\" found at index "+ index+".");
                return;
            }
            current  = current.next;
        }
        System.out.println("\nThe list doesn't have any element "+element);
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
        //search the element
        searchElement(2019);
        

    }
}
