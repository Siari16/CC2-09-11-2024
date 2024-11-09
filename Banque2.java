public class Banque2 {
    public static void main(String[] args) {
        double tauxPrive = 0.01;
        double tauxEpargne = 0.02;

        // Création des clients
        Client client1 = new Client("Pedro", "Genève", 1000.0, tauxPrive, 2000.0, tauxEpargne);
        Client client2 = new Client("Alexandra", "Lausanne", 3000.0, tauxPrive, 4000.0, tauxEpargne);

        // Affichage des informations des clients avant le bouclement des comptes
        System.out.println("Avant le bouclement des comptes:");
        client1.afficherClient();
        client2.afficherClient();

        // Bouclement des comptes pour chaque client
        client1.bouclerComptes();
        client2.bouclerComptes();

        // Affichage des informations des clients après le bouclement des comptes
        System.out.println("\nAprès le bouclement des comptes:");
        client1.afficherClient();
        client2.afficherClient();
    }
}

