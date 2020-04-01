import java.util.Scanner;

public class MatrixOperations {

    public static void afisare(double a[][]){
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
    int n, m,x,i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduceti n si m pentru a:");
    n=sc.nextInt();
    m=sc.nextInt();
    double[][] a=new double[n][m];
    System.out.println("Introduceti elementele a:");
    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
            a[i][j]=sc.nextInt();
    System.out.println("Introduceti n si m pentru b:");
    n=sc.nextInt();
    m=sc.nextInt();
    double[][] b=new double[n][m];
    System.out.println("Introduceti elementele b:");
            for(i=0;i<n;i++)
                for(j=0;j<m;j++)
                    b[i][j]=sc.nextInt();
    double[][] c;
    c=MatrixMath.sum(a,b);
    System.out.println("suma:");
    afisare(c);
    c=MatrixMath.dif(a,b);
    System.out.println("diferenta:");
    afisare(c);
    c=MatrixMath.multiplyBetweenMatrix(a,b);
    System.out.println("inmultire:");
    afisare(c);
    System.out.println("Introduceti scalarul:");
    x=sc.nextInt();
    c=MatrixMath.multiplyWithScalar(a,x);
    System.out.println("inmultirea cu scalar:");
    afisare(c);

    sc.close();
    }

}
