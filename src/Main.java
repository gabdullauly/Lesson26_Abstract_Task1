/*
In main class create 5 users, 5 employees.  Create array of humans. Create 3 methods
1) Sort array by human name and print all data - отсортировать массив по имени и вывести все данные
2) Sort array by human age and print all data
3) Print Only Employee whose salary is more than 200000tenge
 */

public class Main {
    public static void sortByName (Human[] humans){
        for(int i=0; i< humans.length-1; i++){
            for(int j=0; j< humans.length-i-1; j++){
                if(humans[j].getName().compareTo(humans[j+1].getName())>0){
                    Human temp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = temp;
                }
            }
        }
    }
    public static void sortByAge(Human[] humans){
        for (int i=0; i< humans.length-1; i++){
            for (int j=0; j<humans.length-i-1; j++){
                if(humans[j].getAge()>humans[j+1].getAge()){
                    Human temp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = temp;
                }
            }
        }
    }
    public static void printOnlyEmp(Human[] humans){
        Employee[] employees;
        int sum = 0;
        for (int i=0; i< humans.length; i++){
            if (humans[i] instanceof Employee){
                sum = sum + 1;
            }
        }
        employees = new Employee[sum];
        int index =0;
        for (int i=0; i< humans.length; i++) {
            if (humans[i] instanceof Employee){
                employees[index] = (Employee) humans[i];
                index = index +1;
            }
        }
        for (int i=0; i< employees.length; i++){
            if (employees[i].getSalary()>200000){
                employees[i].printData();
            }
        }
    }
    public static void main (String[] args){
        User user1 = new User("Jandos", 32, "Jan", "Q123");
        User user2 = new User("Samal", 27, "Sammy", "S123");
        User user3 = new User("Aisana", 4, "Ais", "A123");
        User user4 = new User("Ainazar", 1, "Dinozavr", "D123");
        User user5 = new User("Tumekul", 62, "Tanya", "T123");

        Employee employee1 = new Employee("Neymar", 30, "N10", "Left-Winger", 350000);
        Employee employee2 = new Employee("Ramos", 36, "R4", "Left-Back", 120000);
        Employee employee3 = new Employee("Kimpembe", 27, "K3", "Centre-Back", 150000);
        Employee employee4 = new Employee("Messi", 35, "M30", "Right-Winger", 260000);
        Employee employee5 = new Employee("Donnarumma", 22, "D50", "Goalkeeper", 210000);

        Human[] humans = {user3, user1, user4,user2, user5, employee1, employee3, employee5, employee4, employee2};

//        sortByName(humans);
//        for (int i=0; i< humans.length; i++){
//            humans[i].printData();
//        }

//        sortByAge(humans);
//        for (int i=0; i< humans.length; i++){
//            humans[i].printData();
//        }

        printOnlyEmp(humans);

    }
}
