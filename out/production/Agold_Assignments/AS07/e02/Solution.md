## 1. Beschreiben Sie in ein paar Sätzen, wie die Streuwerttabelle dieser Klasse implementiert wurde


Die Klasse HashMap in Java verwendet eine Streuwerttabelle (auch Hash-Tabelle genannt), um Schlüssel-Wert-Paare zu speichern und zu verwalten. Dabei werden die Schlüssel durch eine Hash-Funktion in Indizes innerhalb der Tabelle abgebildet.

Die Implementierung der HashMap verwendet intern ein Array zur Speicherung der Einträge. Jeder Eintrag enthält den Hash-Code des Schlüssels, den Schlüssel selbst, den zugehörigen Wert und eine Referenz auf den nächsten Eintrag, falls es zu einer Kollision (d.h. zwei Schlüssel haben denselben Hash-Code) kommt.

Die Hash-Funktion, die in der HashMap verwendet wird, ist die Standard-Hash-Funktion, die für den Datentyp des Schlüssels definiert ist. Für primitive Datentypen wie int oder long ist die Hash-Funktion einfach die Identitätsfunktion, während für komplexere Datentypen wie Strings eine eigene Hash-Funktion implementiert wurde.

## 2. Bestimmen Sie anschließend die Laufzeit-Komplexität der drei Methoden get, put und remove.

### 2.1 ```get```

expected Case: O(1) \
worst Case: O(n)


### 2.2 ```put```

expected Case: O(1) \
worst Case: O(n)


### 2.3 ```remove```

expected Case: O(1) \
worst Case: O(n)
