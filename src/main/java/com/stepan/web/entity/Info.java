package com.stepan.web.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "info")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "number")
    String number;

    @Column(name = "number_2")
    String number2;

    @OneToOne
    Image logo;

    @OneToOne
    @Column(name = "header_img")
    Image headerImg;

    @OneToOne
    @Column(name = "logo_vk")
    Image logoVk;

    @OneToOne
    @Column(name = "logo_instagram")
    Image logoInstagram;

    @OneToOne
    @Column(name = "logo_twitter")
    Image logoTwitter;

    @OneToOne
    @Column(name = "logo_facebook")
    Image logoFacebook;

    @OneToOne
    @Column(name = "logo_telegram")
    Image logoTelegram;

    @Column(name = "url_vk")
    String urlVk;

    @Column(name = "url_instagram")
    String urlInstagram;

    @Column(name = "url_twitter")
    String urlTwitter;

    @Column(name = "url_facebook")
    String urlFacebook;

    @Column(name = "url_telegram")
    String urlTelegram;

    @Column(name = "description")
    String description;
}
