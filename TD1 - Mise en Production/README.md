# Guide d'utilisation pour la visualisation de vidéos dans un conteneur

Ce guide vous montrera comment utiliser Docker Compose pour visionner une vidéo dans un conteneur. Suivez ces étapes pour configurer et exécuter l'environnement Docker.

## Prérequis

- Docker doit être installé sur votre système. Si ce n'est pas déjà fait, suivez les instructions d'installation de Docker pour votre système d'exploitation sur [le site officiel de Docker](https://docs.docker.com/get-docker/).

## Instructions

1. Clonez ce dépôt Git sur votre système local :

   ```bash
   git clone https://github.com/ArnaudBrg/MiseEnProduction.git
   ```

2. Ouvrez un terminal et allez dans votre répertoire 

 ```bash
   cd NomDeVotreRepertoire
   ```

3. Exécutez la commande suivante pour construire et démarrer les conteneurs :

   ```bash
   docker-compose up --build
   ```

4. Une fois que les conteneurs sont en cours d'exécution, ouvrez un navigateur web et accédez à [http://localhost:8080/server.php](http://localhost:8080/server.php). Vous devriez voir une page de serveur.

5. Maintenant, ouvrez une autre page dans votre navigateur (sans fermer l'onglet précédent) en accédant à [http://localhost:8080/client.php](http://localhost:8080/client.php). Vous devriez voir une page cliente.

6. Pour visualiser une vidéo depuis le conteneur, accédez à [http://localhost:8080/video.mp4](http://localhost:8080/video.mp4) dans votre navigateur.

7. Félicitations ! Vous pouvez maintenant visionner une vidéo à partir de votre conteneur Docker.

## Arrêt des conteneurs

Lorsque vous avez terminé, vous pouvez arrêter les conteneurs Docker en revenant au terminal où vous avez exécuté `docker-compose up` et en appuyant sur `Ctrl+C`. Cela arrêtera les conteneurs en cours d'exécution.

