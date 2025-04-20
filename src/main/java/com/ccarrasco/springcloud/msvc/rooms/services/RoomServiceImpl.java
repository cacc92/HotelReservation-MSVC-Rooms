package com.ccarrasco.springcloud.msvc.rooms.services;

import com.ccarrasco.springcloud.msvc.rooms.models.Room;
import com.ccarrasco.springcloud.msvc.rooms.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> search() {
        return roomRepository.findAll();
    }
}
