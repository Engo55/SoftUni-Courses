package JavaTrainingMoreExercise.WhileLoop;

public class NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {

        int num = 1;

        while (num <= 100) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}