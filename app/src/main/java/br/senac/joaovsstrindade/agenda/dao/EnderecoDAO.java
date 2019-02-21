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

    private SQLiteDatabase sqLiteDatabase;

    public EnderecoDAO(Context context) {
        sQlitehelper = new SQlitehelper(context);
    }

    public void salvar(EnderecoEntity endereco) {

        sqLiteDatabase = sQlitehelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("RUA", endereco.getRua());
        values.put("NUMERO", endereco.getNumero());
        values.put("CIDADE_ESTADO", endereco.getCidade());

        sqLiteDatabase.insert("ENDERECO", null, values);

        sqLiteDatabase.close();

    }


}





