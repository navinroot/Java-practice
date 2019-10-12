package practice.sorting;

import java.util.Arrays;

public class ComparableSorting {

    public static void main(String[] args) {
        //sorting custom object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey");
        empArr[1] = new Employee(5, "Arun");
        empArr[2] = new Employee(5, "Lisa");
        empArr[3] = new Employee(1, "Pankaj");

        Arrays.sort(empArr);

        System.out.println(Arrays.toString(empArr));
    }

}


class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Accending order
    @Override
    public int compareTo(Employee o) {
        int flag =0;
        flag = this.id - o.id;
        if(flag == 0) flag= this.name.compareTo(o.name);
        return flag;
    }
}