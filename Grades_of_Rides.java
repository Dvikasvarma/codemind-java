import java.util.Scanner;
public  class main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int g ;
        int hurl = read.nextInt();
        int spin = read.nextInt();
        int speed = read.nextInt();
    if(hurl>50 && spin>60 && speed>100){
    g=10;}
    else if(hurl>50 && spin>60){
    g=9;}
    else if(spin>50 && speed>100){
    g=8;}
    else if(hurl>50 && speed>100){
    g=7;}
    else if(hurl>50 || spin>60 || speed>100){
    g=6;}
    else{
    g=5;}
    System.out.printf("%d",g);
}
}