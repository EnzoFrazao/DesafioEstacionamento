package Estacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    List<Ticket> tickets;
    double saldo;

    Estacionamento() {
        this.tickets = new ArrayList<>();
        this.saldo = 0;
    }

    Ticket emitirTicket(double valor) {
        int numero = tickets.size() + 1; // Gera um número de ticket sequencial
        Ticket ticket = new Ticket(numero, valor);
        tickets.add(ticket);
        return ticket;
    }

    void pagarTicket(int numero) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumero() == numero && !ticket.isPago()) {
                ticket.pagar();
                saldo += ticket.getValor();
                System.out.println("Ticket " + numero + " pago com sucesso!");
                return;
            }
        }
        System.out.println("Ticket inválido ou já pago.");
    }

    double consultarSaldo() {
        return saldo;
    }

    void listarTickets() {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

}
