package com.eventos.tec.domain.coupon;

import com.eventos.tec.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Table(name = "coupon")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private Integer discount;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}