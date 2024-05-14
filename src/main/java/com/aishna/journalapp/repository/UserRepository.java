package com.aishna.journalapp.repository;
import com.aishna.journalapp.entity.JournalEntry;
import com.aishna.journalapp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUsername(String username);

}
