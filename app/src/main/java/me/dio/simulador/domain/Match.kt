package me.dio.simulador.domain

data class Match(
    val descricao: String,
    val place: Place,
    val homeTeam: Team,
    val awayTeam: Team
)