package com.glen.dev.jpa;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="post")
public class Posts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	private String id;
	
	private String name;
	
	@Builder
	public Posts(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
