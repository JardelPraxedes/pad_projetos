class Fabrica_figura_2 implements Fabrica_tela {
    @Override
    public Forma criarForma() {
        return new Circulo();
    }

    @Override
    public Color criarCor() {
        return new Vermelho();
    }
}