package InterviewQ;

public class ListNodeForAdd {
    int val;
    ListNodeForAdd next;
    ListNodeForAdd() {}
    ListNodeForAdd(int val) { this.val = val; }
    ListNodeForAdd(int val, ListNodeForAdd next) { this.val = val; this.next = next; }

//    public static void main(String[] args) {
//        ListNodeForAdd next1 = new ListNodeForAdd(10);
//        ListNodeForAdd next2 = new ListNodeForAdd(20);
//        ListNodeForAdd next3 = new ListNodeForAdd(30);
//        next1.next = next2;
//        next2.next = next3;
//
//        ListNodeForAdd current = next1;
//        while(current != null){
//            System.out.println(current.val);
//            current = current.next;
//        }
//    }
}

