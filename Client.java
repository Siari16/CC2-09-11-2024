class Client {
    private final String nom;
    private final String ville;
    private final Compte comptePrive;
    private final Compte compteEpargne;

    public Client(String nom, String ville, double soldePrive, double tauxPrive, double soldeEpargne, double tauxEpargne) {
        this.nom = nom;
        this.ville = ville;
        this.comptePrive = new Compte(soldePrive, tauxPrive);
        this.compteEpargne = new Compte(soldeEpargne, tauxEpargne);
    }

    public void afficherClient() {
        System.out.println("Client " + nom + " de " + ville);
        System.out.println("Compte privé : " + comptePrive);
        System.out.println("Compte d'épargne : " + compteEpargne);
    }

    public void bouclerComptes() {
        comptePrive.bouclerCompte();
        compteEpargne.bouclerCompte();
    }
}
