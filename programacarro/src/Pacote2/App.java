package Pacote2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import Pacote3.Acelerador;
import Pacote3.Autenticador;
import Pacote3.Carro;
import Pacote3.Motorista;
import Pacote3.Pessoa;
import Pacote3.Passageiro;
public class App {
    public static void main(String[] args) throws Exception {
        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */
        List<Pessoa> lista = new ArrayList<>(); 
     Motorista mot = new Motorista("chris","155664");
     lista.add(new Passageiro("Bruno","158425"));
     lista.add(new Passageiro("Jose","547854"));
     lista.add(mot);
     
     System.out.println("O tamanho da lista : " +  lista.size());
    
     if(lista.contains(mot)){
     System.out.println("Encontrou");
     }
      else
      System.out.println("Não encontrou");
     lista.remove(0);

     System.out.println("O tamanho da lista : " +  lista.size());
     
     List<Pessoa> passageiro = new ArrayList<>(); 
      passageiro.add(new Passageiro("Leo","4552145"));
      passageiro.add(new Passageiro("Camile", "5812877"));

      lista.addAll(passageiro);

      System.out.println("O tamanho da lista : " +  lista.size());

      for (Pessoa pessoa : lista) {
        System.out.println("\nNome : " + pessoa.getNome() + "\n" + "Cpf : " + pessoa.getCpf() + "\n" + "Tipo Da classe : " + pessoa.getClass().getSimpleName());
      }






    }
}
