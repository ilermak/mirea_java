package ex_13;

public class Adria {
    int experience;
    String name = "Adria";

    public void setExperience(int experience) throws Exception {
        if (experience > 99999) {
            throw new OutOfLevelException();
        }
        if (experience < 1) {
            throw new Exception();
        }
        this.experience = experience;
    }

    public void setName(String name) {
        throw new NameException();
    }

    @Override
    public String toString() {
        return "Adria{" +
                "experience=" + experience +
                '}';
    }
}