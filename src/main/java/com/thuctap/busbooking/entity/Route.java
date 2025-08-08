package com.thuctap.busbooking.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "idBusRoute")
    BusRoute busRoute;

    @ManyToOne
    @JoinColumn(name = "idBusStation")
    BusStation busStation;

    int routeLocation;
    int status;

    @CreatedDate
    @Column(name = "createdAt")
    LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updatedAt")
    LocalDateTime updatedAt;
}
