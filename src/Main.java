public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<Integer>(Integer.class, 3);
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.removeAt(0);
        System.out.println(items.indexOf(3));
        System.out.println(items.contains(0));

    }
}
