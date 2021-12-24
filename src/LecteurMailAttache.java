public class LecteurMailAttache extends LecteurMail{

    LecteurMailAttache(String expediteur) {
        super(expediteur);
    }
    void traiteAttachement(){
        if(super.getCourant() instanceof MailEnrichi){
            if(((MailEnrichi) super.getCourant()).fichier!=null){
                ((MailEnrichi) super.getCourant()).fichier.execute();
            }
        }
    }
    void transfereEnAttache(String Destinataire){
        getServeur().envoie(new MailEnrichi(getExpediteur(), Destinataire, "", "").attache(new FichierMail(getCourant(),"")));
    }
}
