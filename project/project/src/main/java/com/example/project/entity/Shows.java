package com.example.project.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Shows")
public class Shows {
    @Id
    @SequenceGenerator(
            name = "Shows_sequence",
            sequenceName = "Shows_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Shows_sequence"
    )
    private long Show_Id;
    private long Slot_No;
    private Date FromDate;
    private Date ToDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "hallId",
            referencedColumnName = "HallId"
    )
    private Hall hall;

}
