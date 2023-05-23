## Aufgabe 4: AVL-Baum


### 1. Fügen Sie die acht (Dezimal-)Werte ``2, 6, 13, 45, 29, 15, 22 und 9``


#### Adding 2
![img.png](img.png)

#### Adding 6
![img_1.png](img_1.png)

#### Adding 13
![img_2.png](img_2.png)

#### Adding 45
![img_3.png](img_3.png)

#### Adding 29
![img_4.png](img_4.png)

#### Adding 15
![img_6.png](img_6.png)

#### Adding 22
![img_5.png](img_5.png)

#### Adding 9
![img_7.png](img_7.png)

### 2. Bestimmen Sie die Höhe des resultierenden AVL-Baumes.

h = 3

### 3. Löschen Sie die fünf Elemente `29, 9, 13, 15, und 45`

#### Removing 29

![img_8.png](img_8.png)

#### Removing 9

![img_9.png](img_9.png)

#### Removing 13

![img_10.png](img_10.png)

#### Removing 15

![img_11.png](img_11.png)

#### Removing 45

![img_12.png](img_12.png)

### 4. Beweisen oder widerlegen Sie, dass unabhängig von der Einfügereihenfolge von Elementen in einen AVL-Baum jedenfalls der gleiche AVL-Baum entsteht.

Da der AVL Baum ein geordneter Baum ist, ist die Inorder Traversierung von 2 generierten AVL Bäumen
verschiedener permutationen von ```1 2 3 4 5 6``` 

permutation1 = ```4 5 3 2 1 6```\
permutation2 = ```2 3 5 6 1 4```

die identische Sequenz von Zahlen nämlich:

```1 2 3 4 5 6```

Wenn ``f(elemente)`` nun eine function ist, welche einen AVL Baum generiert und dessen Inorder Traversierung als "ID"
zurückgibt, dann währe gegeben:

``f(permutation1) == f(permutation2)``