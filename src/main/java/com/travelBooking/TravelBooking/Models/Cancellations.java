package com.travelBooking.TravelBooking.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@Data
@Entity
public class Cancellations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer cancellationId;
    Date CancellationDate;
}
