public class MethodsExercises {
    public static int addNumbers(int a, int b) {
        // return value
        return a + b;
    }

    public static int multiplyNumbers(int a, int b){
        return a * b;
    }

    public static int subtractNumbers(int a, int b){
        return a - b;
    }

    public static int divideNumbers(int a, int b){
        return a / b;
    }



    public static void main(String[] args){
        int num1 = 21;
        int num2 = 44;

        System.out.println(addNumbers(num1, num2));

        int num3 = 5;
        int num4 = 5;

        System.out.println(multiplyNumbers(num3,num4));

        int num5 = 100;
        int num6 = 33;

        System.out.println(subtractNumbers(num5, num6));

        System.out.println(divideNumbers(num5, num4));









    }
}