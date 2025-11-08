package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class TrainerEntity {

    @Id
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
