package If_elseCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1 , n2 ;
        int select ;

        Scanner input = new Scanner(System.in);

        System.out.print("First number : ");
        n1 = input.nextDouble();
        System.out.print("Second number : ");
        n2 = input.nextDouble();

        System.out.println("1-addition\n2-subtraction\n3-multiplication\n4-division");
        System.out.print("Select action : ");
        select = input.nextInt();

        if (select == 1){
            System.out.println("Conclusion :" + (n1+n2));
        } else if (select == 2) {
            System.out.println("Conclusion :" + (n1-n2));
        } else if (select == 3) {
            System.out.println("Conclusion :" + (n1*n2));
        } else if (select == 4) {
            if(n2 !=0 ){
                System.out.println("Conclusion :" + (n1/n2));
            }else {
                System.out.println("The second number cannot be zero!");
            }
        }else {
            System.out.println("You made the wrong choice");
        }
    }
}
