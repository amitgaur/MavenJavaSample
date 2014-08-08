package com.mycompany.app;
public class Fib {
    long[] table;
    public Fib(){
        table = new long[80];
        for (int i = 0 ; i < table.length; i++) {
            table[i] = -1;
        }
        table[0] = 0;
        table[1] = 1;

    }
    public long compute(int n) {
        if (n>=80) return -1;
        if (table[n]==-1) {
            table[n] = compute(n-1) + compute(n-2);
        }
        return table[n];
    }
    

}
