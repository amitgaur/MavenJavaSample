
public class Fib {
    int[] table;
    public Fib(){
        table = new int[500];
        for (int i = 0 ; i < table.length; i++) {
            table[i] = -1;
        }
        table[0] = 0;
        table[1] = 1;

    }
    public int compute(int n) {
        if (n>500) return -1;
        if (table[n]>0) {
            return table[n];
        }
        else {
            table[n] = compute(n-1) + compute(n-2);
            return table[n];
        }

    }

}
