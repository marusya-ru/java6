package ru.netology.sqr;

public class SQRService {
    public int sqrCount(int minRange, int maxRange) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= minRange && sqr <= maxRange) {
                count++;
            }
            if (sqr > maxRange) {
                break;
            }
        }
        return count;
    }
}
