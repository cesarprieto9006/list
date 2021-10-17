package com.example.list.utils

class SuperAppConstants {

    companion object {

        //Error
        const val TAG_ERROR="Error"

        // URI
        const val URI:String="http://www.nactem.ac.uk/software/"

        // LOGIN SCREEN
        const val EP_LOGIN:String="oauth/token"
        const val GRANT_PASSWORD:String="password"
        const val CLIENT_ID:String="2"
        const val CLIENT_SECRET:String="U0ZRy3Uwo1eIdMzhyIuOB8v62biGbwJ8kjah64ru"
        const val REDIRECT_URI:String="http://localhost"
        const val SCOPE:String="*"

        // HOME SCREEN
        const val EP_ACROMINE:String="acromine/dictionary.py"

        // MANUAL TICKET SCREEN
        const val EP_MANUAL:String="app/appointment/check"

        // HISTORY SCREEN
        const val EP_HISTORY:String="app/entregas"

        // REGISTER TICKET
        const val EP_TICKET_REGISTER:String="app/entregas/register"

        // TICKET STATE
        const val BLOCKED:String="Bloqueado"
        const val SCHEDULE:String="Agendado"
        const val OPEN:String="Abierto"
        const val REGISTER:String="Registrado"
        const val DELIVERED:String="Entregado"

        // STATE ONLY UNITY
        const val YES:String="SI"
        const val NO:String="NO"

        // STATE ONLY UNITY
        const val INAHUTURIZED:String="401"
        const val PARAMETERS:String="422"

        // STATE ONLY UNITY
        const val MANUAL:String="Manual"
        const val SCANNER:String="Scanner"





    }
}