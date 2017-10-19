package com.capitalone.dashboard.repository;

import org.bson.types.ObjectId;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.capitalone.dashboard.model.CommitDiffForTag;

public interface CommitDiffForTagRepository extends CrudRepository<CommitDiffForTag, ObjectId>, QueryDslPredicateExecutor<CommitDiffForTag> {

	CommitDiffForTag findByScmRevisionNumberAndTagName(String scmRevisionNumber, String tagName);
	
}
