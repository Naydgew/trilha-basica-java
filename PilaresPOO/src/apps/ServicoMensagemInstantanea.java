package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarConectadoInteret() {
		System.out.println("Validando se está conectado a internet");
	}
}
