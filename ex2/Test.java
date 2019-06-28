package ex2;

public class Test {
    public static void main(String[] args) {
        System.out.println("--------------TEST-------");
        MyLinkList ll = new MyLinkList(10);
        ll.addfirst(11);
        ll.addfirst(12);
        ll.addfirst(13);

        ll.add(3,9);
        ll.add(4,10);
        ll.printList();

    }
}
