package com.hms.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "micro_users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name="ID")
    private String userId;
    @Column(name="NAME", length = 20)
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name="ABOUT", length = 100)
    private String about;

    @Transient //doesnot store into database
    private List<Rating> ratings = new ArrayList<>();

}
