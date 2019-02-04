package ro.jademy.SpringTutorial.model;

import javax.persistence.*;

@Entity  // This tells Hibernate to make a table out of this class
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "emp_no")
    private Integer empNo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
//
//    @Column(name = "hire_date")
//    private In hireDate;

    @Column(name = "gender")
    private String gender;


    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public LocalDateTime getHireDate() {
//        return hireDate;
//    }
//
//    public void setHireDate(LocalDateTime hireDate) {
//        this.hireDate = hireDate;
//    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
