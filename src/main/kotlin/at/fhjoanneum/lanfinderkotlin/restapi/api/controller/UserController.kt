package at.fhjoanneum.lanfinderkotlin.restapi.api.controller

import at.fhjoanneum.lanfinderkotlin.restapi.api.model.User
import at.fhjoanneum.lanfinderkotlin.restapi.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class UserController @Autowired constructor(private val userService: UserService) {

    @GetMapping("/user")
    fun getUser(@RequestParam id: Int): User? {
        val user: Optional<User> = userService.getUser(id)
        return if (user.isPresent) user.get() else null
    }
}
