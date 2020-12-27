package com.stepan.web.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "news")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "title")
    String title;

    @Column(name = "less_description")
    String lessDescription;

    @Column(name = "description")
    String description;

    @OneToOne(cascade = CascadeType.ALL)
    Image image;
}
