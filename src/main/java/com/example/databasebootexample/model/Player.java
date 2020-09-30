package com.example.databasebootexample.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NonNull
    @Column(name = "Name")
    private String name;

    @NonNull
    @Column(name = "Team")
    private String teamName;

    @NonNull
    @Column(name = "Runs")
    private long runsScored;

}
