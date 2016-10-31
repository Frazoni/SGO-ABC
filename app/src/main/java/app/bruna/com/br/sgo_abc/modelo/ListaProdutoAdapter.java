package app.bruna.com.br.sgo_abc.modelo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import app.bruna.com.br.sgo_abc.R;

import static app.bruna.com.br.sgo_abc.R.id.qtd_atual;

/**
 * Created by gleidson on 26/10/2016.
 */

public class ListaProdutoAdapter extends ArrayAdapter<Produto> {

    private Context context;
    private List<Produto> produtos = null;


    public ListaProdutoAdapter(Context context, List<Produto> produtos) {
        super(context, 0, produtos);
        this.produtos = produtos;
        this.context = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Produto produto = produtos.get(position);

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_lista_produto, null);

            TextView descricao = (TextView) view.findViewById(R.id.descricao);
            descricao.setText(produto.getDescricao().toString());

            TextView qtd_atual = (TextView) view.findViewById(R.id.qtd_atual);
            qtd_atual.setText(produto.getQuantidadeAtual() != null ? produto.getQuantidadeAtual().toString() : "0");

            TextView qtdSolicitada = (TextView) view.findViewById(R.id.qtd_solicitada);
            qtdSolicitada.setText(produto.getQuantidadeSolicitada().toString());
        }

        return view;
    }
}
