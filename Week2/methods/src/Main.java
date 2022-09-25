public class Main {
    public static void main(String[] args) {
        findTheNumber();
    }

    public static void findTheNumber() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 0};

        int numberToFind = 3;
        boolean isNumberExist = false;

        for (int number : numbers) {
            if (number == numberToFind) {
                isNumberExist = true;
                break;
            }
        }

        if (isNumberExist) {
            staticMessageMethod("The number is in this list: " + numberToFind);
        } else {
            System.out.println("The number is not in this list.");
        }
    }

    public static void staticMessageMethod(String message){
        System.out.println(message);
    }
}