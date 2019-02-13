package br.senac.joaovsstrindade.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

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

                EditText emailEditText = findViewById(R.id.EmailEditText);
                RatingBar pontuacaoRantingBar = findViewById(R.id.pontuacaoratingBar);


                String nome = nomeEditTest.getText().toString();
                String telefone = telefoneeditText.getText().toString();
                String email = emailEditText.getText().toString();
                String pontuacao =String.valueOf(pontuacaoRantingBar.getRating());

                Toast.makeText(ContatoActivity.this,"Contato Salvo! Nome: "  + nome +" Tel" + telefone +"E-mail:" + email +"Pomtuação" + pontuacao, Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
