package br.senac.joaovsstrindade.agenda.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import br.senac.joaovsstrindade.agenda.R;
import br.senac.joaovsstrindade.agenda.dao.ContatoDAO;
import br.senac.joaovsstrindade.agenda.model.ContatoEntity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = findViewById(R.id.listaContatosListeView);

        final ContatoDAO contatoDAO = new ContatoDAO(this);
        List<ContatoEntity> contatos = contatoDAO.listar();


        ArrayAdapter<ContatoEntity> adapter = new ArrayAdapter<ContatoEntity>(this, android.R.layout.simple_list_item_1, contatos);

        lista.setAdapter(adapter);

        Button novoContato = findViewById(R.id.novoContatoButton);

        novoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(MainActivity.this, ContatoActivity.class);
                startActivity(main);

                finish();

            }
        });

        Button buscarContato = findViewById(R.id.buscarButton);

        buscarContato.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                EditText nomeEditText = findViewById(R.id.buscareditText);

                ContatoDAO contatoDAO = new ContatoDAO(MainActivity.this);
                List<ContatoEntity> contatos = contatoDAO.listarPorNome(nomeEditText.getText().toString());

                ListView lista = findViewById(R.id.listaContatosListeView);
                ArrayAdapter<ContatoEntity> adapter = new ArrayAdapter<ContatoEntity>(MainActivity.this, android.R.layout.simple_list_item_1, contatos);

                lista.setAdapter(adapter);
            }
        });
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContatoEntity contato = (ContatoEntity)lista.getItemAtPosition(position);
                Intent intentContatoActivity = new Intent(MainActivity.this,
                 ContatoActivity.class);
                intentContatoActivity.putExtra("contato", contato);
                startActivity(intentContatoActivity);

            }
        });
    }

}

