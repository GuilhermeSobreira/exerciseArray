package vetor03.rn;

import vetor03.Funcionario;

public class CadastroFuncionario {
	
	Funcionario[] funcio = new Funcionario[5];
	
	int cont = 0;
	
	public void cadastrarFuncionario (Funcionario f) {
		
		funcio[cont] = f;
		
		cont++;
	}
	
	public Funcionario [] listar() {
		return funcio;
	}
}