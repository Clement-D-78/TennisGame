public class Player {
    private String name;
    private int score;
    private int jeu;
    private int set;


    //Constructeur

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }


    //Getters

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getJeu() {
        return jeu;
    }

    public int getSet() {
        return set;
    }
    
    //Setters

    public void setName(String name){
        this.name = name;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void setJeu(int jeu){
        this.jeu = jeu;
    }

    public void setSet(int set){
        this.set = set;
    }


    //Fonctions

    public void winPoint() {
       score++;
    }

    public void winJeu(){
        jeu++;
    }

    public void winSet(){
        set++;
    }
}
