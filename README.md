# fa19-TowerFall

Petit rassemblement des idées du site (mini cahier des charge) :

##Interface

- Une page de Menu rassemblant au moins : <GAME> (démarrage de partie en passant par une fenetre de réglage de partie) | <FastGame> (demarrage de la partie sans réglage au préalable (mise a part le nombre de joueurs)) | <Option> (Permettant pour le moment de régler les touches des différents joueurs) | <Exit> (ferme le jeu)

- Une page d'Option : Permet de modifier les touches des différents joueurs en plaçant le curseur sur l'une des options (deplacement au fleche pour cette fenetre et enter pour modification).

- Une page de réglage de partie : Permet de modifier les différentes variables affectant le jeu et de séléctionner le mode de jeu, pour le moment il y aurait : <Time-mode> (le joueur ayant le plus de points gagne) | <Survive-mode> (les joueurs jouent jusqu'a ce qu'ils n'aient plus de vies, le dernier gagne).
Les différentes variables affectés seraient : Nb de Joueurs (int) | Bonus (boolean) | Map (map) | Mode (voir ci-dessus) | Life (int)*vie du joueur* | respawn (int) *nb de respawn pour le mode survive uniquement* | Time (int) *Temp en seconde pour le mode time uniquement* | Spawn (boolean) *spawn fixe ou aleatoire*

- Une page de choix des personnage : l'écran serait divisé verticalement avec en fond la couleur principal du perso séléctionné et un aperçu au centre.

- Une page de Jeu principal : Pas besoin d'expliquer.

##Mécanique du jeu (idées du TP) :
    Tower Fall Like :
    - Deux personnages (voir plus par la suite) capacités identiques avec armes corps à corps et à distance
    - Bonus aléatoires
       -> PowerUP
       -> Ammo
    - Armes flèches :
        -> munitions limitées ou Timer (tirs toutes les 2s)
    - Destruction des décors
## Minimum requis
    - 3 rounds
    -une map 2D fixe
    - plateforme + vide + 4 zones bonus aléatoires
    - 2 joueurs
    - une touche attaque
    - 4 directions
    - 5 munitions / 3 vies

  Modes de jeu :
     - Temps réel : Thread ?
     - Multijoueur avec serveur et client embarqué
     
     
##Conception du code
 -Concevoir un code qui puisse être évolutif
 -JMonkey
  - Terrain
  - Input
  - Physique
  - Geometry
  

