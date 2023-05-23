## 1. Beschreiben Sie, wie Sie unter Verwendung der auf Folie 6 (Seite 3) bzw. 13 (Seite 8) eingeführten Binärbaum-Operationen sowie geeigneter, in der Vorlesung kennengelernter abstrakter Datentypen überprüfen, ob ein gegebener Binärbaum ein binärer Suchbaum ist

1. Zuerst das linke Teilbaum durchsucht.

2. Wenn der linke Teilbaum die Bedingungen eines BST nicht erfüllt,
wird sofort false zurückgegeben und die weitere Suche wird abgebrochen.

3. Dann wird geprüft, ob der aktuelle Knoten größer ist als der vorherige Knoten. Wenn dies nicht der Fall ist, wird false zurückgegeben und die weitere Suche wird abgebrochen.

4. Wenn alle Knoten im linken Teilbaum und der aktuelle Knoten die Bedingungen eines BST erfüllen,
wird der aktuelle Knoten als der vorherige Knoten gespeichert und die Suche wird im rechten Teilbaum fortgesetzt.

5. Wenn die Suche alle Knoten besucht hat und die Bedingungen für alle Knoten erfüllt sind, gibt die Funktion true zurück.

Der Algorithmus nutzt das Konzept der Traversierung eines Baums
mit Inorder-Traversierung, um sicherzustellen, dass der linke Teilbaum
vor dem aktuellen Knoten besucht wird und der rechte Teilbaum nach dem
aktuellen Knoten besucht wird.

> Implementation befindet sich in 
> 
> **AS05/e02/main**


## 2. Bestimmen Sie die Laufzeit-Komplexität Ihres Algorithmus mithilfe der Groß-O-Notation in Abhängigkeit von der Anzahl nI der internen Knoten des Binärbaums.

Meine implementation des checkBST Algorithmuses hat eine Laufzeit-Komplexität von **O(n)**, 
da es jeden Knoten des Baums durchsuchen muss um festzustellen, dass der übergebene Binärbaum ein binärer Suchbaum ist.

Generell glaub ich wird kein implementierter Algorithmus schneller sein kann als O(n),
da jeder Knoten eines Binärbaums durchsucht werden muss um sicherzugehen.