package Estacionamento;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        Ticket ticket1 = estacionamento.emitirTicket(10.0);
        Ticket ticket2 = estacionamento.emitirTicket(15.0);

        estacionamento.listarTickets();

        estacionamento.pagarTicket(ticket1.getNumero());

        System.out.println("Saldo total: R$" + estacionamento.consultarSaldo());

        estacionamento.listarTickets();
    }
}

