package com.lara.securityapp2;

import org.springframework.data.repository.CrudRepository;

// Here our primary key is username  which is of type  String So withing the <> we have passed Entity class name and since we have id of type String so we have passed String
public interface PersonRepository extends CrudRepository<Person, String> {
	

}
