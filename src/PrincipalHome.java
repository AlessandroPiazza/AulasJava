
import java.text.ParseException;
import java.util.Iterator;
import java.util.Scanner;
import br.com.microlins.Atividade;
import br.com.microlins.AtividadePessoaA;
import br.com.microlins.Pessoa;
import br.com.microlins.interfaces.IAtividadePessoa;

public class PrincipalHome {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		IAtividadePessoa fila = new AtividadePessoaA();
		Iterator<Atividade> iteratorLista = null;
		Iterator<Pessoa> iteratorPessoa = null;
		AtividadePessoaA aPessoa = new AtividadePessoaA();
		Pessoa pessoa = null;
		Atividade atividade = null;

		int opcao;

		opcao = scan.nextInt();
		while (opcao != 9) {
			String nome;
			System.out.println(
					"Digite:\n1 - Cadastrar Atividade\n2 - Recuperar lista de atividades por pessoa\n3 - Recuperar ultima atividade por pessoa\n4 - Quantidade de atividades por pessoa\n5 - Quantidade de atividades total\n6 - Consultar ultima atividade");
			if (opcao == 1) {

				pessoa = new Pessoa();
				System.out.println("Digite o nome da pessoa");
				nome = scan.next();
				iteratorLista = aPessoa.getListaAtividade().iterator();
				if (!iteratorLista.equals(aPessoa.getListaAtividade().contains(pessoa.getNome()))) {
					int peso, altura, idade;
					System.out.println("Digite a idade da pessoa");
					idade = scan.nextInt();
					System.out.println("Digite o peso da pessoa");
					peso = scan.nextInt();
					System.out.println("Digite a altura da pessoa");
					altura = scan.nextInt();
					pessoa.setNome(nome);
					pessoa.setIdade(idade);
					pessoa.setPeso(peso);
					pessoa.setAltura(altura);
					aPessoa.gravarPessoa(pessoa);
				} else {
					iteratorPessoa = aPessoa.getListaPessoa().iterator();
					while (iteratorPessoa.hasNext())
						System.out.println(iteratorPessoa.next());

					System.out.println("Digite o nome da pessoa para adicionar a atividade");
					nome = scan.next();
					while (iteratorPessoa.hasNext()) {
						if (nome == pessoa.getNome()) {
							pessoa.getNome();
							pessoa.getAltura();
							pessoa.getIdade();
							pessoa.getPeso();
							atividade.setPessoa(pessoa);
						}
					}
					String descricao;
					String horaInicio = "h:mm - a";
					String horaFim;
					System.out.println("Digite a descrição da atividade");
					descricao = scan.next();
					System.out.println("Data de inicio");
					horaInicio = scan.next();
					System.out.println("Data final");
					horaFim = scan.next();

					atividade.setDescricao(descricao);

					aPessoa.gravarAtividade(atividade);

				}
			}
			if (opcao == 2) {
				Iterator<Atividade> iterator = aPessoa.recuperarTodasAtividadesPorPessoa(pessoa).iterator();
				Atividade atividadePessoa = iterator.next();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

			}
			if(opcao == 3) {
				System.out.println(aPessoa.recuperarUltimaAtividadePessoa(pessoa));
			}
			if(opcao == 4) {
				System.out.println(aPessoa.quantidadeAtividadesRealizadasPorPessoa(pessoa));
			}
			if(opcao == 5) {
				System.out.println(aPessoa.totalAtividades());
			}
			if(opcao == 6) {
				System.out.println(aPessoa.consultarUltimaAtividadeRealizada());
			}
		}

	}

}
