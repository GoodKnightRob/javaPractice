import java.util.Scanner;
public class staircase{
	public static void main(String [] args){
		String c;
		do{
	double [] id;
	Scanner cin = new Scanner(System.in);
	System.out.println("Enter the number of steps: ");
	int n=cin.nextInt();
	id=new double[n+1];
	int total=fib(n,id);
	System.out.println("for a staircase with "+n+"Steps, the total number of ways to go up is "+total);
	System.out.println("Try again?");
	c=cin.next();
}while (c.equalsIgnoreCase("yes"));
}
public static int fib(int n,double id []){
	int temp=0;
if (n==0){ 
	id[0]=0;
 	temp=id[0];
 }
if(id[n]==0){
if (n==1){
 id[1]=1;
  temp =id[1];}
if (n==2){
 id[2]=2; 
 temp=id[2];
}
if (n==3) {
	id[3]=4;
	temp= id[3];}
if (n>=4){ temp= fib(n-1, id)+fib(n-2, id)+fib(n-3, id);
id[n]=temp;}
}
else temp=id[n];
return temp;
}
}