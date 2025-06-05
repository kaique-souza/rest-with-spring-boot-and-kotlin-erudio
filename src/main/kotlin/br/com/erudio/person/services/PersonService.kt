package br.com.erudio.person.services

import br.com.erudio.person.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {
    private val counter: AtomicLong = AtomicLong()
    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Procurando uma pessoa!")

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Jose"
        person.lastName = "silva"
        person.address = "osasco"
        person.gender = "male"
        return person
    }

    fun create(person: Person) = person

    fun update(person: Person) = person

    fun delete(id: Long) {}

    fun findAll(): List<Person> {
        logger.info("Procurando todas as pessoas!")

        val persons: MutableList<Person> = ArrayList()
        for (i in 0..7) {
            val person = Person()
            person.id = counter.incrementAndGet()
            person.firstName = "Jose"
            person.lastName = "silva"
            person.address = "osasco"
            person.gender = "male"

            persons.add(person)
        }
        return persons
    }

}