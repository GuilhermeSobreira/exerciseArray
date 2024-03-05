package vetor03.principal;

import java.util.Arrays;

import vetor03.Empresa;
import vetor03.Funcionario;
import vetor03.rn.CadastroEmpresa;
import vetor03.rn.CadastroFuncionario;

public class Principal {

		public static void main(String[] args) {
			
			Empresa e0 = new Empresa("52.951.753", "R&D Confecções", "(82) 98140-0289");
			Empresa e1 = new Empresa("78.654.978", "Colucci Jóias", "(75) 99223-7412");
			Empresa e2 = new Empresa("21.654.963", "LupiCell", "(82) 98169-7845");
			Empresa e3 = new Empresa("32.412.654", "Papelaria La Casa de Papel", "(11) 98765-3215");
			Empresa e4 = new Empresa("55.584.669", "Euphoria Modas", "(87) 99999-9699");
			
			Funcionario f0 = new Funcionario("147.258.369-12", "Miguel", "23.654.456-9", "(82) 98747-9898", e1);
			Funcionario f1 = new Funcionario("875.986.913-88", "Diego", "89.613.478-2", "(82) 99933-7854", e0);
			Funcionario f2 = new Funcionario("654.951.753-85", "Lupita", "69.741.963-3", "(82) 98145-6566", e2);
			Funcionario f3 = new Funcionario("255.855.955-55", "Nairobi", "22.546.654-7", "(82) 98754-9966", e3);
			Funcionario f4 = new Funcionario("461.545.654-71", "Rue", "98.654.321-85", "(82) 99854-8854", e4);
			
			CadastroEmpresa em = new CadastroEmpresa();
			CadastroFuncionario cf = new CadastroFuncionario();
			
			em.cadastrarEmpresa(e0);
			em.cadastrarEmpresa(e1);
			em.cadastrarEmpresa(e2);
			em.cadastrarEmpresa(e3);
			em.cadastrarEmpresa(e4);
			
			cf.cadastrarFuncionario(f0);
			cf.cadastrarFuncionario(f1);
			cf.cadastrarFuncionario(f2);
			cf.cadastrarFuncionario(f3);
			cf.cadastrarFuncionario(f4);
			
			System.out.println(Arrays.toString(em.listarEmpresas()));
			System.out.println(Arrays.toString(cf.listar()));
		}
}
