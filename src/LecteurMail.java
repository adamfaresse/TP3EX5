class LecteurMail extends BoiteMail{
    private Mail lesMails[] = new Mail[100];
    //private int nbMails;
    private int courant; // indice d’un mail dans le tableau lesMails
    //private String expediteur;
    private Serveur serveur = new Serveur(); // serveur de mails
    LecteurMail(String expediteur) {
        super(expediteur);
        //this.expediteur = expediteur;
    }

    @Override
    Mail getMail(int i) {
        return lesMails[i];
    }

    Mail getCourant() { return lesMails[courant]; } // le mail courant
    //String getExpediteur() { return expediteur; }
    Serveur getServeur() { return serveur; }
    @Override
    void recoit(Mail m) {
        lesMails[super.getNbMails()] = m;
        super.setNbMails(super.getNbMails()+1);
    }
    void lit(){ // lit le mail courant
        lesMails[courant].affiche();
    }
    void suivant() { // passe au mail suivant (dans le tableau)
        if(super.getNbMails() == 0)
            System.out.println("Pas de mails");
        else {
            courant ++;

            if(courant == super.getNbMails())
                courant = 0;
        }
    }
    /*void ecrit(String destinataire, String sujet, String contenu) {
        serveur.envoie(new Mail(expediteur, destinataire, sujet, contenu));
    }*/
    void repond(String reponse) { // repond au mail courant
        ecrit(super.getExpediteur(), lesMails[courant].getAuteur(),
                "Re:" + lesMails[courant].getSujet(),
                lesMails[courant].getContenu() + reponse);
    }
    void transfere(String destinataire) { // transfere le mail courant
        ecrit(super.getExpediteur(), destinataire, "Tr:" + lesMails[courant].getSujet(),
                lesMails[courant].getContenu());
    }
}
