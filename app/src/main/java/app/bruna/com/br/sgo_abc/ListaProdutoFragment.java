package app.bruna.com.br.sgo_abc;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentController;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import app.bruna.com.br.sgo_abc.modelo.Fornecedor;
import app.bruna.com.br.sgo_abc.modelo.FornecedorProduto;
import app.bruna.com.br.sgo_abc.modelo.ListaProdutoAdapter;
import app.bruna.com.br.sgo_abc.modelo.Produto;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaProdutoFragment extends Fragment {


    public ListaProdutoFragment() {
        // Required empty public constructor
    }

    private Boolean somenteVazios;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_lista__produto_, container, false);
        ListView listView = (ListView) view.findViewById(R.id.lista_produtos);




        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Ambev");
        fornecedor.setProdutos(new ArrayList<Produto>());

        Produto p1 = new Produto();
        p1.setDescricao("Abacate");
        p1.setPreco(3.58F);
        p1.setQuantidadeAtual((long) 58);
        p1.setQuantidadeSolicitada((long)5);
        p1.setFornecedores(new ArrayList<FornecedorProduto>());
        FornecedorProduto fornecedorProduto1 = new FornecedorProduto();
        fornecedorProduto1.setFornecedor(fornecedor);
        fornecedorProduto1.setProduto(p1);
        fornecedorProduto1.setCusto(50D);
        fornecedorProduto1.setQuantidade(100D);
        p1.setFornecedores(new ArrayList<FornecedorProduto>());
        p1.getFornecedores().add(fornecedorProduto1);

        Produto p2 = new Produto();
        p2.setDescricao("Cebola");
        p2.setPreco(3.58F);
        p2.setQuantidadeAtual((long) 58);
        p2.setQuantidadeSolicitada((long)5);
        p2.setFornecedores(new ArrayList<FornecedorProduto>());

        Produto p3 = new Produto();
        p3.setDescricao("Laranja");
        p3.setPreco(3.58F);
        p3.setQuantidadeAtual((long) 58);
        p3.setQuantidadeSolicitada((long)5);
        p3.setFornecedores(new ArrayList<FornecedorProduto>());

        Produto p4 = new Produto();
        p4.setDescricao("Maçã");
        p4.setQuantidadeAtual((long) 58);
        p4.setQuantidadeSolicitada((long)5);
        p4.setPreco(3.58F);
        p4.setFornecedores(new ArrayList<FornecedorProduto>());
        fornecedor.getProdutos().add(p1);
        fornecedor.getProdutos().add(p2);
        fornecedor.getProdutos().add(p3);
        fornecedor.getProdutos().add(p4);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        if (somenteVazios != null && !somenteVazios) {
            produtos.add(p3);
            produtos.add(p4);
        }
        final ListaProdutoAdapter produtosAdapter = new ListaProdutoAdapter(view.getContext(), produtos);
        listView.setAdapter(produtosAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Produto produto = produtosAdapter.getItem(position);
                ProdutoFornecedorFragment fragment = new ProdutoFornecedorFragment();
                fragment.setProduto(produto);
                FragmentTransaction fragmentTrasaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTrasaction.replace(R.id.fragment_container, fragment);
                fragmentTrasaction.commit();
            }
        });
        /** ArrayAdapter<Produto> produtoAdapter = new ArrayAdapter<Produto>(container.getContext(), android.R.layout.simple_list_item_1, produtos);
         listView.setAdapter(produtoAdapter);**/
        return view;


    }

    public Boolean getSomenteVazios() {
        return somenteVazios;
    }

    public void setSomenteVazios(Boolean somenteVazios) {
        this.somenteVazios = somenteVazios;
    }
}
