package ej1rTrim;

public class factorial {
    public static void main(String[] args) {
        int n,f;
        n = Integer.parseInt(args[0]);
        f = 1;
        for (int i = 2; i<=n;i++) {
            f*=i;
        }
        System.out.println("El ej1rTrim.factorial de " + n + " es " + f);
    }
}
