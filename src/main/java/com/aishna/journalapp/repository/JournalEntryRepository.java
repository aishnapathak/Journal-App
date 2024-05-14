package com.aishna.journalapp.repository;
import com.aishna.journalapp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {


}
