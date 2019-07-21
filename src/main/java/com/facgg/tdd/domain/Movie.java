package com.facgg.tdd.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

/**
 * @author : 김윤호
 * @version :
 * @date : 2019-07-21 23:23
 */

@Entity
@Table(name ="movie")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "rating", nullable = false)
    private double rating;

    @Column(name = "creation", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime creation;

    @Builder
    public Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
}
