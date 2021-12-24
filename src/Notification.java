class Notification extends BoiteMail{
    BoiteMail boite ;
    Notification(BoiteMail boite) {
        super(boite.getExpediteur());
        this.boite = boite;
    }

    Mail getMail(int i) {

        return boite.getMail(i);
    }

    String getExpediteur() { return boite.getExpediteur(); }
    int getNbMails() { return boite.getNbMails();}
    void setNbMails(int n) { boite.setNbMails(n); }

    void recoit(Mail m) {
        boite.recoit(m);
    }

    void ecrit(String destinataire, String sujet, String contenu) {
        boite.ecrit(destinataire,sujet,contenu);
    }


}
