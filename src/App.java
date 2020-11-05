public class App {
    public static void main(String[] args) {
        IntList myList = new SortedIntList(5);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        myList.add(25);
        System.out.println(myList);
    }
}
