package com.springboot.project.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.project.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId>{

}
