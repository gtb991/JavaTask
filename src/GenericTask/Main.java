package GenericTask;

public class Main {

    public static void main(String[] args) {
        FcBarcelona fcbarcelona = new FcBarcelona("FC Barcelona");
        RealMadrid realMadrid =new RealMadrid("Real Madrid");
        Zimbru zimbru = new Zimbru("Zimbru");
        Dacia dacia = new Dacia("Dacia");

        BotanicaBascketballTeam botanicaBascketballTeam = new BotanicaBascketballTeam("Botanica Bascketball models.Team");
        CiocanaBascketballTeam ciocanaBascketballTeam = new CiocanaBascketballTeam("Ciocana Bascketball models.Team");
        RiscaniBscketballTeam riscaniBscketballTeam = new RiscaniBscketballTeam("Riscani Bascketball models.Team");
        CentruBascketballTeam centruBascketballTeam =new CentruBascketballTeam("Centru Bascketball models.Team");

        League<Football> footballLeague = new League("Football");
        footballLeague.addTeamToLeague(fcbarcelona);
        footballLeague.addTeamToLeague(realMadrid);
        footballLeague.addTeamToLeague(zimbru);
        footballLeague.addTeamToLeague(dacia);
//        footballLeague.addTeamToLeague(botanicaBascketballTeam);
//
        footballLeague.displayLeague();

        League<BascketBall> bascketBallLeague= new League("Bascketball");
        bascketBallLeague.addTeamToLeague(botanicaBascketballTeam);
        bascketBallLeague.addTeamToLeague(ciocanaBascketballTeam);
        bascketBallLeague.addTeamToLeague(riscaniBscketballTeam);
        bascketBallLeague.addTeamToLeague(centruBascketballTeam);
        bascketBallLeague.addTeamToLeague(botanicaBascketballTeam);
        bascketBallLeague.displayLeague();
    }
}
