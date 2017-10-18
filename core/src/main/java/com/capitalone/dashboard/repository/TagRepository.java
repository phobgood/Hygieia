package com.capitalone.dashboard.repository;

import org.bson.types.ObjectId;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.capitalone.dashboard.model.Tag;

public interface TagRepository extends CrudRepository<Tag, ObjectId>, QueryDslPredicateExecutor<Tag> {

	Tag findByCollectorItemIdAndName(ObjectId collectorItemId,String name);
	
}
