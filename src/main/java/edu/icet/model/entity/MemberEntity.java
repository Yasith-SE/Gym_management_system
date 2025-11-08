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

public class MemberEntity {

    @Id
    private String id;
    private String name;
    private String email;
    private String address;
    private LocalDateTime dob;
    private double BMI;
    private String phoneNumber;
    private double regFee;
    private String subscription;

}
