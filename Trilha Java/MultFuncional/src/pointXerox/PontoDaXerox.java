package pointXerox;

import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressoras.*;
import equipamentos.multfuncional.EquipamentoMultifuncional;
import equipamentos.copiadora.*;

public class PontoDaXerox {

		public static void main(String[]args) {
			EquipamentoMultifuncional em = new EquipamentoMultifuncional();
			
			
			Impressora impressora = em;
			Digitalizadora digitalizadora = em;
			Copiadora copiadora = em;
			
			impressora.imprimir();
			digitalizadora.digitalizar();
			copiadora.copiar();
		}
}
