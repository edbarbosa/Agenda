package br.senac.joaovsstrindade.agenda.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.senac.joaovsstrindade.agenda.model.ContatoEntity;
import br.senac.joaovsstrindade.agenda.model.EnderecoEntity;

public class EnderecoDAO {


            private SQlitehelper sQlitehelper;

            private  SQlitehelper sqLiteDatabase;

            public EnderecoDAO(Context context) { this.sQlitehelper = new sqLiteHelper(Context); }

            public  void  salvar(ContatoEntity endereco){

                sqLiteDatabase = sQlitehelper.getWritableDatabase();

                ContentValues values = new ContentValues();
                values.put("NOME", endereco.getNome());
                values.put("TELEFONE", endereco.getTelefone());
                values.put("PONTUACAO", endereco.getPontuacao());

                SQLiteDatabase. insert( ENDERECO , null, values);

                sqLiteDatabase.close();

            }
            public List(EnderecoEntity) listar(){
                sqLiteDatabase = sqLiteHelper.getReadableDatabase();

                String sql = "SELECT * FROM ENDERECO;";

                Cursor c = sqLiteDatabase.rawQuery(sql, null);

                List<ContatoEntity> Endereco = new ArrayList<>();



            }

        }
}


