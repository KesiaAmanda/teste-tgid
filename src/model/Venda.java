package model;

import java.util.List;

public class Venda {
    private Usuario usuario;
    private List<ItemVenda> itensVenda;

    public Venda() {
    }

    public Venda(Usuario usuario, List<ItemVenda> itemVendas) {
        this.usuario = usuario;
        this.itensVenda = itemVendas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<ItemVenda> getItemVendas() {
        return itensVenda;
    }

    public void setItemVendas(List<ItemVenda> itemVendas) {
        this.itensVenda = itemVendas;
    }

    @Override
    public String toString() {
        Double total = itensVenda.stream().mapToDouble(itemVenda -> { return  itemVenda.getProduto().getPreco() * itemVenda.getQuantidade();}).sum();
        return "\nVenda{" +
                "\nusuario=" + usuario +
                "\n, itemVendas=" + itensVenda +
                "\n, Total=" + total;
    }
}
