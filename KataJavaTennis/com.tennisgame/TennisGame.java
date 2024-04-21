public class TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame(String Player1, String Player2){
        player1 = new Player(Player1);
        player2 = new Player(Player2);
    }

    public int translateScore( int score) {
        switch (score) {
            case 0:
                return 0;
            case 1:
                return 15;
            case 2:
                return 30;
            case 3:
                return 40;
            default:
                return -1;
        }
    }

    private void resetScore() {
        player1.setScore(0);
        player2.setScore(0);
    }

    private void resetJeu() {
        player1.setJeu(0);
        player2.setJeu(0);
    }

    public String getTotalScore(){

        int score1 = player1.getScore();
        int score2 = player2.getScore();

        // Pour gagner un jeu
        if (score1 >= 4 && score1 - score2 >= 2) {
            player1.winJeu();
            resetScore();
            getSet();
            getJeu();
            return player1.getName() + " gagne le jeu.";
            
        } else if (score2 >= 4 && score2 - score1 >= 2) {
            player2.winJeu();
            resetScore();
            getSet();
            getJeu();
            return player2.getName() + " gagne le jeu.";
        } else if (score1 >= 3 && score2 >= 3 && score1 == score2) {
            return "40A - Egalité";
        } else if (score1 >= 3 && score2 >= 3 ) {
            return "Avantage : " + (score1 > score2 ? player1.getName() : player2.getName())+".";
        } else {
            return translateScore(score1) + "-" + translateScore(score2);
        }

    }


    public void getJeu(){

        int jeu1 = player1.getJeu();
        int jeu2 = player2.getJeu();
        System.out.println(player1.getName()+" à : "+jeu1+" jeux. Et "+player2.getName()+" à : "+jeu2+" jeux." );

    }

    public void getSet(){

        int set1 = player1.getSet();
        int set2 = player2.getSet();

        if (set1 >= 1 || set2 >= 1) {
            System.out.println(player1.getName()+" à : "+set1+" set. Et "+player2.getName()+" à : "+set2+" set." );
        }

    }


    public void winSetMatch(){

        int jeu1 = player1.getJeu();
        int set1 = player1.getSet();

        int jeu2 = player2.getJeu();
        int set2 = player2.getSet();

        //Pour gagner un set
        if (jeu1 >= 6 ) {
            player1.winSet();
            System.out.println("Set pour : "+player1.getName() + ".");
            resetJeu();
        }else if (jeu2 >= 6 ) {
            player2.winSet();
            System.out.println("Set pour : "+player2.getName() + ".");
            resetJeu();
        }

        //Pour gagner le match
        if(set1 == 2){
            System.out.println("Jeu, set et match"+player1.getName() + "à gagné la partie.");
        }else if(set2 == 2){
            System.out.println("Jeu, set et match"+player2.getName() + "à gagné la partie.");
        }

    }

    public void player1Scores() {
        player1.winPoint();
    }

    public void player2Scores() {
        player2.winPoint();
    }

}