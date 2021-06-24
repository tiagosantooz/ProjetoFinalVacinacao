package com.example.projetofinalvacinao

import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns

data class Paciente(var id: Long = -1, var nUtente: Long, var nome: String, var dataNascimento: String)  {
    fun toContentValues(): ContentValues {
        val valores = ContentValues().apply {
            put(TabelaPaciente.CAMPO_UTENTE, nUtente)
            put(TabelaPaciente.CAMPO_NASCIMENTO, dataNascimento)
        }

        return valores
    }

    companion object {
        fun fromCursor(cursor: Cursor): Paciente {
            val colId = cursor.getColumnIndex(BaseColumns._ID)
            val colnumUtente = cursor.getColumnIndex(TabelaPaciente.CAMPO_UTENTE)
            val coldataNascimento = cursor.getColumnIndex(TabelaPaciente.CAMPO_NASCIMENTO)


            val id = cursor.getLong(colId)
            val nUtente = cursor.getLong(colnumUtente)
            val dataNascimento = cursor.getString(coldataNascimento)


            return Paciente(id, nUtente, dataNascimento)
        }
    }
}
