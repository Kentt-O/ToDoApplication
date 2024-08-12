package com.anything.data.repository;

import com.anything.data.model.Date;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DateRepository extends MongoRepository<Date, String> {
}
