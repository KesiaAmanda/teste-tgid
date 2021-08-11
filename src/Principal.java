import model.ItemVenda;
import model.Produto;
import model.Usuario;
import model.Venda;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    private static List<Venda> vendas = new ArrayList<>();

    public static void main(String[] args) {
        List<Usuario> usuarios = carregaUsuarios();
        List<Produto> produtos = carregaProdutos();


        Usuario usuario = usuarios.get(1);
        List<ItemVenda> itensVenda = new ArrayList<>();
        itensVenda.add(new ItemVenda(produtos.get(0), 5));
        itensVenda.add(new ItemVenda(produtos.get(1), 2));
        itensVenda.add(new ItemVenda(produtos.get(2), 3));
        compra(usuario, itensVenda);

        usuario = usuarios.get(0);
        itensVenda.clear();
        itensVenda.add(new ItemVenda(produtos.get(3), 2));
        itensVenda.add(new ItemVenda(produtos.get(2), 3));
        compra(usuario, itensVenda);

        usuario = usuarios.get(2);
        itensVenda.clear();
        itensVenda.add(new ItemVenda(produtos.get(0), 5));
        itensVenda.add(new ItemVenda(produtos.get(1), 2));
        itensVenda.add(new ItemVenda(produtos.get(2), 3));
        itensVenda.add(new ItemVenda(produtos.get(4), 5));
        compra(usuario, itensVenda);


        System.out.println("Resumo das Vendas\n" + vendas.toString());
    }

    private static void compra(Usuario usuario, List<ItemVenda> itensVenda){
        vendas.add(new Venda(usuario, itensVenda));
    }

    private static List<Usuario> carregaUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(55555555555l,"Maria","maria@email.com"));
        usuarios.add(new Usuario(55555555554l,"João","joao@email.com"));
        usuarios.add(new Usuario(55555555553l,"José","jose@email.com"));
        return usuarios;
    }

    private static List<Produto> carregaProdutos(){
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Ração Golden",132.99,100));
        produtos.add(new Produto("Ração Premier",204.99,200));
        produtos.add(new Produto("Biscoito Golden",15.90,150));
        produtos.add(new Produto("Snack Petz",4.99,150));
        produtos.add(new Produto("Petisco KelDog",21.90,150));
        return produtos;
    }

}