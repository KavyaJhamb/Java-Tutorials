public class University {
    private String name;

    public University(String name) {
        this.name = name;
    }
    public static class Library {
        private String libraryName;

        public Library(String libraryName) {
            this.libraryName = libraryName;
        }

        public void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }
    }
    public class Department {
        private String departmentName;

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public void displayDepartmentName() {
            System.out.println("Department Name: " + departmentName);
        }
    }

    public static void main(String[] args) {
        University university = new University("Tech University");   
        Library library = new Library("Central Library");
        library.displayLibraryName();    
        Department department = university.new Department("Computer Science");
        department.displayDepartmentName();
    }
}