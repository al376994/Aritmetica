package ecuacion;

import static java.lang.Math.sqrt;

public class EcuacionCuadratica {

    double a;
    double b;
    double c;

    public EcuacionCuadratica(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double resolver() {
        if (c == 0) {
            return 0;
        }
        if (a == 0) {
            EcuacionLineal ecuacionLineal = new EcuacionLineal(b, c);
            return ecuacionLineal.resolver();
        }
        if (b == 0) {
            EcuacionLineal ecuacionLineal = new EcuacionLineal(a, c);
            double x = ecuacionLineal.resolver();
            try {
                return sqrt(x);
            } catch (UnsupportedOperationException)

        }
    }
}
