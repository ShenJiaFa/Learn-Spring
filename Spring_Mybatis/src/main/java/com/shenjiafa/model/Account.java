package com.shenjiafa.model;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
public class Account {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * money
     */
    private Double money;

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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
