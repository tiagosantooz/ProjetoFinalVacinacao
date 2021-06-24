package com.example.projetofinalvacinao

import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns

data class Marcacao1 (var data: Long, var MarcaVacina: String  ) {
    fun toContentValues(): ContentValues{
        val valores = ContentValues().apply {
            put(TabelaMarcarVacina1.CAMPO_DATA,data)
            put(TabelaMarcarVacina1.CAMPO_MARCA,MarcaVacina)
        }

        return valores
    }

    companion object{
            fun fromCursor(cursor: Cursor): Marcacao1 {
                val colData = cursor.getColumnIndex(TabelaMarcarVacina1.CAMPO_DATA)
                val colMarca = cursor.getColumnIndex(TabelaMarcarVacina1.CAMPO_MARCA)


                val nData = cursor.getLong(colData)
                val nMarca = cursor.getString(colMarca)


                return Marcacao1(nData, nMarca)
        }
    }
}