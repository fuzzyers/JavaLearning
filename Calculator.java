import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exquationtypeInput;
        int value1;
        int value2;
        int result;

        System.out.println("Press 1 for addition");
        exquationtypeInput = sc.nextInt();


        System.out.println("Enter Value 1");
        value1 = sc.nextInt();


        System.out.println("Enter Value 2");
        value2 = sc.nextInt();
        
        if (exquationtypeInput == 1){            
            result = addition(value1, value2);

            System.out.println(result);
        }
    }

    static int addition(int x, int y){
        return x + y;
    }
}