package vetor03.rn;

import vetor03.Empresa;

public class CadastroEmpresa {
	
	Empresa[] em = new Empresa[5];
	
	int cont = 0;
	
	public void cadastrarEmpresa (Empresa empresa){
		if(em.length <= 4) {
		em[cont] = empresa;
		cont++;
		}else {
			System.out.println("vetor cheio!");
		}
	}
	
	public Empresa[] listarEmpresas() {
		return em;
	}
}
