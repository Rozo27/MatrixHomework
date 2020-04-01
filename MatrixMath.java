public class MatrixMath {
    public static double[][] sum(double[][] a,double[][] b){
        int i,j;
        if(a.length!=b.length || a[0].length!=b[0].length)
            return new double[0][0];
        double[][] c=new double[a.length][a[0].length];
        for(i=0;i<a.length;i++)
            for(j=0;j<a[i].length;j++)
                c[i][j]=a[i][j]+b[i][j];
        return c;
    }
    public static double[][] dif(double[][] a,double[][] b){
        int i,j;
        if(a.length!=b.length || a[0].length!=b[0].length)
            return new double[0][0];
        double[][] c=new double[a.length][a[0].length];
        for(i=0;i<a.length;i++)
            for(j=0;j<a[i].length;j++)
                c[i][j]=a[i][j]-b[i][j];
        return c;
    }
    public static double[][] multiplyWithScalar(double[][] a,double b){
        int i,j;
        double[][] c=new double[a.length][a[0].length];
        for(i=0;i<a.length;i++)
            for(j=0;j<a[i].length;j++)
                c[i][j]=b*a[i][j];
        return c;
    }
    public static double[][] multiplyBetweenMatrix(double[][] a, double[][] b){
        int i,j,k;
        if(a[0].length!=b.length)
            return new double[0][0];
        double[][] c=new double[a.length][b[0].length];
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                for(k=0;k<b.length;k++)
                    c[i][j]+=a[i][k]*b[k][j];
            }
        }
        return c;
    }

}
