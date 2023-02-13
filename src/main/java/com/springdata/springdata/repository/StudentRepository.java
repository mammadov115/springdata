
package com.springdata.springdata.repository;
import com.springdata.springdata.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


// <Student,Integer> bu crud prosesinin uzerinde icra edileceyi classi bildirir. Integer ise primarkeyin typeidir.
public interface StudentRepository extends JpaRepository<Student,Integer> {    
    
}
