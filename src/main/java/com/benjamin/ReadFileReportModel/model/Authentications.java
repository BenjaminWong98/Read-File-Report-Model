package com.benjamin.ReadFileReportModel.model;

import com.benjamin.ReadFileReportModel.constant.AuthMethod;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Authentications")
@Data
public class Authentications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AuthMethod authMethod;

    @Column(length = 50)
    private String authCode;

    @Column(length = 45)
    private String ipAddress;

    @Column(length = 255)
    private String deviceInfo;

    @Column(nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

}
