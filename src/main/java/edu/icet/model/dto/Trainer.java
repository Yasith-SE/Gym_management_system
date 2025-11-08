package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Trainer {

    private String trainerId;
    private String name;
    private String address;
    private LocalDateTime dob;
    private String email;
    private String phoneNumber;
    private int experienceYear;
    private  double salary;
    private String qualification;

}
