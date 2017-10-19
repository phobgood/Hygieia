package com.capitalone.dashboard.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="commitdiffsfortag")
public class CommitDiffForTag extends SCM {

	@Id
    private ObjectId id;
	private ObjectId collectorItemId;
    private String tagName; //non-unique
    private String message;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public ObjectId getCollectorItemId() {
		return collectorItemId;
	}
	public void setCollectorItemId(ObjectId collectorItemId) {
		this.collectorItemId = collectorItemId;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
}
