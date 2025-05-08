package Utils;

public class CalculosMatematicos {

    public static double aplicarDesconto(double a, double b){

        return a - (a * (b/100));
    }

    public static double incrementarPorcentagem(double a, double b){

        return a + ((b/100) * a);
    }

    public static double amostragem(double a, double b){

        return (a * b)/100;
    }

    public static double amostragem2(double a, double b){

        return (b/a) * 100;
    }

    public static double descobrirDesconto(double a, double b){

        return ((a - b)/a) * 100;
    }

    public static double variacaoDeltaDesconto(double a, double b){

        return ((b - a)/a) * 100;
    }

    public static double valorOriginal(double a, double b){

        return (a * 100 / (100 - b));
    }

    public static double regraDeTres(double a, double b, double r1){

        return (r1 * b) / a;
    }
}
