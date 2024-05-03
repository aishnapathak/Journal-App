package com.aishna.journalapp.service;

import com.aishna.journalapp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import com.aishna.journalapp.repository.JournalEntryRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JournalEntryService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }
    public List<JournalEntry> getAll() {
        return journalEntryRepository.findAll();
    }
    public JournalEntry findById(ObjectId id) {

    }
}