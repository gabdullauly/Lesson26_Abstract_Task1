public class User extends Human{
    private String userName;
    private String password;

    public User(){}
    public User(String name, int age, String userName, String password){
        super(name, age);
        this.userName = userName;
        this.password = password;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public void printData(){
        System.out.println(getName()+" "+getAge()+" "+getUserName()+" "+getPassword());
    }
}
