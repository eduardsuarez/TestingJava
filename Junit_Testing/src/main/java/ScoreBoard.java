public class ScoreBoard {
    private Integer tie;
    private Integer wins;
    private Integer losses;

    public ScoreBoard() {
        tie = 0;
        wins = 0;
        losses = 0;
    }

    public Integer getTie() {
        return tie;
    }

    public Integer getWin() {
        return wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void incrementsWins(){
        wins++;
    }
    public void incrementsLosses(){
        losses++;
    }
    public void incrementsTie(){
        tie++;
    }

}
