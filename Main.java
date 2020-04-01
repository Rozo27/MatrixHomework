import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduceti in ordine urmatoarele date:\n1.matrixDimension-dimensiunea matricei\n2.tipul de implementare:Array sau ArrayList");
        int dim=sc.nextInt();
        sc.nextLine();
        String tip=sc.nextLine(),afisare="Introduceti in ordine urmatoarele valori:\n1.mainDiagValue, respectiv sndDiagValue-valorile elementelor de pe diagonala principala,respectiv diagonala secundara\n2.centerValue-valoarea din mijlocul matricei\n3.leftValue,upValue,RightVlue,bottomValue-valorile aferente celor 4 cadrane:";
        Matrix m=new Matrix(dim,tip);
        if(tip.equals("Array")){
            System.out.println(afisare);
            m.updateArray(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            m.printArray();
        }
        else{
            System.out.println(afisare);
            m.updateArrayList(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            m.printArrayList();
        }
        sc.close();
    }
}
