package ex_2;

public class Dog {
    String nickname = "Buddy";
    int age = 7;

    @Override
    public String toString() {
        return "ex_2.Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public int humanAge() {
        return age*7;
    }
}