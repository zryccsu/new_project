package com.baidu.bean;

public class Person {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_person.id
     *
     * @mbg.generated Fri Jun 28 19:20:10 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_person.age
     *
     * @mbg.generated Fri Jun 28 19:20:10 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_person.name
     *
     * @mbg.generated Fri Jun 28 19:20:10 CST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_person.id
     *
     * @return the value of t_person.id
     *
     * @mbg.generated Fri Jun 28 19:20:10 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_person.id
     *
     * @param id the value for t_person.id
     *
     * @mbg.generated Fri Jun 28 19:20:10 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_person.age
     *
     * @return the value of t_person.age
     *
     * @mbg.generated Fri Jun 28 19:20:10 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_person.age
     *
     * @param age the value for t_person.age
     *
     * @mbg.generated Fri Jun 28 19:20:10 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_person.name
     *
     * @return the value of t_person.name
     *
     * @mbg.generated Fri Jun 28 19:20:10 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_person.name
     *
     * @param name the value for t_person.name
     *
     * @mbg.generated Fri Jun 28 19:20:10 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}