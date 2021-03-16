package ClassActivities.Sequences;

public class Summing {
    public static long summing(int n){
        int k = 1;
        long result = 0;
        while(k <= (n/2)){
            result += (2*k++);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(summing(100));
        System.out.println(summing(1000));
        System.out.println(summing(100000));
    }
}
