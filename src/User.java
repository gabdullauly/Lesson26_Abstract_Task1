/*
Class User extends Human
- String username
- String password
Constructor default+param
Getter/setter
override void printData()
 */

public class User extends Human {
    private String username;
    private String password;

    public User (){}
    public User (String name, int age, String username, String password){
        super(name, age);
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public void printData(){
        System.out.println(getName()+" "+getAge()+" "+username+" "+password);
    }


}
