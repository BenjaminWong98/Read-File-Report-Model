package com.benjamin.ReadFileReportModel.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Locations")
@Data
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    @Column(length = 255)
    private String locationName;

    @Column(length = 2)
    private String country;

    @Column(length = 255)
    private String geoCoordinates;

    @Column(nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

}
