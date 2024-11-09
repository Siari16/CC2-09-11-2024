class Compte {
    private double solde;
    private final double tauxInteret;

    public Compte(double solde, double tauxInteret) {
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }

    public void bouclerCompte() {
        solde += solde * tauxInteret;
    }

    @Override
    public String toString() {
        return solde + " francs";
    }
}
