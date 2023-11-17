# Mise en Production - TD2 Jenkins Setup

## Cloner le repository

```bash
git clone --branch TD2 https://github.com/ArnaudBrg/MiseEnProduction.git
```

## Déplacer le répertoire du projet Jenkins

```bash
mv "MiseEnProduction/TD2 - Mise en Production/MiseEnProduction-TD2-JenkinsSetup" .jenkins/jobs/MiseEnProduction-TD2/
```

## Redémarrer Jenkins

Assurez-vous que Jenkins est installé avec Homebrew, puis redémarrez-le en utilisant :

```bash
brew services restart jenkins-lts
```

## Accéder à l'interface Jenkins

Allez sur l'URL [http://localhost:8080/](http://localhost:8080/) dans votre navigateur.

## Lancer les builds depuis Jenkins

Connectez-vous à Jenkins et lancez les builds depuis l'interface.

## Accéder au répertoire du projet Docker

```bash
cd "MiseEnProduction/TD2 - Mise en Production/covid.api"
```

## Exécuter Docker Compose

```bash
docker-compose up
```

## Accéder à l'application Docker

Allez sur [http://localhost:8081/](http://localhost:8081/) pour accéder à votre application Docker.
