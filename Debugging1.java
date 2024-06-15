package debuggingexercises;

public class Debugging1 {

    //Scrie o metoda care pentru fiecare aparitiei a secventei “abc_” intr-un String (unde _ poate fi orice caracter) va printa “bc_” . De exemplu, findAbc(“abcdefabcghi”) va printa:

    //bcd
    //bcg

    //Ce se intampla de fapt?
    //Prima data se aseste secventa "abcd", si printeaza "bcd". In cazul acesta, _ este d.
    //Apoi gaseste secventa "abcg" si printeaza "bcg". In cazul acesta, _ este g.

    //Practic vrei sa gasesti toate secventele de 4 litere care incep cu "abc". Daca ai gasi secventa "abcn", ar trebui sa printezi "bcn".

    public static void findAbc(String input) {
        int index = input.indexOf("abc");
        while (index != -1) {
            if (index + 4 <= input.length()) {
                String found = input.substring(index + 1, index + 4);
                System.out.println(found);
            }
            index = input.indexOf("abc", index + 3);
        }
    }

    public static void main(String[] args) {
        //1. decomenteaza linia 30. Vei apela metoda cu parametrul "abcd"



        //findAbc("abcd");
        //1.1 care ar trebui sa fie output-ul in mod normal? bcd
        //1.2 care este output-ul dupa ce faci debug manual/intellij? bcd


        ///2. decomenteaza linia 36. Vei apela metoda cu parametrul "abcdabc"
        //findAbc("abcdabc");
        //2.1 care ar trebui sa fie output-ul in mod normal? bcd
        //2.2 care este output-ul dupa ce faci debug manual/intellij? exception: out of bounds
        //2.2.1 la ce linie de cod programul nu mai functioneaza, sau altfel spus: care este linia de cod care cauzeaza eroarea? 19
        //2.2.2 de ce apare eroarea? pentru ca abc nu este urmat de un alt caracter, care ar trebui printat. se incearca parcurgerea stringului dincolo de limita lui.
        //2.2.3 dupa ce gasesti motivul pentru care apare eroare, descrie problema clar, astfel incat cineva sa poate intelege problema ta si sa te poata ajuta. la prima parcurgere, gaseste abc la pozitia 0 si printeaza bcd. la a doua parcurgere gaseste abc la pozitia 4 si se incearca extragerea substringului de la pozitia 5 pana la pozitia 7, dar pozitia 7 nu exista, este in afara limitelor stringului.
        //2.3 cum se poate rezolva eroarea? am adaugat o verificare printr-un if: sa execute codul din while doar daca limita din dreapta este mai mica sau egala cu lungimea stringului.
        //2.4 da un alt exemplu de input pentru care apare exact aceasi eroare, in codul initial "abcdadaabc"

        //3.decomenteaza linia 48
        findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
        //3.1 care ar trebui sa fie output-ul in mod normal? bcd bca bca
        //3.2 care este output-ul dupa ce faci debug manual/intellij? bcd bca
        //3.2.1 care este problema? ce anume nu este cum ar trebui in rezultat? faptul ca, odata gasita secventa abc_, verificarea ulterioara se face de la caracterul de urmeaza de dupa _. in cazul nostru, caracterul _ este a si astfel, se formeaza o noua secventa abc, pe care nu am luat-o in calcul.
        //3.2.2 descrie problema clar, astfel incat cineva sa poate intelege problema ta si sa te poata ajuta. trebuie sa modificam recalcularea indexului, astfel incat sa verifice si caracterul _
        //3.2.3 care este situatia in care apare aceasta problema? Altfel spus: cum trebuie sa fie input-ul ca sa apara aceasta problema? sa fie 2 secvente abc_ intricate "abcabcd"
        //3.3 ce modificare trebuie sa faci pentru a rezolva problema? am modificat linia 23 de cod, astfel incat sa caute indexul incepand cu un carater in urma (index +3 in loc de index +4);
    }
}