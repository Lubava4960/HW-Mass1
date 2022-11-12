import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.1, 2.1");
        int[] weights = new int[]{1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i =0; i < weights.length; i++) {

            System.out.print(weights[i]+ ",");
            if (i!=weights.length-1){
                System.out.print(" ");
            }

        }
        System.out.println();
        //Задача 1.2.
        System.out.println(" Задание 1.2., 2.2 ");
        double[] house = new double[]{1.57, 7.654, 9.986, 0};
        house[0] = 1.57;
        double windous = house[0];
        for (int i = 0; i < house.length; i++) {
            System.out.print(house[i]+ " ,");
            if (i!=house.length-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        //Задание 1.3.
        System.out.println("Задача 1.3, 2.3 ");
        int[] safe = new int[]{10, 6, 8, 7, 5};
        safe[0] = 10;
        for (int i = 0; i < safe.length; i++) {
            System.out.print(safe[i]+ " ,");
            if (i!=safe.length-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        // Задание 3.
        System.out.println("Задание 3 ");
        for (int i = weights.length-1; i>=0; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = house.length-1; i>=0; i--) {
            System.out.print(house[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = safe.length-1; i>=0; i--) {
            System.out.print(safe[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Задание 4");
        int array[] ={1,2,3,4,5,6,7,8,9,10,11,12};
        array[0]=0;
        for(int i= 0;i<array.length; i++){
            if (array[i] % 2 !=0) {
                array[i]++;
            }
            System.out.print(array[i]+ " ,");

        }

    }

}









