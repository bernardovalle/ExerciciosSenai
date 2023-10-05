package ExercicioContato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =  new Scanner(System.in);
		int opcao;
		
		List<Contato> list =  new ArrayList<>();
		
		do {
			System.out.println("*** Informe uma opção ***");
			System.out.println("");
			System.out.println("1. Adicionar Contato: ");
			System.out.println("2. Pesquisar Contato: ");
			System.out.println("3. Editar Contato: ");
			System.out.println("4. Remover Contato: ");
			System.out.println("5. Listar Contatos: ");
			System.out.println("6. Sair *** ");
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Informe o nome do contato:");
				String nome = leia.next();
				System.out.println("Informe o telefone:");
				int numero = leia.nextInt();
				System.out.println("Informe o email do contato:");
				String email = leia.next();
				list.add(new Contato(nome, numero, email));
				break;
			case 2:
				System.out.println("Informe o nome do contato que deseja pesquisar:");
				String nomePesquisa = leia.next();
				pesquisarContatos(list, nomePesquisa);
				break;
			case 3:
				System.out.println("Informe o nome do contato que deseja editar:");
				String contatoEditar = leia.next();
				editarContato(list, contatoEditar);
				break;
			case 4:
				System.out.println("Informe o nome do contato que deseja editar:");
				String nomeRemover = leia.next();
				reomverContato(list, nomeRemover);
				break;
			case 5:
				listarcontatos(list);
				break;
			case 6:
				System.out.println("Finalizado. ");
				break;
			
			}
		} while (opcao != 6);
		leia.close();
	}
	 
	 public static void pesquisarContatos(List<Contato> lista, String nome) {
		 for(Contato contato : lista) {
				if(contato.getNome().equals(nome)) {
					System.out.println("Nome: "+contato.getNome()+". Telefone: "+contato.getTelefone()+". Email: "+contato.getEmail());	
				}
			}
	 }
	
	public static void editarContato(List<Contato> list, String nomeContato) {
		Scanner leia =  new Scanner(System.in);
		for(int i=0;i<list.size(); i++) {
			if(list.get(i).getNome() == nomeContato) {
				System.out.println("Informe o novo número do contato: ");
				int numero = leia.nextInt();
				list.get(i).setTelefone(numero);
				System.out.println("Informe o novo email do contato: ");
				String email = leia.next();
				list.get(i).setEmail(email);
				System.out.println("Contato adicionado.");
			} else {
				System.out.println("Este nome não está na lista.");
			}
		}
	}
	public static void reomverContato(List<Contato> list, String nomeRemover) {
		for(int i=0;i< list.size();i++) {
			if(list.get(i).getNome().equals(nomeRemover)) {
				list.remove(i);
				System.out.println("Removido.");
			} else {
				System.out.println("Nome não encontrado na lista. ");
			}
		}
	}
	public static void listarcontatos(List<Contato> list) {
		System.out.println("LISTA -");
		for(Contato x: list) {
			
			System.out.println("Nome: "+x.getNome()+". Telefone: "+x.getTelefone()+". E-mail:"+x.getEmail());
		}
	
	}
}
	


