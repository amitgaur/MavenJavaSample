package com.mycompany.app;
public class Fib {
    long[] table;
    long[] table2;
    public Fib(){
        table = new long[80];
        table2= new long[80];
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

    public long compute2(int n){
        if (n>=80) return -1;

        table2[0] = 0;
        table2[1] = 1;

        for (int i = n; i >=2; i++){
            table2[n] = compute2(n-1)+ compute2(n-2);
        }
        return table2[n];

    }

    

}
