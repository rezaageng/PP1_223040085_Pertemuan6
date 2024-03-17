public class ListTest {
    public static void main(String[] args) {
        ListStructure list = new ListStructure();

        list.addTail(5);
        list.addTail(4);
        list.addTail(6);

        list.displayElements();

        System.out.println("\n" + list.find(6));
    }
}
