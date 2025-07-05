package com.ahryxx.chat.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ahryxx.chat.entities.Room;

public interface RoomRepository extends MongoRepository<Room, String> {
    // Get room using id
    Room findByRoomId(String roomId);

}
