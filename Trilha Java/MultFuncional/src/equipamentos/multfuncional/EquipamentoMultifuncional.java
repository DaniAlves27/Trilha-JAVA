package equipamentos.multfuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressoras.Impressora;

public class EquipamentoMultifuncional  implements Copiadora,Digitalizadora,Impressora{

	@Override
	public void copiar() {
		System.out.println("Copiando Via equipamento Multfuncional");
		
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo Via equipamento Multfuncional");
		
	}

	@Override
	public void digitalizar() {
	
		System.out.println("Digitalizando Via equipamento Multfuncional");
	}

}
