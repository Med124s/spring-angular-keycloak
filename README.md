<h1>🔐 Spring Boot – Angular Microservices avec Keycloak</h1>

<h2>📘 Description du projet</h2>
<p>
Ce projet est une implémentation complète d'une <strong>architecture microservices sécurisée</strong> utilisant 
<a href="https://www.keycloak.org/">Keycloak</a> comme serveur d'authentification et d'autorisation, 
intégrée à des services backend en <strong>Spring Boot</strong> et une interface frontend en <strong>Angular</strong>.
</p>

<p>Le projet est divisé en deux parties :</p>

<hr>

<h2>🧩 Partie 1 – Mise en place et configuration de Keycloak</h2>

<h3>✅ Étapes réalisées :</h3>
<ul>
  <li>📥 <strong>Téléchargement de Keycloak 19</strong></li>
  <li>🚀 <strong>Démarrage de Keycloak en mode Quarkus</strong></li>
  <li>👤 <strong>Création d’un compte administrateur via CLI</strong></li>
  <li>🌍 <strong>Création d’un Realm personnalisé</strong></li>
  <li>🛡️ <strong>Création d’un client à sécuriser</strong> (confidential ou public)</li>
  <li>👥 <strong>Ajout d’utilisateurs</strong></li>
  <li>🎭 <strong>Définition des rôles</strong> (utilisateur, admin, etc.)</li>
  <li>🧩 <strong>Attribution des rôles aux utilisateurs</strong></li>
</ul>

<h3>🔍 Tests réalisés via Postman :</h3>
<ul>
  <li>🔐 Authentification par <strong>mot de passe utilisateur</strong></li>
  <li>📜 Analyse du <strong>JWT Access Token</strong> et <strong>Refresh Token</strong></li>
  <li>🔄 Authentification par <strong>Refresh Token</strong></li>
  <li>🧾 Authentification par <strong>Client ID / Secret</strong></li>
  <li>⚙️ Modification des paramètres d’expiration des tokens</li>
</ul>

<hr>

<h2>🏗️ Partie 2 – Développement d’une architecture microservices sécurisée</h2>

<h3>📦 Backend (Spring Boot + Spring Security + Keycloak Adapter)</h3>
<ul>
  <li>Implémentation de <strong>microservices REST</strong> sécurisés</li>
  <li>Intégration avec Keycloak via <code>spring-boot-starter-oauth2-resource-server</code></li>
  <li>Contrôle d’accès basé sur les <strong>rôles</strong></li>
  <li>Service Gateway avec <strong>Spring Cloud Gateway</strong> (optionnel)</li>
  <li>Découverte de services avec <strong>Eureka</strong> (optionnel)</li>
</ul>

<h3>🎨 Frontend (Angular + Keycloak JS)</h3>
<ul>
  <li>Intégration de <code>keycloak-js</code></li>
  <li>Authentification automatique via navigateur</li>
  <li>Redirection en cas de non-authentification</li>
  <li>Affichage conditionnel selon le rôle</li>
  <li>Renouvellement automatique du token</li>
</ul>

<hr>

<h2>⚙️ Technologies utilisées</h2>

<table>
  <thead>
    <tr><th>Technologie</th><th>Rôle</th></tr>
  </thead>
  <tbody>
    <tr><td><strong>Keycloak 19</strong></td><td>Serveur d’authentification OpenID Connect</td></tr>
    <tr><td><strong>Spring Boot 3</strong></td><td>Backend des microservices</td></tr>
    <tr><td><strong>Spring Security</strong></td><td>Sécurisation des endpoints</td></tr>
    <tr><td><strong>Angular 17</strong></td><td>Frontend SPA sécurisé</td></tr>
    <tr><td><strong>Postman</strong></td><td>Tests des API sécurisées</td></tr>
    <tr><td><strong>Docker</strong> (optionnel)</td><td>Conteneurisation des services</td></tr>
  </tbody>
</table>

<hr>

<h2>📂 Structure du projet</h2>

<pre>
/keycloak-config           # Scripts de configuration Keycloak
└── /realm-export.json

/backend
├── /gateway-service
├── /user-service
├── /product-service
└── /config

/frontend
└── /angular-app
</pre>

<hr>

<h2>🚀 Lancement rapide</h2>

<ol>
  <li><strong>Lancer Keycloak</strong><br>
    <code>./kc.sh start-dev --http-port=8180</code>
  </li>
  <li><strong>Démarrer les microservices Spring Boot</strong><br>
    <code>mvn spring-boot:run</code>
  </li>
  <li><strong>Lancer l’application Angular</strong><br>
    <code>ng serve</code>
  </li>
</ol>

<hr>

<h2>🔐 Accès</h2>
<ul>
  <li><strong>Console Admin Keycloak</strong> : <a href="http://localhost:8180/admin">http://localhost:8180/admin</a></li>
  <li><strong>Application Angular</strong> : <a href="http://localhost:4200">http://localhost:4200</a></li>
</ul>

<hr>

<h2>📑 Conclusion</h2>
<p>
Ce projet démontre une <strong>architecture sécurisée et modulaire</strong>, idéale pour des applications modernes cloud-native. 
L'intégration de <strong>Keycloak</strong> garantit une gestion robuste des identités avec OAuth2 / OpenID Connect, 
tout en offrant une expérience fluide aux utilisateurs.
</p>
