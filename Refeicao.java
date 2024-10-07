package RU;

public class Refeicao {
    Alimento salada;
    Alimento pratoPrincipal;
    Alimento acompanhamento;

     Refeicao(Alimento salada, Alimento pratoPrincipal, Alimento acompanhamento) {
        this.salada = salada;
        this.pratoPrincipal = pratoPrincipal;
        this.acompanhamento = acompanhamento;
    }

    public String toString() {
        return "Salada: " + salada + ", Prato Principal: " + pratoPrincipal + ", Acompanhamento: " + acompanhamento;
    }
}

