package com.elliottbignell.homepix.innodb.innodb.auth_group.generated;

import com.elliottbignell.homepix.innodb.innodb.auth_group.AuthGroup;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.elliottbignell.homepix.innodb.innodb.auth_group.AuthGroup}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthGroupImpl implements AuthGroup {
    
    private String id;
    private String name;
    
    protected GeneratedAuthGroupImpl() {}
    
    @Override
    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
    
    @Override
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
    
    @Override
    public AuthGroup setId(String id) {
        this.id = id;
        return this;
    }
    
    @Override
    public AuthGroup setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "   + Objects.toString(OptionalUtil.unwrap(getId())));
        sj.add("name = " + Objects.toString(OptionalUtil.unwrap(getName())));
        return "AuthGroupImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof AuthGroup)) { return false; }
        final AuthGroup thatAuthGroup = (AuthGroup)that;
        if (!Objects.equals(this.getId(), thatAuthGroup.getId())) { return false; }
        if (!Objects.equals(this.getName(), thatAuthGroup.getName())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getName()));
        return hash;
    }
}