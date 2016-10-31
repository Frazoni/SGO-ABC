package app.bruna.com.br.sgo_abc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import app.bruna.com.br.sgo_abc.modelo.Produto;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProdutoFornecedorFragment extends Fragment {

    Spinner fornecedores;

    private Produto produto;
    public ProdutoFornecedorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState ) {

        View view = inflater.inflate(R.layout.fragment_produto_fornecedor, container, false);

        TextView descricao = (TextView) view.findViewById(R.id.descricao);
        descricao.setText(produto.getDescricao());

        fornecedores = (Spinner)view.findViewById(R.id.spinner_fornecedor);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(view.getContext(), R.array.fornecedores, android.R.layout.simple_dropdown_item_1line);
        fornecedores.setAdapter(adapter);
        return view;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
