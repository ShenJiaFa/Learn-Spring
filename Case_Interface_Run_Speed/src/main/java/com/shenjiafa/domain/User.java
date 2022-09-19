package com.shenjiafa.domain;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/19
 */
public class User {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * gender
     */
    private Character gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
