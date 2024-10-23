import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Massivin ölçüsünü daxil edin: ");
        int n= sc.nextInt();
        System.out.println("Massivin elementlərini daxil edin: ");
        int [] arr= new int[n];
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
            System.out.println("Massivin "+i+"-ci elementi: "+arr[i]);
        }
        System.out.println();
        for (int i=0; i< arr.length; i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }
        System.out.println();
        changeMaxMinValue(arr);
    }
    public static void changeMaxMinValue(int[] array){
        int max=array[0];
        int min=array[0];
        for (int i=0; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            } else if (array[i]>max) {
                max=array[i];
            }
        }
        System.out.println("Massivin maksimum elementi: max= "+max);
        System.out.println("Massivin minimum elementi: min= "+min);
        System.out.println("maksimum ve minimum elementlərin yerini dəyişdikdən sonra qiymətləri: ");
            int k= max;
            max=min;
            min=k;
            System.out.println("max= "+max);
            System.out.println("min= "+min);


    }
}