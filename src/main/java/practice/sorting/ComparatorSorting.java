package practice.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSorting {


    public static void main(String[] args) {
        //sorting custom object array
        Employee1[] empArr = new Employee1[4];
        empArr[0] = new Employee1(10, "Mikey");
        empArr[1] = new Employee1(5, "Arun");
        empArr[2] = new Employee1(5, "Lisa");
        empArr[3] = new Employee1(1, "Pankaj");

        Arrays.sort(empArr,Employee1.idComparator);

        System.out.println(Arrays.toString(empArr));
    }


}

class Employee1{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee1(int id, String name) {
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

    public static Comparator<Employee1> idComparator = new Comparator<Employee1>() {
        @Override
        public int compare(Employee1 o1, Employee1 o2) {
            return o1.getId()-o2.getId();
        }
    };
}