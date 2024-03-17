public class ListTest2 {
    public static void main(String[] args) {
        ListStructure list = new ListStructure();

        list.addTail(4);
        list.addTail(3);
        list.addTail(7);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);

        list.displayElements();

        list.removeAll();

        list.displayElements();
    }
}
