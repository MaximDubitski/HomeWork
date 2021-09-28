package home_work_2.loops.txt;


public class Task15 {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ; i++) {
            for (int j = 2; j < 6; j++) {
                System.out.print(j + " x " + i + " = " + j * i + "\t");
                if (j < 5) System.out.print("\t\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < 10 ; i++) {
            for (int j = 6; j < 10; j++) {
                System.out.print(j + " x " + i + " = " + j * i + "\t");
                if (j < 9) System.out.print("\t\t");
            }
            System.out.println();
        }
    }
}
