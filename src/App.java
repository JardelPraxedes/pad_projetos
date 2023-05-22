public class App {
    private Forma forma;
    private Color cor;

    public App(Fabrica_tela fabrica) {
        forma = fabrica.criarForma();
        cor = fabrica.criarCor();
    }

    public void saida() {
        forma.desenhar();
        cor.preenchimento();
    }

    public static void main(String[] args) {
        Fabrica_tela fabrica_figura_1 = new Fabrica_figura_1();
        App desenho1 = new App(fabrica_figura_1);
        System.out.println("Papel e caneta na mão, vamos para o 1° desenho:");
        desenho1.saida();

        System.out.println("----------------------------------------------------");

        Fabrica_tela fabrica_figura_2 = new Fabrica_figura_2();
        App desenho2 = new App(fabrica_figura_2);
        System.out.println("Papel e caneta na mão, vamos para o 2° desenho:");
        desenho2.saida();

    }

}