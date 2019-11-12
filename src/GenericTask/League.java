package GenericTask;

import java.util.ArrayList;

public class League <sportType extends Sport>{

    private String name;

    private ArrayList<sportType> team = new ArrayList<>();

    public League(String name){this.name = name;}

    public boolean addTeamToLeague(sportType sport){
        if(team.contains(sport)){
            System.out.println("models.Team already exist");
            return  false;
        }else{
            team.add(sport);
            return true;
        }
    }

    public void displayLeague(){
        System.out.println("---"+name+" league---");
        for (int i = 0; i <team.size() ; i++) {
            System.out.println(team.get(i).getName());
        }
    }

}
