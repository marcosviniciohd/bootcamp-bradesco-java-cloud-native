public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 1000.0;
        double valorSolicitado = 500.0;

        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
            
        }
    }
}
