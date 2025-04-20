package com.ccarrasco.springcloud.msvc.rooms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "rooms")
@Getter @Setter @ToString
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "hotel_id", nullable = false)
    private Long hotelId;

    @Column(name = "room_name", nullable = false)
    private String roomName;

    @Column(name = "room_available", nullable = false)
    private String roomAvailable;

}
