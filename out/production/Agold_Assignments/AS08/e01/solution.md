## Aufgabe 1: Kollisionensbehandlung

Wie Sie beim Bearbeiten des letzten, siebten Aufgabenblatts bemerkt haben, ist es schwierig,
Hash-Funktionen zu finden, die zu keiner Kollision führen, selbst dann, wenn die einzufügenden
Schlüssel zu Beginn schon bekannt sind. Da dementsprechend, wie Sie während der siebten
Vorlesung über „Zuordnungstabellen“ erfahren haben, im Allgemeinen Kollisionen nicht komplett
vermieden werden können, gibt es verschiedene Methoden, um diese in einer Hash-Tabell zu
behandeln.

Es sei die **Hash-Funktion**

                        h(k) := 9(k + 1)
und die **Kompressionsfunktion**

                        c(x) := x (mod 13)
gegeben.

Fügen Sie die acht (Dezimal-)Werte
``2, 6, 13, 45, 29, 15, 22 und 9``
nacheinander in eine anfangs leere Hash-Tabelle ein, indem Sie zur Kollisionsbehandlung

1. externe Verkettung,
2. quadratisches Sondieren sowie
3. doppelte Hashing mit einer von Ihnen passend gewählten Hash-Funktion h′
   nutzen und entsprechende drei Hash-Tabellen skizzieren.

### 1. Externe Verkettung

Jeder Bucket enthält eine verkette Liste.

| Position | Hash-Funktion          | Verkettete Liste |
|----------|------------------------|------------------|
| 0        |                        | []               |
| 1        | h(2) = 27, h(15) = 144 | [2,15]           |
| 2        |                        | []               |
| 3        |                        | []               |
| 4        |                        | []               |
| 5        | h(29) = 270            | [29]             |
| 6        |                        | []               |
| 7        |                        | []               |
| 8        |                        | []               |
| 9        | h(13) = 126            | [13]             |
| 10       |                        | []               |
| 11       | h(6) = 63, h(45) = 414 | [6,45]           |
| 12       | h(22) = 207, h(9) = 90 | [22,9]           |




### 2. Quadratisches Sondieren

Wir verwenden eine zusätzliche Funktion f(i) = i^2. Wenn wir auf einen belegten Platz in der Hashtabelle stoßen, 
suchen wir in f(i) schritten nach einem anderen freien Platz.  

| Position | Hash-Funktion          | f(i)                | Verkettete Liste |
|----------|------------------------|---------------------|------------------|
| 0        |                        | f(1) = 1            | [22]             |
| 1        | h(2) = 27, h(15) = 144 |                     | [2]              |
| 2        |                        | f(1) = 1            | [15]             |
| 3        |                        |                     | []               |
| 4        |                        | f(2) = 4 + f(1) = 1 | [9]              |
| 5        | h(29) = 270            |                     | [29]             |
| 6        |                        |                     | []               |
| 7        |                        |                     | []               |
| 8        |                        |                     | []               |
| 9        | h(13) = 126            |                     | [13]             |
| 10       |                        |                     | []               |
| 11       | h(6) = 63, h(45) = 414 |                     | [6]              |
| 12       | h(22) = 207, h(9) = 90 | f(1) = 1            | [45]             |


### 3. Doppeltes Hashing

Wir verwenden eine Zusätzliche Hash Funktion ``h'(k) = 7 - (k mod 7)``. Wenn wir auf 
einen vollen Bucket stoßen, gehen wir in h'(k) schritten weiter.

| Position | Hash-Funktion          | h' Funktion           | Verkettete Liste |
|----------|------------------------|-----------------------|------------------|
| 0        |                        |                       | []               |
| 1        | h(2) = 27, h(15) = 144 |                       | [2]              |
| 2        |                        | h'(45) = 4            | [45]             |
| 3        |                        |                       | []               |
| 4        |                        |                       | [45]             |
| 5        | h(29) = 270            |                       | [29]             |
| 6        |                        | h'(9) = 5 + h'(5) = 2 | [9]              |
| 7        |                        |                       | [15]             |
| 8        |                        |                       | []               |
| 9        | h(13) = 126            |                       | [13]             |
| 10       |                        |                       | []               |
| 11       | h(6) = 63, h(45) = 414 |                       | [6]              |
| 12       | h(22) = 207, h(9) = 90 |                       | [22]             |

