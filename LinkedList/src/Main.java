public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList list = new LinkedList(1);
        list.insert(3);
        list.insert(4);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.deleteLast();
        list.insert(1);
        list.insert(-1);
        list.insert(-2);
        System.out.println(list);
        System.out.println(list.search(2));
        System.out.println(list.search(10));
        list.sort();
        System.out.println(list);
    }
}