package apps;

public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInteret();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");	
	}
}
