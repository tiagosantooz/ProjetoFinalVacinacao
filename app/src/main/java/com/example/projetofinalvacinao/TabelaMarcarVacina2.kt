package com.example.projetofinalvacinao

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaMarcarVacina2 (db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db
    fun cria() {
        db.execSQL("CREATE TABLE $NOME_TABELA (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_DATA_2A_MARCACAO INTEGER NOT NULL, $CAMPO_DATA_IMUNIDADE INTEGER NOT NULL)")
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

        const val NOME_TABELA = "Marcacao 2"
        const val CAMPO_DATA_2A_MARCACAO = "Data 2a marcacao"
        const val CAMPO_DATA_IMUNIDADE = "Data total imunizaçao"

        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, CAMPO_DATA_2A_MARCACAO, CAMPO_DATA_IMUNIDADE)
    }
}
