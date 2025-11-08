package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Payment {
    private String id;
    private double amount;
    private LocalDateTime paymentDate;


}
