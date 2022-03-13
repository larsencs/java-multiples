import java.util.Scanner;

public class multiples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int byTwo = 0, byThree = 0;
        System.out.println("Enter an integer: ");
        int num1 = scan.nextInt();
        
        byTwo = num1 % 2;
        byThree = num1 % 3;
        
        if (byTwo == 0 && byThree == 0){
            System.out.println("The number is a multiple of two and three!");
        }
        else if (byTwo == 0){
            System.out.println("The number is a multiple of two");
            
        }
        else if (byThree == 0){
            System.out.println("The number is a multiple of three");
        }
        if (!(byTwo == 0 || byThree == 0)){
            System.out.println("the number is not a multiple of two or three");

            
        }

        
    }
    
}
