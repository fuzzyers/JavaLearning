import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exquationtypeInput;
        int value1;
        int value2;
        int result = 0;
        boolean end = true;

        while (end) {
            
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for devision");
            System.out.println("Press 5 to exit");
            
            exquationtypeInput = sc.nextInt();
            
            System.out.println("Enter Value 1");
            value1 = sc.nextInt();
            
            System.out.println("Enter Value 2");
            value2 = sc.nextInt();
            
            if (exquationtypeInput == 1){            
                result = addition(value1, value2);
            } else if (exquationtypeInput == 2) {
                result = subtraction(value1, value2);
            } else if (exquationtypeInput == 3) {
                result = multiplication(value1, value2);
            } else if (exquationtypeInput == 4) {
                result = devision(value1, value2);
            } 
            System.out.println(result);

            if (exquationtypeInput != 1 || exquationtypeInput != 2 || exquationtypeInput != 3 || exquationtypeInput != 4){
                System.out.println("Exiting");
                end = false;
            }
        }

    }

    static int addition(int x, int y){
        return x + y;
    }

    static int subtraction(int x, int y){
        return x - y;
    }

    static int multiplication(int x, int y){
        return x * y;
    }

    static int devision(int x, int y){
        return x / y;
    }
}