package com.ccarrasco.springcloud.msvc.rooms.controllers;

import com.ccarrasco.springcloud.msvc.rooms.models.Room;
import com.ccarrasco.springcloud.msvc.rooms.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping
    public ResponseEntity<List<Room>> search() {
        List<Room> rooms = roomService.search();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(rooms);
    }
}
