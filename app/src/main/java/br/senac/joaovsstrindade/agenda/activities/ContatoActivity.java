package br.senac.joaovsstrindade.agenda.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import br.senac.joaovsstrindade.agenda.R;
import br.senac.joaovsstrindade.agenda.dao.ContatoDAO;
import br.senac.joaovsstrindade.agenda.model.ContatoEntity;
import br.senac.joaovsstrindade.agenda.model.EnderecoEntity;

public class ContatoActivity extends AppCompatActivity {

    ContatoEntity contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        Intent intent = getIntent();

         contato = (ContatoEntity) intent.getSerializableExtra("contato");
        if(contato != null){
            EditText NomeEditText = findViewById(R.id.NomeEditText);
            EditText TelefoneEditText = findViewById(R.id.TelefoneEditText);
            RatingBar pontuacaoratingBar = findViewById(R.id.pontuacaoratingBar);

            NomeEditText.setText(contato.getNome());
            TelefoneEditText.setText(contato.getTelefone());
            pontuacaoratingBar.setProgress(contato.getPontuacao().intValue());
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_salvar, menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_salvar:

                EditText nomeEditTest = findViewById(R.id.NomeEditText);
                EditText telefoneeditText = findViewById(R.id.TelefoneEditText);
                EditText ruaEditTest = findViewById(R.id.RuaEditText);
                EditText numeroEditTest = findViewById(R.id.NumeroEditText);
                EditText cidadeEditTest = findViewById(R.id.CidadeEditText);

                EditText emailEditText = findViewById(R.id.EmailEditText);
                RatingBar pontuacaoRantingBar = findViewById(R.id.pontuacaoratingBar);

                if (contato != null){
                    contato.setNome(nomeEditTest.getText().toString());
                    contato.setEmail( emailEditText.getText().toString());
                    contato.setTelefone( telefoneeditText.getText().toString());
                    contato.setPontuacao(  Double.valueOf(pontuacaoRantingBar.getProgress()));
                } else {

                    contato = new ContatoEntity(nomeEditTest.getText().toString(),
                            emailEditText.getText().toString(),
                            telefoneeditText.getText().toString(),
                            Double.valueOf(pontuacaoRantingBar.getProgress()))
                    ;
                }
                ContatoDAO contatoDAO = new ContatoDAO( ContatoActivity.this);

                contatoDAO.salvar(contato);

                EnderecoEntity endereco = new EnderecoEntity(ruaEditTest.getText().toString()
                        ,numeroEditTest.getText().toString(),cidadeEditTest.getText().toString());



                Toast.makeText(ContatoActivity.this,"Contato Salvo!"   ,  Toast.LENGTH_SHORT).show();
                Intent main = new Intent (ContatoActivity.this, MainActivity.class);
                startActivity(main);

                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
