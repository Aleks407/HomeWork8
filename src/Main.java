import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Task1-Task2
        System.out.println("Задача №1-2");
        //Massiv 1
        int[]arr=new int[3];
          arr[0]=1;
          arr[1]=2;
          arr[2]=3;
        for (int i = 0; i <arr.length; i++) {
            if(i==arr.length-1){System.out.print(arr[i]);
                break;
            }
        System.out.print(arr[i]+", ");
        }
        System.out.println();
        //Massiv 2
        double[]arrDouble= {1.57, 7.654, 9.986};

        System.out.println(Arrays.toString(arrDouble));
        //Massiv 3

        int[]intArr={2,3,7,5,6};
        System.out.println(Arrays.toString(intArr));
//Task3
        //Massiv 1
        System.out.println("Задача №3");
        for (int i = arr.length-1; i >=0; i--) {
           System.out.print(arr[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }
        //Massiv 2
        System.out.println();
        for (int i = arrDouble.length-1; i >=0; i--) {
            System.out.print(arrDouble[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }
        //Massiv 3
        System.out.println();
        for (int i = intArr.length-1; i >=0; i--) {
            System.out.print(intArr[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }
//Task 4
        System.out.println();
        System.out.println("Задача №4");
        int[]intArr2={2,3,7,5,6};
        for (int i =0; i<intArr2.length; i++) {
            if(intArr2[i]%2==1){
                intArr2[i]++;
            }
        }
        System.out.println(Arrays.toString(intArr2));


    }
}
