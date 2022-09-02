package com.tcs.batch2.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Data

@Table("pets")
public class Pet {

	@PrimaryKeyColumn(name="id", ordinal=0, type=PrimaryKeyType.PARTITIONED)
	@Column("id")
	private Integer id;
	
	@PrimaryKeyColumn(name="name", ordinal=0, type=PrimaryKeyType.PARTITIONED)
	@Column("name")
	private String name;
	
}
