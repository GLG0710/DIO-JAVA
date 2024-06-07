public class Operadores {
    public static void main(String[] args) {
        System.out.println("Operadores unitários:");

        int numero = 5;
        System.out.println(numero);
        System.out.println(-numero);
        
        System.out.println("---------");
        numero = -numero;
        System.out.println(numero);
        System.out.println(-numero);
        System.out.println("---------");
        
        numero = -numero;
        while (numero<=50) {
            if (numero<=50) {
                System.out.println(numero);
                numero = (numero + 5);
            }
        }

        System.out.println("---------");
        System.out.println(++numero);
        System.out.println("---------");

        boolean booleano = true;
        System.out.println(booleano);
        System.out.println(!booleano);
        
        System.out.println("---------");
       
        booleano = !booleano;
        System.out.println(booleano);
        System.out.println(!booleano);

        System.out.println("---------");
        System.out.println("Operadores termários:");

        int a , b;
        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        System.out.println("---------");
        System.out.println("Operadores lógicos e relacionais:");
        boolean A = (a>b);
        boolean B = (a<b);
        boolean resultado_booleano1 = A&&B;
        boolean resultado_booleano2 = A||B;
        System.out.println(resultado_booleano1);
        System.out.println(resultado_booleano2);
    }
}