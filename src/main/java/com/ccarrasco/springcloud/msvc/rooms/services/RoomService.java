package com.ccarrasco.springcloud.msvc.rooms.services;

import com.ccarrasco.springcloud.msvc.rooms.models.Room;

import java.util.List;

public interface RoomService {
    List<Room> search();
}
