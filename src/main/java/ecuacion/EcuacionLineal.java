package ecuacion;

public class EcuacionLineal {
    double a;
    double b;
    public EcuacionLineal(double a, double b) {
        a = this.a;
        b = this.b;
    }

    public double resolver() {
        if (b == 0) {
            return 0;
        }
        System.out.println(-b/a);
        return -b/a;
    }
}
