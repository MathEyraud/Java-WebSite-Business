# akdemia-business

## Description
Le projet Akdemia est une application de gestion de formation en ui permet à l'utilisateur de planifier, gérer et suivre des programmes de formation.

## Fonctionnalités principales
- Gestion des entreprises et des apprenants  
- Gestion des utilisateurs
- Gestion des formations 
- Plannification et Suivi des sessions de formation
## Démarrage
1. Clonez ce dépôt sur votre machine locale. 
2. Assurez-vous d'avoir JDK (version 17 ou supérieure) et Maven (Maven) installé.
3. Exécutez la commande mvn install pour installer les dépendances et construire le projet. 
4. Configurez les informations de connexion à la base de données, dans le fichier `application.yml`.

## Procédure pour exécuter les tests unitaires
Ce projet utilise des tests unitaires pour vérifier le bon fonctionnement du code. Voici comment exécuter ces tests unitaires
### Prérequis
- Créer la base de données akdemia_test (MySQL)
- Configurer la source des données tests et vos identifiants dans le fichier application properties de test : `src/test/resources/application.yml`.
### Exécution des tests unitaires

Une fois les dépendances installées, vous pouvez exécuter les tests unitaires en utilisant la commande suivante : `mvn test`
Cela exécutera l'ensemble des tests unitaires définis. Les résultats des tests seront affichés dans la console.