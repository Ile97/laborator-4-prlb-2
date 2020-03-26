package com.company;

public class gar {
    double[] a;
    int n;
    double temp;

    public gar() {
    }

    public void bubble(double[] a, int n) {
        for(int i = 0; i < n - 1; ++i) {
            for(int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    this.temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = this.temp;
                }
            }
        }

    }
}


