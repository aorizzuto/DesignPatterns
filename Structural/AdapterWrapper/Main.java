package Structural.AdapterWrapper;

public class Main {
    
    public static void main(String[] args) {
        /* Class adapter */
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("***************************************");
        /* Object adapter */
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);

    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Alejandro Rizzuto");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Buenos Aires - Argentina");
    }
}
