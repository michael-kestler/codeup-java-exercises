public class MethodsExercises {
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    public static int multiplyNumbers(int a, int b){
        int product = a* b;
        return product;
    }


    public static void main(String[] args){
        int num1 = 21;
        int num2 = 44;

        System.out.println(addNumbers(num1, num2));

        int num3 = 5;
        int num4 = 5;

        System.out.println(multiplyNumbers(num3,num4));






    }
}