package com.lioneltlynch.mandarinflashcardapplication.repository;

import com.lioneltlynch.mandarinflashcardapplication.model.Flashcards;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardRepository extends MongoRepository<Flashcards, ObjectId> {

}