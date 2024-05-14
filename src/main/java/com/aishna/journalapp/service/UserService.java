package com.aishna.journalapp.service;

import com.aishna.journalapp.entity.JournalEntry;
import com.aishna.journalapp.entity.User;
import com.aishna.journalapp.repository.JournalEntryRepository;
import com.aishna.journalapp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user) {
           userRepository.save(user);
    }
    public List<User> getAll() {
        return userRepository.findAll();
    }
    public Optional<User> findById(ObjectId id) {
        return userRepository.findById(id);
    }
    public void deleteById(ObjectId id) {
        userRepository.deleteById(id);
    }
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}