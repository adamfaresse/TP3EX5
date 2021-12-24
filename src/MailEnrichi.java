public class MailEnrichi extends Mail{
    Fichier fichier;
    MailEnrichi(String auteur, String destinataire, String sujet, String contenu) {
        super(auteur, destinataire, sujet, contenu);
    }
    void attache(Fichier fichier){
        this.fichier = fichier;
    }
    Fichier recupere(){
        return this.fichier;
    }
    @Override
    void affiche(){
        super.affiche();
        if(fichier != null ){
            System.out.println("Att :"+fichier.getNom());
        }
    }
}
