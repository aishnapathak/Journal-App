package com.aishna.journalapp.entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true) //fast searching and unique users
    @NonNull
    private String username;
    @NonNull
    private String password;

    @DBRef //creating ref of journal entries in user collection
    private List<JournalEntry> journalEntries=new ArrayList<>();
    private  List<String> roles;

}
