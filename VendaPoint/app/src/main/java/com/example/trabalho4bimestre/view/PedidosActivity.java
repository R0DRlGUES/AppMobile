package com.example.trabalho4bimestre.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.trabalho4bimestre.R;
import com.example.trabalho4bimestre.adapter.PedidosListaAdapter;
import com.example.trabalho4bimestre.controller.PedidosController;
import com.example.trabalho4bimestre.model.Pedidos;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PedidosActivity extends AppCompatActivity{

    private FloatingActionButton btCadastrarPedido;
    private AlertDialog dialog;
    private PedidosController controller;
    private EditText edCliente;
    private EditText edItem;
    private EditText edQuantidade;
    private View viewAlert;
    private RecyclerView rvPedidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        controller = new PedidosController(this);
        rvPedidos = findViewById(R.id.rvPedidos);
        btCadastrarPedido = findViewById(R.id.btCadastrar);
        btCadastrarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCadastroPedidos();
            }
        });

        atualizarListaPedidos();
    }

    private void abrirCadastroPedidos() {
        viewAlert = getLayoutInflater().inflate(R.layout.dialog_cadastro_pedido, null);

        edCliente = viewAlert.findViewById(R.id.edCliente);
        edItem = viewAlert.findViewById(R.id.edItem);
        edQuantidade = viewAlert.findViewById(R.id.edQuantidade);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("CADASTRO DE PEDIDOS");
        builder.setView(viewAlert);
        builder.setCancelable(false);

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("Salvar", null);

        dialog = builder.create();
        dialog.setOnShowListener(dialogInterface -> {
            Button bt = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {salvarDados();}
            });
        });
        dialog.show();
    }

    public void salvarDados() {
        String retorno = controller.salvarPedido(edCliente.getText().toString(), edItem.getText().toString(), edQuantidade.getText().toString());

        if (retorno != null) {
            if (retorno.contains("CLIENTE")) {
                edCliente.setError(retorno);
                edCliente.requestFocus();
            }
            if (retorno.contains("ITEM")) {
                edItem.setError(retorno);
                edItem.requestFocus();
            }
            if (retorno.contains("QUANTIDADE")) {
                edQuantidade.setError(retorno);
                edQuantidade.requestFocus();
            }
        } else {
            Toast.makeText(this,
                    "Sucesso!",
                    Toast.LENGTH_LONG).show();

            dialog.dismiss();
            atualizarListaPedidos();
        }
    }

    private void atualizarListaPedidos () {
        ArrayList<Pedidos> listaPedidos = controller.retornarPedidos();
        PedidosListaAdapter adapter = new PedidosListaAdapter(listaPedidos, this);
        rvPedidos.setLayoutManager(new LinearLayoutManager(this));
        rvPedidos.setAdapter(adapter);
    }
}
