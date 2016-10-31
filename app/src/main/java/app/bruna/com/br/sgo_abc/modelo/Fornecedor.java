package app.bruna.com.br.sgo_abc.modelo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gleidson on 26/10/2016.
 */

public class Fornecedor implements Serializable {

    private Long id;
    private String nome;
    private List<Produto> produtos;
    private static Long cont;
    private List<FornecedorProduto> fornecedores;

    static {
        cont = 0L;
    }

    public Fornecedor(Long id) {
        this();
        this.id = id;
    }

    public Fornecedor() {
        super();
        id = ++cont;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornecedor that = (Fornecedor) o;
        return id != null ? id.equals(that.id) : that.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
