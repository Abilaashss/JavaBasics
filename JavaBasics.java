import java.util.*;
public class JavaBasics {
    public static int CalculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static float sum(float a, float b) {
        float sum = a + b;
        return sum;
    }
    public static int Avg(int a,int b,int c){
        int sum=(a+b+c)/3;
        return sum;
    }
    public static void BinToInt(int BinNum){
        int Num=BinNum;
        int pow=0;
        int DecNum=0;
        while(BinNum>0){
            int lastdigit=BinNum%10;
            DecNum=DecNum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            BinNum=BinNum/10;

        }
        System.out.println("The decimal value of"+Num+"is :"+DecNum);
    }
    public static boolean isEven(int a){
        boolean Val;
        if(a%2==0){
            Val=true;

        }
        else{
            Val=false;
        }
        return Val;
    }
    public static void Palindrome(int b){
        int palindrome=b;
        int reverse=0;
        while(palindrome!=0){
            int remainder=palindrome%10;
            reverse=(reverse*10)+remainder;
            palindrome=palindrome/10;
        }
        if(b==reverse){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
    public static void sum(int a){
        int sumofdigits=0;

        while(a>0){
            int lastdigit=a%10;
        sumofdigits=sumofdigits+lastdigit;
        a=a/10;}

        System.out.println("The value of sum of the digits is "+sumofdigits);}

    public static void hollow_rectangle(int row,int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1||j==1||j==column||i==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



    public static void main(String args[]) {

        //System.out.println("Abilaash is a good boy");
        //System.out.println("The number you entered is "+isEven(10));
        //Palindrome(101);
        //int a=Math.max(13,12);
        //System.out.println(a);
        //System.out.println("the average of 3 number is"+Avg(10,20,30));
        //sum(1988);
        hollow_rectangle(4,5);
    }}

        
        

        
        



    
