package com.example.projetofinalvacinao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BDVacinacaoOpenHelper (context: Context?)
        : SQLiteOpenHelper(context, NOME_BASE_DADOS, null, VERSAO_BASE_DADOS) {
        /**
         * Called when the database is created for the first time. This is where the
         * creation of tables and the initial population of the tables should happen.
         *
         * @param db The database.
         */
        override fun onCreate(db: SQLiteDatabase?) {
            if (db != null) {
                /* TabelaMarcarVacina1(db).cria()
                TabelaMarcarVacina2(db).cria()
                TabelaCovidNatural(db).cria()
                TabelaPaciente(db).cria() */
            }
        }

        /**
         * Called when the database needs to be upgraded. The implementation
         * should use this method to drop tables, add tables, or do anything else it
         * needs to upgrade to the new schema version.
         *
         *
         *
         * The SQLite ALTER TABLE documentation can be found
         * [here](http://sqlite.org/lang_altertable.html). If you add new columns
         * you can use ALTER TABLE to insert them into a live table. If you rename or remove columns
         * you can use ALTER TABLE to rename the old table, then create the new table and then
         * populate the new table with the contents of the old table.
         *
         *
         * This method executes within a transaction.  If an exception is thrown, all changes
         * will automatically be rolled back.
         *
         *
         * @param db The database.
         * @param oldVersion The old database version.
         * @param newVersion The new database version.
         */
        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        }
        companion object {
            const val NOME_BASE_DADOS = "vacinacao.db"
            const val VERSAO_BASE_DADOS = 1
        }
    }

