package org.godzzo.sb.sbkvscone.repository

import org.godzzo.sb.sbkvscone.domain.User
import org.godzzo.sb.sbkvscone.domain.UserHistory
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.test.annotation.Rollback

@DataJpaTest
@AutoConfigureTestDatabase(
    replace=AutoConfigureTestDatabase.Replace.NONE
)
class TestUserRepository(
    @Autowired
    private val repository: UserRepository
) {
    private val logger = LoggerFactory.getLogger(TestUserRepository::class.java)

    fun doCount(): Long {
        val count = repository.count()

        logger.debug("repository.count: ${count}")

        println("repository.count: ${count}")

        return count
    }

    @Rollback(false)
    @Test
    fun testInsert() {
        val count = doCount()

        val user = User(login = "Random Joe ${count+1}")

        user.history.add(UserHistory(user = user))
        user.history.add(UserHistory(user = user))

        repository.save(user)

        doCount()
    }
}
