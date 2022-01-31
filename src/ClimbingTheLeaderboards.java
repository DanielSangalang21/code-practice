import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ranked = Arrays.asList(100,100,50,40,40,20,10);
		
		List<Integer> scores = Arrays.asList(5,25,50,120);
		
		List<Integer> c = climbingLeaderboard(ranked, scores);
	
		for (int s : c) {
			System.out.println(s);
		}
	}

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		// Write your code here
		List<Integer>  distinct = ranked.stream().distinct().collect(Collectors.toList());
		List<Integer> ranking = new ArrayList<>();
	
		int rank = distinct.size();
		for (int j : player) {
			while (rank-1>=0 && j >= distinct.get(rank - 1)) {
				rank--;
			}
			ranking.add(rank+1);
		}
		return ranking;
	}

	public static int checkRank(List<Integer> ranked, int score) {

		List<Integer>  distinct = ranked.stream().distinct().collect(Collectors.toList());
		int ranking=0;
		for (int i = 0; i < distinct.size(); i++) {
			if(score > distinct.get(i) || score == distinct.get(i)) {
				ranking = i+1;
				break;
			}ranking = distinct.size() + 1;
		}
		return ranking;
	}
	
	public static int checkRank2(List<Integer> ranked, List<Integer> player) {

		List<Integer>  distinct = ranked.stream().distinct().collect(Collectors.toList());
		Collections.reverse(player);
		int ranking=0;
		for (int i = 0; i < distinct.size(); i++) {
			for (int j: player) {
				if(j > distinct.get(i) || j == distinct.get(i)) {
					ranking = i+1;
					break;
				}ranking = distinct.size() + 1;
			}
		}
		return ranking;
	}

}
