public class Sept_1_3 {
     public long totalFine(int date, int car[], int fine[]) {
        long sum = 0;

        if (date % 2 == 0) {
          
            for (int i = 0; i < car.length; i++) {
                if (car[i] % 2 != 0) {
                    sum += fine[i];
                }
            }
        } else {
           
            for (int i = 0; i < car.length; i++) {
                if (car[i] % 2 == 0) {
                    sum += fine[i];
                }
            }
        }

        return sum;
    }
}
// Given an array of car numbers car[], an array of penalties fine[], and an integer date, determine the total fine collected on that date. The fine is collected based on parity, i.e., on an even date, fines are collected from odd-numbered cars, and on an odd date, fines are collected from even-numbered cars.