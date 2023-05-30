package at.fhjoanneum.lanfinderkotlin.ReST.service

import at.fhjoanneum.lanfinderkotlin.ReST.api.model.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService {

    private val userList: MutableList<User>

    init {
        userList = ArrayList()

        val user1 = User(1, "Ida", 32, "ida@mail.com")
        val user2 = User(2, "John", 28, "john@mail.com")
        val user3 = User(3, "Emma", 35, "emma@mail.com")
        val user4 = User(4, "Mike", 30, "mike@mail.com")
        val user5 = User(5, "Sarah", 27, "sarah@mail.com")

        userList.addAll(listOf(user1, user2, user3, user4, user5))
    }

    fun getUser(id: Int): Optional<User> {
        for (user in userList) {
            if (id == user.id) {
                return Optional.of(user)
            }
        }
        return Optional.empty()
    }
}
