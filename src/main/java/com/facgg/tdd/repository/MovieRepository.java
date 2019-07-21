package com.facgg.tdd.repository;

import com.facgg.tdd.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : 김윤호
 * @version :
 * @date : 2019-07-21 23:23
 */
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
