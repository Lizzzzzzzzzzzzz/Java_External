package Model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {

    private String name;
    private List<Department> departments;

    public Shop(String name) {
        this.name = name;
        departments = new ArrayList<Department>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDepart(String depName, String depLocation) {
        departments.add(new Department(depName, depLocation));
    }

    public void removeDepart(String depName) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).name.equals(depName)) {
                departments.remove(i--);
            }
        }
    }

    public void sortDeparts() {
        departments.sort(new Comparator<Department>() {
            @Override
            public int compare(Department t1, Department t2) {
                return t1.name.compareTo(t2.name);
            }
        });
    }

    public void supply(String departName, String product) {
        for (Department department : departments) {
            if (department.name.equals(departName)) {
                department.products.add(product);
            }
        }
    }

    class Department {
        private String name;
        private String location;
        private List<String> services;
        private List<String> products;

        public Department() {
        }

        public Department(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public void Department(String name, String location, List<String> services, List<String> products) {
            this.name = name;
            this.location = location;
            this.services = services;
            this.products = products;
        }
    }

}
