package Primitives;

import java.text.MessageFormat;

public class DoubleTrick {
    public static void main(String[] args) {
        double N = Double.MAX_VALUE;
        double N2 = N - 1_000_000_000;
        System.out.println("N  = " + N);
        System.out.println("N2 = " + N2);

        System.out.println(MessageFormat.format("for primitives N2==N is {0}", (N2 == N)));
        System.out.println("/*-------------------------------------------------------------------------------------------------*/");


        Double X = Double.POSITIVE_INFINITY;
        Double X2 = X - 1_000_000_000;
        System.out.println("X  = " + X);
        System.out.println("X2 = " + X2);

        System.out.println(MessageFormat.format("for envelope X2==X is {0}", (X2.equals(X))));

        Double xInfinity = Double.POSITIVE_INFINITY;
        Double maxValue = Double.MAX_VALUE;
        System.out.println("xInfinity > maxValue = " + (xInfinity > maxValue));

        System.out.printf("Double.POSITIVE_INFINITY == Double.MAX_VALUE = %b", Double.POSITIVE_INFINITY > Double.MAX_VALUE);
    }
}
