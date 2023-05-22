class Fabrica_figura_1 implements Fabrica_tela {
    @Override
    public Forma criarForma() {
        return new Quadrado();
    }

    @Override
    public Color criarCor() {
        return new Azul();
    }
}