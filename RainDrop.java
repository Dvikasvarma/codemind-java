import java.util.Scanner;
public class main {
public static void main(String[] args){
    Scanner read = new Scanner(System.in);
		int n=read.nextInt();
    if(n%3==0 && n%5!=0 && n%7!=0)
    System.out.printf("Pling");
    else if(n%3!=0 && n%5==0 && n%7!=0)
    System.out.printf("Plang");
    else if(n%3!=0 && n%5!=0 && n%7==0)
    System.out.printf("Plong");
    else if(n%3==0 && n%5==0 && n%7!=0)
    System.out.printf("PlingPlang");
    else if(n%3==0 && n%5!=0 && n%7==0)
    System.out.printf("PlingPlong");
    else if(n%3!=0 && n%5==0 && n%7==0)
    System.out.printf("PlangPlong");
    else 
    System.out.printf("%d",n);
}
}