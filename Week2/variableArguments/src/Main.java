public class Main {
    public static void main(String[] args) {
        System.out.println("Result: " + addition(1,2,3,4,5,6,7));
    }

    public static int addition(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }

        return result;
    }
}