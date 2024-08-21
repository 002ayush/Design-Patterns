package com.builderdesignpattern;
/*Builder design pattern helps us to overcome the usage of multiple parameters passing simultaneously inside the constructor like in factory design pattern and we have to remember the sequence of it and if any parameters are optional then we have to do constructor overloading also.In short if the object contains many attributes then it is not possible to send multiple attributes into it and gives the heavy load and responsibility to the factory class only.To avoid we come up will Builder Class...
*/
public class User {

    public final int salary;
    public final String name;
    public final String emailId;
    private User(UserBuilder builder){
        this.salary = builder.salary;
        this.name = builder.name;
        this.emailId = builder.emailId;
    }
    public String emailId() {
        return emailId;
    }



    public String getName() {
        return name;
    }



    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    //InnerClass UserBuilder for building it;
    static class UserBuilder{
        public  int salary;
        public  String name;
        public  String emailId;
        public UserBuilder(){}
        public UserBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        public User build(){
            User user = new User(this);
            return user;

        }
    }
}
