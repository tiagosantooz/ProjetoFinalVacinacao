package com.example.projetofinalvacinao

import android.content.ContentValues
import android.database.Cursor

class CovidNatural (var datainf : Long, var sintomas : String, var datavacina : Long) {
    fun toContentValues(): ContentValues {
        val valores = ContentValues().apply {
            put(TabelaCovidNatural.CAMPO_DATA_INFEÇÃO,datainf)
            put(TabelaCovidNatural.CAMPO_SINTOMAS,sintomas)
            put(TabelaCovidNatural.CAMPO_DATA_VACINA,datavacina)

        }

        return valores
    }

    companion object{
        fun fromCursor(cursor: Cursor): CovidNatural {
            val colDataInf = cursor.getColumnIndex(TabelaCovidNatural.CAMPO_DATA_INFEÇÃO)
            val colSintomas = cursor.getColumnIndex(TabelaCovidNatural.CAMPO_SINTOMAS)
            val colDataVac = cursor.getColumnIndex(TabelaCovidNatural.CAMPO_DATA_VACINA)

            val datainf = cursor.getLong(colDataInf)
            val sintomas = cursor.getString(colSintomas)
            val datavacina = cursor.getLong(colDataVac)


            return CovidNatural (datainf, sintomas, datavacina)
        }
    }
}