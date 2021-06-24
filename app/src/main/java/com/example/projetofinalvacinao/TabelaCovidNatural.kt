package com.example.projetofinalvacinao

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaCovidNatural (db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db

    fun cria() {
        db.execSQL("CREATE TABLE $NOME_TABELA (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT $CAMPO_DATA_INFEÇÃO INTEGER NOT NULL, $CAMPO_SINTOMAS TEXT NOT NULL, $CAMPO_DATA_VACINA)")
    }

    fun insert(values: ContentValues): Long {
        return db.insert(NOME_TABELA, null, values)
    }

    fun update(values: ContentValues, whereClause: String, whereArgs: Array<String>): Int {
        return db.update(NOME_TABELA, values, whereClause, whereArgs)
    }

    fun delete(whereClause: String, whereArgs: Array<String>): Int {
        return db.delete(NOME_TABELA, whereClause, whereArgs)
    }

    fun query(
        columns: Array<String>,
        selection: String?,
        selectionArgs: Array<String>?,
        groupBy: String?,
        having: String?,
        orderBy: String?
    ): Cursor? {
        return db.query(NOME_TABELA, columns, selection, selectionArgs, groupBy, having, orderBy)
    }

    companion object {
        const val NOME_TABELA = "covid natural"
        const val CAMPO_DATA_INFEÇÃO = "data infeção"
        const val CAMPO_SINTOMAS = "sintomas da infeção"
        const val CAMPO_DATA_VACINA = "data possivel da vacina"


        val TODAS_COLUNAS = arrayOf(CAMPO_DATA_INFEÇÃO, CAMPO_SINTOMAS, CAMPO_DATA_VACINA)
    }
}
