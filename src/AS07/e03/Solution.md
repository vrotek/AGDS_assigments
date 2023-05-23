## 2. Erklären Sie, wie Sie auf Ihre Hash-Funktion h und Kompressionsfunktion c gekommen sind. Argumentieren Sie in weiterer Folge, welche in der Vorlesung erwähnten Eigenschaften Ihre Hash-Funktion h und Kompressionsfunktion c aufweisen bzw. nicht aufweisen.


###### Hash-Funktion h

Simple Hash-funktion welche den Unicode jedes Zeichens des Strings samt einer konstante g zum Hash hinzuaddiert. Leider schaft dieser Anstaz nicht komplett kollisionsfrei zusein.

###### Kompressionsfunktion c
Verwendet nur den % Operator um den Hashcode auf das Zielarray abzubilden, zudem stellt die Funktion sicher,
dass der Hashcode positiv ist, indem es das signed bit flipped falls es 1 ist.

## 3. Geben Sie zwei verschiedene, beispielhafte Zeichenketten an, die unter Anwendung der von Ihnen umgesetzten Hash-Funktion h und Kompressionsfunktion c in einer Hash-Tabelle mit Kapazität 5 kollidieren.

1. "A","Z"
2. "AB", "B"