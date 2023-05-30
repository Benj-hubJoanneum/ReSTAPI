package at.fhjoanneum.lanfinderkotlin.ReST.api.model

import java.util.*

class LanParty(
        var id: Int,
        var name: String,
        var zipCode: String,
        var city: String,
        var date: GregorianCalendar?,
        var amountMaxPlayers: Int,
        var description: String,
        var organizer: Int,
        games: List<String> = emptyList(),
        registeredPlayers: List<Int> = emptyList()
) {
    var games: List<String> = games
    var registeredPlayers: List<Int> = registeredPlayers
}