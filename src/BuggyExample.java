public class BuggyExample {

    public static int divide(int a, int b) {
        if (b == 0) {
            return a / b;
             //Should throw an exception, not return -1
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println("Result: " + result); //This will crash due to division by zero

    }
}
