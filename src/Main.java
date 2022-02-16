/*
Abstract Class Human
-int name
-int age
Getter/setter

Constructor default+param
Abstract void printData()

Class User extends Human
- String username
- String password
Constructor default+param
Getter/setter
override void printData()

 Class Employee extends Human
- String employeeId
- String jobname;
- Int salary
Constructor default+param
override void printData()
Getter/setter
In main class create 5 users, 5 employees.  Create array of humans. Create 3 methods
1) Sort array by human name and print all data - отсортировать массив по имени и вывести все данные
2) Sort array by human age and print all data
3) Print Only Employee whose salary is more than 200000tenge
 */

public class Main {
    public static void sortByName(Human[] humans){
        for (int i=0; i< humans.length-1; i++){
            for (int j=0; j<humans.length-i-1; j++){
                if(humans[j].getName().compareTo(humans[j+1].getName())>0){
                    Human temp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {
        User user1 = new User("Jandos", 32, "GQ", "GQ123");
        User user2 = new User("Samal", 27, "Sammy", "Sam123");
        User user3 = new User("Aisana", 4, "Ais", "Ais123");
        User user4 = new User("Ainazar", 1, "Neo", "Neo123");
        User user5 = new User("Tumekul", 62, "Tanya", "Tan123");

        Employee employee1 = new Employee("Jandos", 32, "J111", "IT-man", 800000);
        Employee employee2 = new Employee("Samal", 27, "S111", "management", 1000000);
        Employee employee3 = new Employee("Aisana", 4, "A111", "School-girl", 1500000);
        Employee employee4 = new Employee("Ainazar", 1, "A222", "Play-boy", 1800000);
        Employee employee5 = new Employee("Tumekul", 62, "T111", "Pension", 150000);

        Human[] humans = {user3, user5, user2, user1, user4, employee1, employee3, employee5, employee4, employee2};

        sortByName(humans);
        for (int i=0; i< humans.length; i++){
            humans[i].printData();
        }
    }
}
