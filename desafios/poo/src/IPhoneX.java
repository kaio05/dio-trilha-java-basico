import com.iphone.IPhone;

public class IPhoneX {
    public static void main(String[] args) {
        IPhone iPhoneX = new IPhone();

        iPhoneX.adicionarNovaAba();
        iPhoneX.atualizarPagina();
        iPhoneX.exibirPagina("Java básico");

        iPhoneX.tocar();
        iPhoneX.pausar();
        iPhoneX.selecionarMusica("American Pie");

        iPhoneX.ligar("123456789");
        iPhoneX.atender();
        iPhoneX.iniciarCorreioVoz();
    }
}
