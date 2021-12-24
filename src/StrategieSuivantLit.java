public class StrategieSuivantLit extends  StrategieSuivant{
    @Override
    void suivant(LecteurMail l) {
        l.suivant();
        l.lit();
    }
}
