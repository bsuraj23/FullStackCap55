package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="HallCapacity")
public class HallCapacity {
    @EmbeddedId
    HallCapacityKey id;
    @ManyToOne
    @MapsId("HallId")
    @JoinColumn(name = "HallId")
    private Hall hall;
    @ManyToOne
    @MapsId("SeatTypeId")
    @JoinColumn(name = "SeatTypeId")
    private SeatType seatType;

    private int SeatCount;
}

