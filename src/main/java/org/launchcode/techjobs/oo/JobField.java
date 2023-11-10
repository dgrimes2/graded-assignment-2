package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
//   they all use id, nextid, value
//    getid(), getvalue(), setvalue()
//    this(), this.id, this.value
//
    public int id;
    public static int nextId = 1;
    public String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() { return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
