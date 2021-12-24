public class LecteurMail2 extends LecteurMail{
    LecteurMail2(String expediteur) {
        super(expediteur);
    }

    @Override
    void suivant() {
        super.suivant();
        super.lit();
    }
}
