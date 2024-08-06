import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        if(a>b)
        System.out.printf("%d",a); 
        else
        System.out.printf("%d",b);
        
    }
}