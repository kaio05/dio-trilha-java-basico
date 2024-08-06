package com.iphone;
import com.iphone.app.AparelhoTelefonico;
import com.iphone.app.NavegadorInternet;
import com.iphone.app.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    public void atender() {
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo página");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    public void tocar() {
        System.out.println("Está tocando");
    }
    public void pausar() {
        System.out.println("Está pausando");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a música: " + musica);
    }
}
