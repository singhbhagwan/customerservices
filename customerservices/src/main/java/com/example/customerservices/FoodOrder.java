package com.example.customerservices;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class FoodOrder {
	@Id
	private int foid;
	private String fname;
	private int fprice;
	private String location;

}
