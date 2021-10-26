package implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import beans.AgendaRevisao;

public class ImplemantarAgenda {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		AgendaRevisao agenda1 = new AgendaRevisao();
		
		agenda1.agendar();
		
		agenda1.cliente = "Ana Maria Braga";
		agenda1.fone = "(11)1234567";
		agenda1.modelo = "Fusquinha";
		agenda1.data = myDate.parse("27/10/2021 10:30");
		
		System.out.println(agenda1.cliente);
		System.out.println(agenda1.fone);
		System.out.println(agenda1.modelo);
		System.out.println(agenda1.data);
			
		
		AgendaRevisao agenda2 = new AgendaRevisao();
		
		agenda2.cliente = "Fausto Silva";
		agenda2.modelo = "Uno";
		agenda2.data = myDate.parse("30/10/2021 00:00");

		System.out.println(agenda2.cliente);
		System.out.println(agenda2.modelo);
				
		
		
				
		

	}

}
