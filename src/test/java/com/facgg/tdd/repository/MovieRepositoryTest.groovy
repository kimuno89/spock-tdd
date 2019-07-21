package com.facgg.tdd.repository

import com.facgg.tdd.domain.Movie
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@SpringBootTest
@Transactional
class MovieRepositoryTest extends Specification {

    @Autowired
    MovieRepository movieRepository

    void setup() {
        movieRepository.save(new Movie("스파이더맨", 9.9))
        movieRepository.save(new Movie("캡틴 아메리카", 7.9))
        movieRepository.save(new Movie("어벤져스", 10))
    }

    void setupSpec() {

    }

    void cleanup() {}

    void cleanupSpec() {

    }

    def "영화를 조회한다."() {
        when:
        List<Movie> movies = movieRepository.findAll()
        then:
        movies.size() == 3
    }
}
