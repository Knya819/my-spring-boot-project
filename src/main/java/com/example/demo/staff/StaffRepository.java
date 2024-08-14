package com.example.demo.staff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Consider using repositories! They are served to manipulate basic CRUD operations. If you need a more
// advanced logic consider implementing it in a Service layer

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
    //No need to write any methods! the methods are auto created for you.
    //example findAll() method (returns a list of all Staff in the table.
}
