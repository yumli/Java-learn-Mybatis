package com.camille.mybatis.pojo;

import java.io.Serializable;

public class Emp implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_id
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    private Integer empId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_name
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.salary
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    private Double salary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.department_id
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    private Integer departmentId;

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }

    public Emp(Integer empId, String empName, Double salary, Integer departmentId) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public Emp() {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_id
     *
     * @return the value of t_emp.emp_id
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_id
     *
     * @param empId the value for t_emp.emp_id
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_name
     *
     * @return the value of t_emp.emp_name
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_name
     *
     * @param empName the value for t_emp.emp_name
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.salary
     *
     * @return the value of t_emp.salary
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.salary
     *
     * @param salary the value for t_emp.salary
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.department_id
     *
     * @return the value of t_emp.department_id
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.department_id
     *
     * @param departmentId the value for t_emp.department_id
     *
     * @mbggenerated Sun Feb 27 21:54:44 CST 2022
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}