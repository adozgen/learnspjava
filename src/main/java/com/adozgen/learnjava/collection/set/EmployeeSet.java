package com.adozgen.learnjava.collection.set;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeSet implements Comparable {
    protected int no;
    protected String  name;
    protected String  lastName;

    @Override
    public int hashCode() {
        System.out.println("hashCode() on Employee with no: " + no);
        return no;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() on Employee with no: " + no);
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmployeeSet other = (EmployeeSet) obj;
        System.out.println("equals() on Employee with no: " + this + " other Employee with no: " + obj);
        if (no != other.no)
            return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        EmployeeSet other = (EmployeeSet) o;
        int result = 0;
        if (no == other.no)
            result = 0;
        else if (no < other.no)
            result = -1;
        else
            result = 1;
        return result;
    }
}
