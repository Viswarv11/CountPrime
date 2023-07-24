import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number=scanner.nextInt();
        int count=0;
        boolean flag=false;
        if(number<2){
            System.out.println("0");
            return ;
        }
        for (int i = 2; i <number; i++) {
            flag=true;
            for (int j = 2; j*j<= i; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count=i;
                System.out.print(count+" ");
            }
        }
    }
}
