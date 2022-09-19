package com.shenjiafa.domain;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
public class Book {
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
    private Double price;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
