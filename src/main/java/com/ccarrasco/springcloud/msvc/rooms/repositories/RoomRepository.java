package com.ccarrasco.springcloud.msvc.rooms.repositories;

import com.ccarrasco.springcloud.msvc.rooms.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository  extends JpaRepository<Room, Long> {
}
