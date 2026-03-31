public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        int first = 0;
        int sec = 1;
        for (int i = 0; i <= num; i++) {
            System.out.println(first);
            int last = first + sec;
            first = sec;
            sec = last;
        }

    }
}