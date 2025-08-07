package Modelo;

public class Barreira extends Personagem{
    public Barreira(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = false;
        this.bMortal = false;
    }

    public void autoDesenho() {
        super.autoDesenho();}

}
