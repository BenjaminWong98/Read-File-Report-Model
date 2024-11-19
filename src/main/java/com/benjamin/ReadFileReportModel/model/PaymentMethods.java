package com.benjamin.ReadFileReportModel.model;

import com.benjamin.ReadFileReportModel.constant.MethodName;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PaymentMethods")
@Data
public class PaymentMethods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentMethodId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MethodName methodName;

    @Column(length = 50)
    private String processorName;

    @Column(nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

}
