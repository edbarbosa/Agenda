package br.senac.joaovsstrindade.agenda.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQlitehelper extends SQLiteOpenHelper {

    private  static final String DB_NAME = "agenda.senac.db";

    private  static final Integer  DB_VERSION  = 2;

    private final String DB_CREATE_CONTATO = "CREATE TABLE CONTATO (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME TEXT,  TELEFONE TEXT,  PONTUACAO TEXT);";

    private final String DB_CREATE_ENDERECO = "CREATE TABLE ENDERECO (ID INTEGER PRIMARY KEY AUTOINCREMENT, RUA TEXT,  NUMERO TEXT,  CIDADE_ESTADO REAL);";


    public SQlitehelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_CREATE_CONTATO);
        db.execSQL(DB_CREATE_ENDERECO);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 2);
        db.execSQL(DB_CREATE_ENDERECO);
    }
}
