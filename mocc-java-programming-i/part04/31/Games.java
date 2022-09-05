public class Games {
    private String team1;
    private String team2;
    private int scoreTeam1;
    private int scoreTeam2;

    public Games(String team1,String team2,int scoreTeam1,int scoreTeam2){
        this.team1 = team1;
        this.team2 = team2;
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

    public boolean getWin(String team){
        if(team.equals(team1)){
            if (scoreTeam1 > scoreTeam2){
                return true;
            }
        }else if (team.equals(team2)) {
            if (scoreTeam1 < scoreTeam2) {
                return true;
            }
        }
            return false;

    }

    public boolean getLose(String team){
        if(team.equals(team1)){
            if (scoreTeam1 < scoreTeam2){
                return true;
            }
        }else if (team.equals(team2)) {
            if (scoreTeam1 > scoreTeam2) {
                return true;
            }
        }

        return false;

    }

    public boolean getMatch(String team){
        if (team.equals(team1) || team.equals(team2)){
            return true;
        }else {
            return false;
        }
    }
}
