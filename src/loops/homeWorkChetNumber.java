package loops;

import java.util.Random;

public class homeWorkChetNumber {
    public static void main(String[] ar) {
        Random random = new Random();
        double schet = 0;
        int sluchnumb = 1001;

        for (int i = 0; i < sluchnumb; i++) {
            int gen = random.nextInt(101);
            if  (gen % 2 == 0) {
                schet++;
            }
        }
        System.out.println((schet / sluchnumb * 100) + " % выпадения четных чисел");
    }
}
