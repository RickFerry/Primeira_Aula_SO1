package View;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
       
		OperacoesController opController = new OperacoesController();
//        opController.opracoesString();
//        opController.operacoesBuffer();
		
		 String frase = "Bem vindos.";
		 opController.operacaoFrase(frase);
	}

}
