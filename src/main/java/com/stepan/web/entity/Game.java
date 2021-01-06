package com.stepan.web.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "game")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "name_game")
    String nameGame;

    @Column(name = "platform")
    String platform;

    @Column(name = "genre")
    String genre;

    @OneToOne(cascade = CascadeType.ALL)
    Image cover;

    @Column(name = "date_released")
    String dateReleased;
}
