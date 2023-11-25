import java.util.Scanner;
class  Pascals{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter a row:");
int row=sc.nextInt();
System.out.print("Enter a column: ");
int column=sc.nextInt(); 
int arr[][]=new int[row][column];
System.out.println();
System.out.println("print using for loop");
System.out.println();
for(int i=0;i<row;i++){
for(int j=0;j<=i;j++){
if(j==0||j==i){
arr[i][j]=1;
}
else{
arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
}

System.out.print(arr[i][j]+"  ");
}
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<=i;j++){
if(i==0 && j==0){
System.out.print("["+arr[i][j]+"]");
//System.out.print("("+i+","+j+")");
}
else if(j==0){
System.out.print("["+arr[i][j]+",");
//System.out.print("("+i+","+j+")");
}
else if(i==j){
//System.out.print(",");

System.out.print(arr[i][j]+"]");
//System.out.print("("+i+","+j+")");
}
else{
//System.out.print(",");
System.out.print(arr[i][j]+",");
//System.out.print("("+i+","+j+")");
}
}
}
}
}