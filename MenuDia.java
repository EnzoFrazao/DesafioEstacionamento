package RU;

class MenuDia {
    Refeicao almoco;
    Refeicao jantar;

    void setAlmoco(Refeicao almoco) {
        this.almoco = almoco;
    }

    void setJantar(Refeicao jantar) {
        this.jantar = jantar;
    }

    void exibirMenu(String dia) {
        System.out.println("\n--- " + dia + " ---");
        if (almoco != null) {
            System.out.println("Almoço: " + almoco);
        } else {
            System.out.println("Almoço: Não definido");
        }
        if (jantar != null) {
            System.out.println("Jantar: " + jantar);
        } else {
            System.out.println("Jantar: Não definido");
        }
    }
}

