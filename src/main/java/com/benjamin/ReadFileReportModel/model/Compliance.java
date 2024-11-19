package com.benjamin.ReadFileReportModel.model;

import com.benjamin.ReadFileReportModel.constant.AMLStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Compliance")
@Data
public class Compliance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complianceId;

    @Column(length = 50)
    private String taxId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AMLStatus amlStatus;

    @Column(nullable = false)
    private Boolean complianceFlag = false;

    @Column(nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

}
