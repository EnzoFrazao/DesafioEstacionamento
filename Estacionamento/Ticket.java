package Estacionamento;

public class Ticket {
    int numero;
    double valor;
    boolean pago;

    Ticket(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
        this.pago = false;
    }

    int getNumero() {
        return numero;
    }

    double getValor() {
        return valor;
    }

    boolean isPago() {
        return pago;
    }

    void pagar() {
        this.pago = true;
    }

    public String toString() {
        return "Ticket Número: " + numero + ", Valor: R$" + valor + ", Pago: " + (pago ? "Sim" : "Não");
    }
}



