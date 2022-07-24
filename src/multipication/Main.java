package multipication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num =0;
        int[] output=new int [11];

        System.out.println("Please Enter your no.");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i=0; i<=10; i++){
            output [i] = num * i;
            System.out.println(+num+"*"+i+" = "+output[i]);
        }


    }


}
