package com.lioneltlynch.mandarinflashcardapplication.controller;

import com.lioneltlynch.mandarinflashcardapplication.model.Flashcards;
import com.lioneltlynch.mandarinflashcardapplication.service.FlashcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080/mandarin/flashcards")
@RequestMapping("mandarin/flashcards")
public class FlashcardController {
    @Autowired
    private FlashcardService flashcardService;

    @GetMapping
    public ResponseEntity<List<Flashcards>> getAllFlashcards(){
        return new ResponseEntity<List<Flashcards>>(
                flashcardService.pullAllFlashcards(),
                HttpStatus.OK);
    }
}