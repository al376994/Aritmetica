package ecuacion;

public class EcuacionLineal {
    double a;
    double b;
    public EcuacionLineal(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double resolver() {
        if (b == 0) {
            return 0;
        }
        return -b/a;
    }
}
