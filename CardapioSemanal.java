package RU;

class CardapioSemanal {
    MenuDia segunda = new MenuDia();
    MenuDia terca = new MenuDia();
    MenuDia quarta = new MenuDia();
    MenuDia quinta = new MenuDia();
    MenuDia sexta = new MenuDia();
    MenuDia sabado = new MenuDia();


    public void setRefeicaoDia(String dia, String turno, Refeicao refeicao) {
        MenuDia menuDia = getMenuDia(dia);
        if (menuDia != null) {
            if (turno.equalsIgnoreCase("almoco")) {
                menuDia.setAlmoco(refeicao);
            } else if (turno.equalsIgnoreCase("jantar")) {
                menuDia.setJantar(refeicao);
            } else {
                System.out.println("Turno inválido! Use 'almoco' ou 'jantar'.");
            }
        } else {
            System.out.println("Dia inválido! Escolha entre Segunda a Domingo.");
        }
    }

    void exibirCardapio() {
        segunda.exibirMenu("Segunda");
        terca.exibirMenu("Terça");
        quarta.exibirMenu("Quarta");
        quinta.exibirMenu("Quinta");
        sexta.exibirMenu("Sexta");
        sabado.exibirMenu("Sábado");
    }

    private MenuDia getMenuDia(String dia) {
        switch (dia.toLowerCase()) {
            case "segunda":
                return segunda;
            case "terca":
                return terca;
            case "quarta":
                return quarta;
            case "quinta":
                return quinta;
            case "sexta":
                return sexta;
            case "sabado":
                return sabado;
            default:
                return null;
        }
    }
}
