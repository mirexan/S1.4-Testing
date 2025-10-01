# S1.4-Testing

## 📄 **Description**



### **Level 01 : JUnit**

**Exercise 01**

    Crea una classe Java que gestioni una col·lecció de llibres en una biblioteca. La classe ha de permetre afegir llibres, recuperar la llista de llibres, obtenir un llibre específic per la seva posició, afegir un llibre en una posició específica i eliminar un llibre per títol.

Implementa les següents funcionalitats:

    La classe ha de permetre afegir llibres a la col·lecció.
    S'ha de poder recuperar la llista completa de llibres
    S'ha de poder obtenir el títol d'un llibre donada una posició.
    S'ha de poder afegir un llibre en una posició específica.
    S'ha de poder eliminar un llibre per títol.

Verifica el seu correcte funcionament amb JUnit:

    Verifiquen que la llista de llibres no és nul·la després de crear un nou objecte.
    Confirmen que la llista té una mida esperada després d'inserir diversos llibres.
    Asseguren que la llista conté un llibre específic en la seva posició correcta.
    Verifiquen que no hi ha títols de llibres duplicats a la llista.
    Comproven que es pot recuperar el títol d'un llibre donada una posició específica.
    Asseguren que afegir un llibre modifica correctament la llista.
    Confirmen que eliminar un llibre disminueix la mida de la llista.
    Verifiquen que la llista roman ordenada alfabèticament després d'afegir o eliminar un llibre.


**Exercise 02**


    Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
    Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi 
    un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.


**Exercise 03**


    Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
    Verifica el seu correcte funcionament amb un test jUnit.


### **Level 02: AssertJ**

Crea les classes Java i/o els tests que les proven per a demostrar el següent:

**Exercise 01**

    Una asserció que demostri que el valor de dos objectes sencers és igual, 
    i una altra que indiqui que no ho és.

**Exercise 02**

    Una asserció que demostri que la referència a un objecte és la mateixa que 
    una altra, i una altra que indiqui que és diferent.

**Exercise 03**

    Una asserció que indiqui que dos arrays d'enters són idèntics.

**Exercise 04**

Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també). 
Escriu una asserció per a verificar l'ordre 
dels objectes en l'ArrayList segons han estat inserits.

    Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
    Verifica que, en la llista anterior, un dels objectes s'ha afegit només una 
    vegada. Deixa un dels elements sense afegir, i verifica que la llista no conté aquest últim.

**Exercise 05** 

    Crea un map i verifica que conté una de les key que li afegeix.

**Exercise 06**

    Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol. 
    Crea una asserció que validi que l'excepció és llançada quan correspon.

**Exercise 07**

    Crea un objecte Optional buit. Escriu l'asserció correcta per a verificar 
    que efectivament està buit.

### **Level 03: TDD**

**Exercise 01**

Suposem que volem crear una classe anomenada Calculadora que tingui mètodes per 
realitzar operacions bàsiques com suma, resta, multiplicació i divisió. 
Anem a escriure proves abans d'implementar la funcionalitat:

    Crea una classe de prova anomenada CalculadoraTest.
    Escriu les proves per verificar els mètodes sumar, restar, dividir i multiplicar de la calculadora.
    Executa les proves. Haurien de fallar, ja que encara no hem implementat els mètodes a la classe Calculadora.
    Crea una classe Calculadora que contingui els mètodes especificats per les proves.
    Executa les proves.
    Itera sobre el procés: Després de cada iteració, continua el procés de TDD, reescriu les proves, refactoritza el 
    codi si és necessari i repeteix el cicle de desenvolupament per millorar i ampliar la funcionalitat de la classe
    Calculadora.


## 💻 **Used technologies**

- Java
- Git

## 📋 **Requirements**

- Oracle OpenJDK 21.0.8

## 🛠️ **Install**

1. Clone this repo: **>  [git clone](https://github.com/mirexan/S1.2-Exceptions.git)**
2. Acces to the directories in: S1.3-Java-Collections