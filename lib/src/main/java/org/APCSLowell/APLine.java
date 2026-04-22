package org.APCSLowell;

public class APLine {
    int a, b, c;
    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isOnLine(int x, int y) {
        return (double)a * (double)x + (double)b * (double)y + (double)c == 0.0;
    }
    public double getSlope() {
        return -(double)a / (double)b;
    }
}
