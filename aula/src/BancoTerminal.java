public class BancoTerminal {
    public static void main (String [] args) {
        double saldo = 35;
        double valorSolicitado = 35;

        /*Estrutura ternária*/
        String solicitacaoAceita = saldo>=valorSolicitado ? "Sua solicitação foi aceita, seu saldo atual é de: "+(saldo-valorSolicitado) : "Sua solicitação foi negada, saldo insuficiente, seu saldo é de: "+saldo;
        System.out.println(solicitacaoAceita);

        /*Estrutura composta*/
        if (saldo>=valorSolicitado) {
            saldo = (saldo-valorSolicitado);
            System.out.println("Transição aprovada");
            System.out.println("Saldo: "+saldo+" Reais");
        }
        else {
            System.out.println("Transição reprovada");
            System.out.println("Saldo: "+saldo+" Reais");
        }
    }
}