import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.1, 2.1");
        int[] weights = new int[]{1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i =0; i < weights.length; i++) {

            System.out.print(weights[i]+ " ,");
        }
        //Задача 1.2.
        System.out.println(" Задание 1.2., 2.2 ");
        double[] house = new double[]{1.57, 7.654, 9.986, 0};
        house[0] = 1.57;
        double windous = house[0];
        for (int i = 0; i < 4; i++) {
            System.out.print(house[i]+ " ,");
        }
        //Задание 1.3.
        System.out.println("Задача 1.3, 2.3 ");
        int[] safe = new int[]{10, 6, 8, 7, 5};
        safe[0] = 10;
        for (int i = 0; i < safe.length; i++) {
            System.out.print(safe[i]+ " ,");
        }
        // Задание 3.
        System.out.println("Задание 3 ");
        System.out.println(weights[11] + "," + weights[10] + "," + weights[9] + "," + weights[8] + "," + weights[7] + "," + weights[6] + "," + weights[5] + "," + weights[4] + "," + weights[3] + "," + weights[2] + "," + weights[1] + "," + weights[0]);
        System.out.println(+house[3] + "," + house[2] + "," + house[1] + "," + house[0]);
        System.out.println(safe[4] + "," + safe[3] + "," + safe[2] + "," + safe[1] + "," + safe[0]);
        //Задание 4.
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









