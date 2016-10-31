package app.bruna.com.br.sgo_abc.modelo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gleidson on 26/10/2016.
 */

public class Produto implements Serializable {

    private Long id;
    private String descricao;
    private Long quantidadeAtual;
    private Long quantidadeSolicitada;
    private Float preco;
    private List<FornecedorProduto> fornecedores;
    private static Long cont;

    static {
        cont = 0L;
    }

    public Produto() {
        super();
        id = ++cont;
    }

    public Produto(Long id) {
        this();
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(Long quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public Long getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(Long quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public List<FornecedorProduto> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<FornecedorProduto> fornecedores) {
        this.fornecedores = fornecedores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id != null ? id.equals(produto.id) : produto.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return descricao;
    }

}
