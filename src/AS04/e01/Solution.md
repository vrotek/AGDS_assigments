## 1. Beschreiben Sie eine Sequenz von add- und remove-Aufrufen, die mit dieser Implementierung zur längsten, d. h. schlechtesten, Gesamtzeit führt. Die Sequenz soll endlos fortgeführt werden können, wird aber für die Analyse nach k Operationen abgebrochen. Geben Sie dabei die entsprechende Laufzeit unter Verwendung der Groß-O-Notation in Abhängigkeit von der Anzahl n der Elemente des Arrays zu Beginn der Aufrufsequenz sowie Anzahl k der Operationen an.

1. ```add (n Elements)```
2. ```remove (n/2 Elements)```
3. ```add (n/2 Elements)```
4. ```remove (n/4 Elements)```
5. ```add (n/4 Elements)```
6. ```remove (n/8 Elements)```

Big O(n log n)

## 2. Bestimmen Sie die amortisierten Laufzeiten im zuvor ermittelten schlechtesten Fall von add und remove mit dieser Implementierung. Teilen Sie dazu – ähnlich wie die Kosten einer Verdopplung nur auf die add-Aufrufe – die Kosten einer Halbierung nur auf die remove-Aufrufe auf.

### Add

Jeder add aufruf hat wenn nicht verdoppelt wird ```O(1)```
Wenn verdoppelt wird ```o(log n)```
Gesamtlaufzeit von add ```O(n)```

Amortisierte Laufzeit: ```O(1) + O(log n) / O(n) = O(1)```


### Remove

Jeder remove aufruf hat wenn nicht halbiert wird ```O(n)```
Wenn halbiert wird ```o(log n)```
Gesamtlaufzeit von remove ```O(n)```

Amortisierte Laufzeit: ```O(n) + O(log n) / O(n) = O(n)```

## 3.  Es gibt eine bessere Implementierung bezogen auf die amortisierten Laufzeiten von add und remove. Skizzieren Sie diese und bestimmen Sie die entsprechenden amortisierten Laufzeiten.

Wir können die Implementation von Remove verbessern, indem wir anstatt jedes mal zu halbieren, einen niedriegeren Halbierungsspunkt wählen, wie z.B: n/4 oder n/8. 

Dies schränkt die Anzahl der Halbierungsoperationen weiter ein und verbessert die amortisierte Laufzeit, zumindest von Remove.