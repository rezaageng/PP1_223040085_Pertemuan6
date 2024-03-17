public class ListTest1 {
    public static void main(String[] args) {
        ListStructure list = new ListStructure();

        list.addTail(7);
        list.addTail(6);
        list.addTail(4);
        list.addTail(2);
        list.addTail(3);

        list.displayElements();

        System.out.println("\n" + list.size());
    }
}
