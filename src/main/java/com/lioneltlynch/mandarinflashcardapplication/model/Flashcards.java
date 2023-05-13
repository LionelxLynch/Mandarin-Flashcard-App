package com.lioneltlynch.mandarinflashcardapplication.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flashcards")
@Data // Use lombok to generate boiler plate code
@NoArgsConstructor // Creates empty Constructor
public class Flashcards {
    // Constructor
    public Flashcards(String front, String back, String pinyin, int difficulty) {
        this.front = front;
        this.back = back;
        this.pinyin = pinyin;
        this.difficulty = difficulty;
    }

    // Lets Spring know it's a managed ID
    @Id
    private ObjectId id;

    // DB fields
    private String front;
    private String back;
    private String pinyin;
    private int difficulty;
}
