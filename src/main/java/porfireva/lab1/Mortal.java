// Поскольку оба - и Hero, и Enemy по сути являеются Mortal (имеют баллы здоровья и могут погибнуть)
// они оба будут наследоваться от абстрактного класса-бойца Fighter, который имплементит Mortal.
public interface Mortal {    
    public boolean isAlive();
}
