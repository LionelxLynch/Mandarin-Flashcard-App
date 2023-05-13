package com.lioneltlynch.mandarinflashcardapplication.service;

import com.lioneltlynch.mandarinflashcardapplication.model.Flashcards;
import com.lioneltlynch.mandarinflashcardapplication.repository.FlashcardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashcardService {
    @Autowired
    private FlashcardRepository flashcardRepository;

    public List<Flashcards> pullAllFlashcards(){
        return flashcardRepository.findAll();
    }
}
