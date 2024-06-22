package com.eventostec.api.domain.cupon;

import com.eventostec.api.domain.eventos.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table (name = "coupon")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private UUID id;

    private Integer discount;
    private String code;
    private Date valid;

    @ManyToOne //Muitos pra um
    @JoinColumn(name = "event_id")
    private Event event;
}
