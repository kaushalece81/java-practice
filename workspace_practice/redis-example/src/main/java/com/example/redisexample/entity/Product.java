package com.example.redisexample.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// store as hash in redis so below annotation
@RedisHash("Product")
public class Product {

	@Id
	private int id;
	private String name;
	private int qty;
	private long price;
	
}
