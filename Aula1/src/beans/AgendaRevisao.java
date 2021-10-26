package beans;

import java.util.Date;

public class AgendaRevisao {
	public Date data;
	public Date hora;
	public String cliente;
	public String fone;
	public String veiculo;
	public String modelo;

	//operações (metodos)
	public void agendar() {
		System.out.println("Agendado..!!");
	}
	public void reagendar() {}
	public void cancelar() {}
		
}
