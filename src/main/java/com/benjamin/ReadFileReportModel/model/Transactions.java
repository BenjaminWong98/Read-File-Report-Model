package com.benjamin.ReadFileReportModel.model;

import com.benjamin.ReadFileReportModel.constant.Status;
import com.benjamin.ReadFileReportModel.constant.TransactionType;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Transactions")
@Data
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "sourceAccountId", nullable = false)
    private Accounts sourceAccount;

    @ManyToOne
    @JoinColumn(name = "destinationAccountId")
    private Accounts destinationAccount;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal transactionAmount;

    @Column(nullable = false, length = 3)
    private String currency;

    @Column(precision = 10, scale = 2)
    private BigDecimal fee = BigDecimal.ZERO;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal balanceBefore;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal balanceAfter;

    private String description;

    @Column(length = 50)
    private String purposeCode;

    @ManyToOne
    @JoinColumn(name = "paymentMethodId", nullable = false)
    private PaymentMethods paymentMethod;

    @ManyToOne
    @JoinColumn(name = "authId", nullable = false)
    private Authentications authentications;

    @ManyToOne
    @JoinColumn(name = "locationId")
    private Locations location;

    @ManyToOne
    @JoinColumn(name = "complianceId")
    private Compliance compliance;

    @Column(length = 50)
    private String referenceNumber;

    @Column(length = 50)
    private String errorCode;

    @Column(length = 50)
    private String batchId;

    @Column(nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(nullable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

}
