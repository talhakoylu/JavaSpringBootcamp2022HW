public class MathOperations {
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int addition(int... numbers){
        int result = 0;
        for (int number: numbers) {
            result += number;
        }

        return result;
    }
}
