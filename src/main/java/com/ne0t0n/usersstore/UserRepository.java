package com.ne0t0n.usersstore;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.jooq.impl.DSL.asterisk;

@Repository
public class UserRepository {

    private final DSLContext jooq;

    @Autowired
    public UserRepository(DSLContext jooq) {
        this.jooq = jooq;
    }

    public List<User> findAll() {
        final Result<Record> records = jooq.select(asterisk())
                .from(User.TABLE)
                .fetch();
        return records.stream()
                .map(UserRepository::convert)
                .collect(Collectors.toList());
    }

    public Optional<User> findById(Long id) {
        final Optional<Record> optionalRecord = jooq.select(asterisk())
                .from(User.TABLE)
                .where(User.ID_COLUMN.eq(id))
                .fetchOptional();
        return optionalRecord.map(UserRepository::convert);
    }

    public boolean save(User user) {
        return jooq.insertInto(User.TABLE, User.NAME_COLUMN, User.AGE_COLUMN)
                .values(user.getName(), user.getAge())
                .execute() > 0;
    }

    public boolean deleteById(Long id) {
        return jooq.deleteFrom(User.TABLE)
                .where(User.ID_COLUMN.eq(id))
                .execute() > 0;
    }

    private static User convert(final Record userRecord) {
        return new User(userRecord.get(0, Long.class), userRecord.get(1, String.class), userRecord.get(2, Integer.class));
    }
}
