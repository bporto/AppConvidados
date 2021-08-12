package com.example.appconvidados.service.constants

class DatabaseConstants private constructor(){

    /**
     * Tabelas disponíveis no banco de dados
     */

    object GUEST{
        const val TABLE_NAME = "Guest"

        object COLUMNS{
            const val ID = "id"
            const val NAME = "name"
            const val PRESENCE = "presence"
        }
    }

}