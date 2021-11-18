package com.codeWithUtkarsh.kafka.model;

public class Registration {
    long sequenceNumber;
    String name;
    
    public Registration() {
	}
    

	public Registration(long sequenceNumber, String name) {
		super();
		this.sequenceNumber = sequenceNumber;
		this.name = name;
	}


	public long getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}

