package ro.jademy.SpringTutorial.repository;

import org.springframework.data.repository.CrudRepository;
import ro.jademy.SpringTutorial.model.Employee;

import java.util.List;

public interface EmployRepository extends  CrudRepository<Employee, Integer> {


    // interfata care face legatura cu modelul si care extrage informatiile din DB
    @Override
    List<Employee> findAll();

}
    //return covariant
    //the list is a subclass of Iterable<T>, iterable is a method from CRUD;
