import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {
    /*
     * Given an array of pairs representing teams that have competed against each other, and an array 
     * containing the result, write a function that returns the winner of the tournament. the arrays have same number of elements and are like:
     * competitions[i] -> results[i], and competitions[i] == [homeTeam, awayTeam]. If results[i] == 0, means awayTeam won against homeTeam and
     * results[i] == 1, homeTeam won against awayTeam. A win is 3 points, loss is 0 points. 
     */
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // O(n) time and O(k) space ; k is number of teams
        String currBestTeam = "";
        HashMap<String, Integer> scores = new HashMap<>();
        int highestScore = 0;

        for(int i = 0; i < competitions.size(); i++){
            int competitionResult = results.get(i);
            String currTeam = competitions.get(i).get(competitionResult == 0 ? 1 : 0);
            int oldScore = scores.containsKey(currTeam) ? scores.get(currTeam) :0;
            int newScore = oldScore + 3;
            if (newScore > highestScore) {
                highestScore = newScore;
                currBestTeam = currTeam;
            }
            scores.put(currTeam, newScore);
        }
        return currBestTeam;
  }
}
