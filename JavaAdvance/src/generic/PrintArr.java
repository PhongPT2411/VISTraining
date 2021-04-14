package generic;

public class PrintArr {
    public static <E> void print(E[] element) {
        for (E a : element) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J', 'A', 'V', 'A'};
        print(intArray);
        print(charArray);
    }
}
