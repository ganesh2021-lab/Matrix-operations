import java.util.*;
public class matrixoperations{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char d;
do{

System.out.println(" Enter the number of rows");
int n=sc.nextInt();

System.out.println(" Enter number of columns");
int m=sc.nextInt();

int a[][]=new int[n][m];
int b[][]=new int[n][m];
int c[][]=new int[n][m];
int e[][]=new int[n][m];
int f[][]=new int[n][m];
int g[][]=new int[n][m];
int h[][]=new int[n][m];
int p[][]=new int[n][m];
int q[][]=new int[n][m];
int o[][]=new int[n][m];

System.out.println(" Enter the elements of your 1st matrix");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
a[i][j]=sc.nextInt();
System.out.print(a[i][j]+"\t ");
}
System.out.println();
}

System.out.println(" Enter the elements of your 2nd matrix");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
b[i][j]=sc.nextInt();
System.out.print(b[i][j]+"\t ");
}
System.out.println();
}

System.out.println(" The sum of two matrices");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
 c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+"\t ");
}
System.out.println();
}

System.out.println("The subtraction (matrix1-matrix2)");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
 e[i][j]=a[i][j]-b[i][j];
System.out.print(e[i][j]+"\t ");
}
System.out.println();
}

System.out.println("The subtraction (matrix2-matrix1)");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
 f[i][j]=b[i][j]-a[i][j];
System.out.print(c[i][j]+"\t ");
}
System.out.println();
}

System.out.println("the division of matrix1/matrix2");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
 g[i][j]=(a[i][j])/(b[i][j]);
System.out.print(g[i][j]+"\t ");
}
System.out.println();
}

System.out.println("the division of matrix2/matrix1");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
 o[i][j]=(b[i][j])/(a[i][j]);
System.out.print(o[i][j]+"\t ");
}
System.out.println();
}

System.out.println("The multiplication of two matrices");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
 h[i][j]=b[i][j]*a[i][j];
System.out.print(h[i][j]+"\t ");
}
System.out.println();
}

System.out.println("remainders when matrix1%matrix2");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
 p[i][j]=b[i][j]%a[i][j];
System.out.print(p[i][j]+"\t ");
}
System.out.println();
}

System.out.println("remainders when matrix2%matrix1");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
 q[i][j]=a[i][j]%b[i][j];
System.out.print(q[i][j]+"\t ");
}
System.out.println();
}

System.out.println("do you want to retry? click y for YES, n for NO: ");
d=sc.next().charAt(0);
}while(d=='y');
System.out.println("Thank you please visit again");
}
}


