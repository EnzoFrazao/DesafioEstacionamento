package RU;

public class Main {
    public static void main(String[] args) {

        Alimento salada1 = new Alimento("Salada de Alface");
        Alimento pratoPrincipal1 = new Alimento("Frango Grelhado");
        Alimento acompanhamento1 = new Alimento("Arroz e Feijão");

        Alimento salada2 = new Alimento("Salada de Tomate");
        Alimento pratoPrincipal2 = new Alimento("Bife Acebolado");
        Alimento acompanhamento2 = new Alimento("Macarrão");


        Refeicao refeicao1 = new Refeicao(salada1, pratoPrincipal1, acompanhamento1);
        Refeicao refeicao2 = new Refeicao(salada2, pratoPrincipal2, acompanhamento2);

        CardapioSemanal cardapio = new CardapioSemanal();

        cardapio.setRefeicaoDia("segunda", "almoco", refeicao1);
        cardapio.setRefeicaoDia("segunda", "jantar", refeicao2);
        cardapio.setRefeicaoDia("terca", "almoco", refeicao1);
        cardapio.setRefeicaoDia("terca", "jantar", refeicao2);

        cardapio.exibirCardapio();
    }
}
