public class Argumentos {
    public static void main(String[] args) {
        
        String nome = args[0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        Double altura = Double.valueOf(args[3]);

        System.out.println("Olá! Meu nome é "+nome+" "+sobrenome);
        System.out.println("Tenho "+idade+" anos");
        System.out.println("E "+altura+" metros de altura");
    }
}
