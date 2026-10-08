package unidad2;

import java.math.BigInteger;

public class Ejercicio15conBigInt {

    public static void main(String[] args) {

        BigInteger producto = BigInteger.ONE;
        int n = 1;
        int cont = 0;

        while (cont < 200_000) {
            producto = producto.multiply(BigInteger.valueOf(n));

            cont++;
            n += 2;
        }

        System.out.println("Resultado del producto de los primeros 200000 números impares:");
        System.out.println(producto);
    }
}