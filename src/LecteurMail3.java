public class LecteurMail3 extends LecteurMail{
    StrategieSuivant strategie;
    LecteurMail3(String expediteur) {
        super(expediteur);
    }
    void setStrategieSuivant(StrategieSuivant strategieSuivant){
        strategie = strategieSuivant;
    }

    @Override
    void suivant() {
        strategie.suivant(this);
    }
}
