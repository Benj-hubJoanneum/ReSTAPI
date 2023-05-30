package at.fhjoanneum.lanfinderkotlin.ReST.api.controller

import at.fhjoanneum.lanfinderkotlin.ReST.api.model.LanParty
import at.fhjoanneum.lanfinderkotlin.ReST.api.model.User
import at.fhjoanneum.lanfinderkotlin.ReST.service.LanPartyService
import at.fhjoanneum.lanfinderkotlin.ReST.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class LanPartyController @Autowired constructor(private val lanPartyService: LanPartyService) {

    @GetMapping("/lanparty")
    fun getLanParty(@RequestParam id: Int): LanParty? {
        val lanParty: Optional<LanParty> = lanPartyService.getLanParty(id)
        return if (lanParty.isPresent) lanParty.get() else null
    }
}
