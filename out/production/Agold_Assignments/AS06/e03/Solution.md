## 1. Geben Sie in Pseudocode einen Komparator an, der die Flugzeuge nach ihrer Priorität sortiert.

```
int comparator(Plane a, Plane b){
    if(isCritical(a.fuel) && isCritical(b.fuel)){
        return fuelCompare(a,b);
    }else if(isCritical(a.fuel) && !isCritical(b.fuel)){
        return -1;
    }else if(!isCritical(a.fuel) && isCritical(b.fuel){
        return 1;
    }else {
        if(!isLate(a) && !isLate(b)){
            return fuelCompare(a,b);
        }else {
            return lateCompare(a,b);
        }
    }
}

boolean isCritical(int fuel){
    return fuel < 25;
}

boolean isLate(int late){
    return late > 0;
}

int fuelCompare(int a, int b){
    if(a.fuel < b.fuel){
      return -1;
    }else if(a.fuel > b.fuel){
      return 1;
    }else {
      return 0;
    }
}

int latenessCompare(int a, int b){
    if(a.late > b.late){
      return -1;
    }else if(a.late < b.late){
      return 1;
    }else {
      return 0;
    }
}

```

## 2. Ermitteln Sie anschließend die Reihenfolge in der die Flugzeuge landen, bei folgender Sequenz:

``10:00 Keine Landebahn ist frei.`` \
``10:00 Flugzeug A kommt an: Kerosin: 30%, Verspätung: 0 Minuten`` \
``10:10 Flugzeug B kommt an: Kerosin: 20%, Verspätung: 0 Minuten`` \
``10:20 Flugzeug C kommt an: Kerosin: 50%, Verspätung: 10 Minuten``\
``10:30 Eine Landebahnen wird frei.`` \
``10:40 Eine Landebahnen wird frei.`` \
``10:50 Flugzeug D kommt an: Kerosin: 50%, Verspätung: -10 Minuten`` \
``11:00 Flugzeug E kommt an: Kerosin: 5%, Verspätung: -30 Minuten`` \
``11:10 Eine Landebahnen wird frei.`` \
``11:20 Flugzeug F kommt an: Kerosin: 60%, Verspätung: 80 Minuten`` \
``11:30 Eine Landebahnen wird frei.`` \
``11:40 Eine Landebahnen wird frei.`` \
``11:50 Eine Landebahnen wird frei`` 

1. B
2. C
3. E
4. F
5. A
6. D