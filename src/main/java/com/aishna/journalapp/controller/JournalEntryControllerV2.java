package com.aishna.journalapp.controller;

import com.aishna.journalapp.entity.JournalEntry;
import com.aishna.journalapp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry) { //localhost:8080/journal POST
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId) {
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable ObjectId myId) {
        return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable ObjectId id, @RequestBody JournalEntry myEntry) {
       return null;
    }


}
