public class Game {
    private String arrs[][] =
            {
                    {"scissors","paper"},
                    {"paper","rock"},
                    {"rock","lizard"},
                    {"spock","scissors"},
                    {"scissors","lizard"},
                    {"lizard","paper"},
                    {"paper","spock"},
                    {"spock","rock"},
                    {"rock","scissors"},
            };
    Game(){};
    Game(String player1, String player2){
        String winner = "";
        for(int i = 0; i <= 8; i++){
            if(player1 == arrs[i][0] && player2 == arrs[i][1]){
                winner = "Player 1 Won!";
            }
            if(player2 == arrs[i][0] && player1 == arrs[i][1]){
                winner = "Player 2 Won!";
            }
            if(player1 == player2){
                winner = "Draw!";
            }
        }
        System.out.println(winner);
    }
}
