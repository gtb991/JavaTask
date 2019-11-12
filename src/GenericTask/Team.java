package GenericTask;

public class Team <sportType extends Sport>{
    private String name ;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
