import java.util.ArrayList;

public class Matrix {
    private int matrixDimension;
    private double[][] a;
    private ArrayList<ArrayList<Integer>> b;

    public Matrix(int matrixDimension,String tip) {
        this.matrixDimension = matrixDimension;
        if(tip.equals("Array"))
        {
            this.a=new double[matrixDimension][matrixDimension];
        }
        else {
            this.b=new ArrayList<ArrayList<Integer>>(this.matrixDimension);
        }
    }

    public void updateArray(int mainDiagValue, int sndDiagValue, int centerValue, int leftValue, int upValue, int rightValue, int bottomValue){
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++)
                if(i==j && i!=this.matrixDimension/2)
                    a[i][j]=mainDiagValue;
                else if(i+j==this.matrixDimension-1 && i!=matrixDimension/2)
                    a[i][j]=sndDiagValue;
                    else if(this.matrixDimension%2!=0 && i==j && i==this.matrixDimension/2)
                        a[i][j]=centerValue;
                        else if(i>j && i+j<matrixDimension-1)
                            a[i][j]=leftValue;
                            else if(j>i && i+j<matrixDimension-1)
                                a[i][j]=upValue;
                                else if(j>i && i+j>matrixDimension-1)
                                    a[i][j]=rightValue;
                                    else a[i][j]=bottomValue;
        }
    }

    public void printArray(){
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
    private ArrayList<ArrayList<Integer>> setZeroToArrayList(){
        int i,j;
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<ArrayList<Integer>>(this.matrixDimension);
        for(i=0;i<this.matrixDimension;i++){
            ArrayList<Integer> row=new ArrayList<Integer>(this.matrixDimension);
            for(j=0;j<this.matrixDimension;j++)
                row.add(0);
            matrix.add(row);
        }

       return matrix;
    }
    public void updateArrayList(int mainDiagValue, int sndDiagValue, int centerValue, int leftValue, int upValue, int rightValue, int bottomValue){
        this.b=this.setZeroToArrayList();
        int i,j;
        for(i=0;i<b.size();i++){
            for(j=0;j<b.get(i).size();j++)
                if(i==j && i!=this.matrixDimension/2)
                    b.get(i).set(j,mainDiagValue);
                else if(i+j==this.matrixDimension-1 && i!=matrixDimension/2)
                    b.get(i).set(j,sndDiagValue);
                else if(this.matrixDimension%2!=0 && i==j && i==this.matrixDimension/2)
                    b.get(i).set(j,centerValue);
                else if(i>j && i+j<matrixDimension-1)
                    b.get(i).set(j,leftValue);
                else if(j>i && i+j<matrixDimension-1)
                    b.get(i).set(j,upValue);
                else if(j>i && i+j>matrixDimension-1)
                    b.get(i).set(j,rightValue);
                else b.get(i).set(j,bottomValue);
        }

    }
    public ArrayList<ArrayList<Integer>> getB(){
        return this.b;
    }
    public double[][] getA(){
        return this.a;
    }
    public void printArrayList(){
        int i,j;
        for(i=0;i<this.b.size();i++){
            for(j=0;j<this.b.get(i).size();j++)
                System.out.print(b.get(i).get(j)+"\t");
            System.out.println();
        }
    }

}
