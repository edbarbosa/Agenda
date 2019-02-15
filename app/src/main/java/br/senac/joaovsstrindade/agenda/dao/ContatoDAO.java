package br.senac.joaovsstrindade.agenda.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.senac.joaovsstrindade.agenda.model.ContatoEntity;

public class ContatoDAO {

    private SQlitehelper  sqLiteHelper;

    private SQLiteDatabase sqLiteDatabase;

    public ContatoDAO(Context context) {
        this.sqLiteHelper = new SQlitehelper(context);
    }

    public   void salvar(ContatoEntity contato){
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put ("NOME", contato.getNome());
        values.put("TELEFONE" ,contato.getTelefone());
        values.put("PONTUACAO", contato.getPontuacao());

        sqLiteDatabase.insert("CONTATO", null,values);

        sqLiteDatabase.close();
    }
}
