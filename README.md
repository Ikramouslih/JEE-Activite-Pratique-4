# JEE-Activite-Pratique-4

L'objectif de cette activite est de créer une application de e-commerce basée sur une architecture de microservices. Le backend a été développé en utilisant le framework Spring Boot en intégrant Vault pour garantir le traitement sécurisé des informations sensibles et Consul pour la découverte des services et la configuration centralisée, tandis que le frontend a été implémenté avec Angular.

<img width="278" alt="Screenshot 2023-12-06 123338" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/87d922e6-398a-49f4-8ca3-d167fa2e3375">


### Travail à faire ###

Créer une application de e-commerce basée sur les micro services :
1. Consul Discovery;
2. Spring Cloud Config;
3. Spring Cloud Gateway;
4. Customer-service;
5. Inventory Service;
6. Order Service;
7. Consul Config (Billing Service);
8. Vault (Billing Service);
9. Frontend Web avec Angular.

=> Vidéos à utiliser comme ressources : 
- Part 1- https://www.youtube.com/watch?v=LPdfVmllSQo
- Part 2 : https://www.youtube.com/watch?v=L0mdrY36tpk
- Part 3 : https://www.youtube.com/watch?v=L36O1edFPJE
- Part 4 : https://www.youtube.com/watch?v=aQRgO2OxC0w
- Part 5 : https://www.youtube.com/watch?v=iMCjDRUXoeM

### Les dépendences utilisées ### 

- **Spring Boot Starter Actuator** : Active les fonctionnalités prêtes pour la production, telles que les vérifications de santé et les points de surveillance, pour une application Spring Boot.
- **Spring Boot Starter Web** : Fournit des composants essentiels pour la construction d'applications web avec Spring MVC.
- **Spring Cloud Starter Consul Config** : Intègre Consul en tant que source de configuration pour les applications Spring Cloud.
- **Spring Cloud Starter Consul Discovery** : Active l'enregistrement et la découverte de services à l'aide de Consul dans un environnement Spring Cloud.
- **Spring Cloud Starter Vault Config** : Intègre HashiCorp Vault en tant que source de configuration pour les applications Spring Cloud.
- **Project Lombok** : Une bibliothèque qui simplifie le code Java en fournissant des annotations pour générer du code répétitif, tel que les getters, setters et constructeurs.
- **Spring Boot Starter Test** : Inclut les dépendances pour tester les applications Spring Boot, y compris JUnit et d'autres outils de test.
- **Spring Cloud Config Server** : Fournit un serveur de configuration centralisé pour les systèmes distribués, permettant la configuration externalisée.
- **Spring Boot Starter Data JPA** : Simplifie la configuration des référentiels Spring Data JPA pour l'accès aux données.
- **Spring Boot Starter Data REST** : Permet la création rapide d'API RESTful en utilisant les référentiels Spring Data.
- **H2 Database (runtime)** : Une base de données en mémoire utilisée pendant le développement et les tests.
- **Spring Cloud Starter Gateway** : Fournit les éléments essentiels pour la construction de passerelles API dans un environnement Spring Cloud.
- **Spring Cloud Starter OpenFeign** : Simplifie l'intégration de clients REST déclaratifs dans une application Spring Cloud.

## Consul : Introduction ##

![consul-server](https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/50553c95-33fb-4721-a31e-a92a87fd1bad)

Consul est un outil et une plateforme conçus pour découvrir et configurer des services dans des environnements de centre de données modernes et dynamiques. Développé par HashiCorp, Consul offre des fonctionnalités telles que la découverte de services, la vérification de l'état de santé et le stockage de clés-valeurs. Il permet aux applications de localiser et de communiquer entre elles de manière efficace, favorisant le développement de systèmes distribués résilients et évolutifs. Consul prend en charge diverses intégrations et est fréquemment utilisé en conjonction avec des technologies telles que Spring Cloud pour améliorer la gestion des microservices.
Le lancement de consul via la commande : `consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=<Your ip address>`

<img width="960" alt="Screenshot 2023-12-06 124317" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/7e084af2-44f0-4444-831d-12e4b7212a6a">

## Vault : Introduction ##

![1_FthyncZhV1hnsmwnsoYqWg](https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/6b45d8c2-50ad-407b-918a-abd00d36238a)

Vault, également créé par HashiCorp, est un outil complet et extensible pour la gestion de secrets et la protection d'informations sensibles. Il offre un moyen sécurisé de stocker et de gérer l'accès à des données confidentielles telles que des mots de passe, des clés API et d'autres informations sensibles. Vault propose des fonctionnalités avancées telles que la rotation automatique des secrets et l'intégration transparente avec différents systèmes d'authentification. C'est une solution polyvalente largement utilisée dans les environnements modernes où la sécurité des données est une préoccupation majeure.
Le lancement de Vault : 

<img width="960" alt="Screenshot 2023-12-06 130948" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/b5c3e188-ebe3-495a-8e1c-e159de366a09">
<img width="960" alt="Screenshot 2023-12-06 124653" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/e659c3ff-63ab-4c4f-8842-ce016d35176d">
<img width="960" alt="Screenshot 2023-12-06 124810" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/44fa4706-7195-41c5-bcb8-d850ec04eb91">
<img width="960" alt="Screenshot 2023-12-06 124836" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/1227a20b-02a0-4e46-942d-0d40929f2032">

## Access aux services par la Gateway sur le port 9999 ##

### customer-service : ###
<img width="960" alt="custom" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/5553cf9f-a0e6-4792-b78b-2a8b4055a87a">

### order-service : ###
<img width="960" alt="Screenshot 2023-12-06 125422" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/91b272d8-7f16-433d-8cb2-31449c6e48d3">

### inventory-service : ###
<img width="960" alt="inventory" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/8e97cdfa-fe17-42ba-b331-02f87bc3e50c">


## L'interface utilisateur et les fonctionnalités implémentées ##

- La liste des produits : 

<img width="960" alt="prods" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/bf677fda-aa7c-4e7a-8128-416130c09999">
<br><br>

- La liste des clients avec la possibilité de consulter leurs commandes :

<img width="960" alt="custoners" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/5515b143-a425-4777-9a8d-66c9d862a55a">
<br><br>

- La liste des commandes d'un client :

<img width="960" alt="orders" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/13903bb8-1895-4e1b-b3dc-fc156813807d">
<br><br>

- Les détails d'une commande d'un client :

<img width="960" alt="detail" src="https://github.com/Ikramouslih/JEE-Activite-Pratique-4/assets/60039200/9a92ee07-4fd0-4a41-90f8-e5e00334fead">
<br><br>
