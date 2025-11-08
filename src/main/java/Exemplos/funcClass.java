package Exemplos;

public class funcClass {
    public int a;
    public int b;
    public int c;
    public int higher = max (a,b,c);

    public int max (int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
