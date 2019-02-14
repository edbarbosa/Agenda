package br.senac.joaovsstrindade.agenda.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import br.senac.joaovsstrindade.agenda.R;
import br.senac.joaovsstrindade.agenda.model.ContatoEntity;

public class ContatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        // Ação de click no salvar
        Button salavarcontatoButton = findViewById(R.id.SalvarContatoButton);
        salavarcontatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText nomeEditTest = findViewById(R.id.NomeEditText);
                EditText telefoneeditText = findViewById(R.id.TelefoneEditText);
                EditText ruaEditTest = findViewById(R.id.RuaeditText);
                EditText numeroEditTest = findViewById(R.id.numeroEditTest);
                EditText cidadeEdi

                EditText emailEditText = findViewById(R.id.EmailEditText);
                RatingBar pontuacaoRantingBar = findViewById(R.id.pontuacaoratingBar);


                ContatoEntity contato = new ContatoEntity(nomeEditTest.getText().toString(),
                        emailEditText.getText().toString(),
                        telefoneeditText.getText().toString(),
                        Double.valueOf(pontuacaoRantingBar.getProgress()))
                        ;




                Toast.makeText(ContatoActivity.this,"Contato Salvo!" + contato,  Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
