public class Main {
    public static void main(String[] args) {
        String message = "The weather is nice today.";
        String newMessage = getCity();
        System.out.println(newMessage);
        int additionResult = addition(5, 7);
        System.out.println("The result of the addition is " + additionResult);
    }

    public static void add() {
        System.out.println("Added.");
    }

    public static void update() {
        System.out.println("Updated.");
    }

    public static void remove() {
        System.out.println("Removed.");
    }

    public static int addition(int number, int number2) {
        return number + number2;
    }

    public static String getCity() {
        return "Ankara";
    }
}