package com.ne0t0n.usersstore;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;

import java.util.Objects;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;


public class User {

    public static final Table<Record> TABLE = table("users");
    public static final Field<Long> ID_COLUMN = field("id", Long.class);
    public static final Field<String> NAME_COLUMN = field("name", String.class);
    public static final Field<Integer> AGE_COLUMN = field("age", Integer.class);

    private final Long id;
    private final String name;
    private final Integer age;

    public User(Long id, final String name, final Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId().equals(user.getId()) &&
                getName().equals(user.getName()) &&
                getAge().equals(user.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge());
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
