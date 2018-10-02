# Monster Battle

Créer une classe Monster avec les attributs :
* name (String)
* attack (int)
* life (int)

Créer un constructeur permettant d’initialiser ses attributs.

Ajouter une méthode instanciée takeHit, qui prend un entier hit en argument : hit doit être soustrait à l’attribut life de l’instance (life doit rester à zéro minimum), et la méthode doit afficher le texte :
"{name} has {life} points remaining.".

Ajouter une méthode instanciée isKO, qui retourne faux si life est supérieur à zéro, et qui affiche le texte "{name} is KO!" et retourne vrai si l’attribut life est à zéro.


Créer une classe Arena avec une méthode main(). Instancier deux objets de la classe Monster avec des valeurs au choix, puis les faire combattre jusqu’à ce qu’un des deux soit KO.

Compiler et tester la classe Arena.
