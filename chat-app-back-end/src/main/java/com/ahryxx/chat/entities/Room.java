package com.ahryxx.chat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "rooms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    private String id; // MongoDB: unique identifier
    private String roomId;

    private List<Message> messages = new ArrayList<>();

}
