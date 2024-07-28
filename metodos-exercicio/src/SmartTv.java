public class SmartTv {
    boolean ligada = false;
    int canal = 1, volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void passarCanal() {
        canal++;
    }

    public void voltarCanal() {
        canal--;
    }

    public void escolherCanal(int escolha) {
        canal = escolha;
    }
}
