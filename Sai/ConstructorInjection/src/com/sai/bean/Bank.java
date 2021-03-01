package com.sai.bean;

public class Bank {
 private String id;
 private String name;
 private String branch;
 private AccountHolder acch;
 
 
 public Bank() {
	 
 }


public Bank(String id, String name, String branch, AccountHolder acch) {
	super();
	this.id = id;
	this.name = name;
	this.branch = branch;
	this.acch = acch;
}


@Override
public String toString() {
	return "Bank [id=" + id + ", name=" + name + ", branch=" + branch + ", acch=" + acch + "]";
}


  
}
