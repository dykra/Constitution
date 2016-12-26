package tests;

import static org.junit.Assert.*;

import agh.cs.constitution.*;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Joanna on 2016-12-04.
 */
public class ConstitutionTest {

    @Test
    public void printArticleTest() throws IOException {
        Constitution C = new Parser("C:\\Users\\Joanna\\Documents\\Konstytucja.txt").parse();
        assertEquals(C.printArticle(1,1),"Art. 1.\n" +
                "Rzeczpospolita Polska jest dobrem wspólnym wszystkich obywateli.\n");
        assertEquals(C.printArticle(20,24),"Art. 20.\n" +
                "Społeczna gospodarka rynkowa oparta na wolności działalności gospodarczej,\n" +
                "własności prywatnej oraz solidarności, dialogu i współpracy partnerów społecznych\n" +
                "stanowi podstawę ustroju gospodarczego Rzeczypospolitej Polskiej.\n" +
                "Art. 21.\n" +
                "1. Rzeczpospolita Polska chroni własność i prawo dziedziczenia.\n" +
                "2. Wywłaszczenie jest dopuszczalne jedynie wówczas, gdy jest dokonywane na\n" +
                "cele publiczne i za słusznym odszkodowaniem.\n" +
                "Art. 22.\n" +
                "Ograniczenie wolności działalności gospodarczej jest dopuszczalne tylko w drodze\n" +
                "ustawy i tylko ze względu na ważny interes publiczny.\n" +
                "Art. 23.\n" +
                "Podstawą ustroju rolnego państwa jest gospodarstwo rodzinne. Zasada ta nie narusza\n" +
                "postanowień art. 21 i art. 22.\n" +
                "Art. 24.\n" +
                "Praca znajduje się pod ochroną Rzeczypospolitej Polskiej. Państwo sprawuje nadzór\n" +
                "nad warunkami wykonywania pracy.\n"
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void printArticleTest2() throws Exception {
        Constitution C = new Constitution();
        C.chapters.add(new Chapter(23,45,"123"));
        C.printArticle(-1,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printChapterTest2() throws Exception {
        Constitution C = new Constitution();
        C.chapters.add(new Chapter(1,1,"123"));
        C.printChapter(-20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printChapterTest3() throws Exception {
        Constitution C = new Constitution();
        C.chapters.add(new Chapter(1,1,"123"));
        C.printChapter(2374935);
    }


    @Test
    public void printChapterTest() throws IOException {
        Constitution C = new Parser("C:\\Users\\Joanna\\Documents\\Konstytucja.txt").parse();
        assertEquals(C.printChapter(5),"Rozdział V\n" +
                "PREZYDENT RZECZYPOSPOLITEJ POLSKIEJ\n" +
                "Art. 126.\n" +
                "1. Prezydent Rzeczypospolitej Polskiej jest najwyższym przedstawicielem\n" +
                "Rzeczypospolitej Polskiej i gwarantem ciągłości władzy państwowej.\n" +
                "2. Prezydent Rzeczypospolitej czuwa nad przestrzeganiem Konstytucji, stoi na\n" +
                "straży suwerenności i bezpieczeństwa państwa oraz nienaruszalności i\n" +
                "niepodzielności jego terytorium.\n" +
                "3. Prezydent Rzeczypospolitej wykonuje swoje zadania w zakresie i na zasadach\n" +
                "określonych w Konstytucji i ustawach.\n" +
                "Art. 127.\n" +
                "1. Prezydent Rzeczypospolitej jest wybierany przez Naród w wyborach\n" +
                "powszechnych, równych, bezpośrednich i w głosowaniu tajnym.\n" +
                "2. Prezydent Rzeczypospolitej jest wybierany na pięcioletnią kadencję i może być\n" +
                "ponownie wybrany tylko raz.\n" +
                "3. Na Prezydenta Rzeczypospolitej może być wybrany obywatel polski, który\n" +
                "najpóźniej w dniu wyborów kończy 35 lat i korzysta z pełni praw wyborczych do\n" +
                "Sejmu. Kandydata zgłasza co najmniej 100 000 obywateli mających prawo\n" +
                "wybierania do Sejmu.\n" +
                "4. Na Prezydenta Rzeczypospolitej wybrany zostaje kandydat, który otrzymał\n" +
                "więcej niż połowę ważnie oddanych głosów. Jeżeli żaden z kandydatów nie uzyska\n" +
                "wymaganej większości, czternastego dnia po pierwszym głosowaniu\n" +
                "przeprowadza się ponowne głosowanie.\n" +
                "5. W ponownym głosowaniu wyboru dokonuje się spośród dwóch kandydatów,\n" +
                "którzy w pierwszym głosowaniu otrzymali kolejno największą liczbę głosów.\n" +
                "Jeżeli którykolwiek z tych dwóch kandydatów wycofa zgodę na kandydowanie,\n" +
                "utraci prawo wyborcze lub umrze, w jego miejsce do wyborów w ponownym\n" +
                "głosowaniu dopuszcza się kandydata, który otrzymał kolejno największą liczbę\n" +
                "głosów w pierwszym głosowaniu. W takim przypadku datę ponownego\n" +
                "głosowania odracza się o dalszych 14 dni.\n" +
                "6. Na Prezydenta Rzeczypospolitej wybrany zostaje kandydat, który w ponownym\n" +
                "głosowaniu otrzymał więcej głosów.\n" +
                "7. Zasady i tryb zgłaszania kandydatów i przeprowadzania wyborów oraz warunki\n" +
                "ważności wyboru Prezydenta Rzeczypospolitej określa ustawa.\n" +
                "Art. 128.\n" +
                "1. Kadencja Prezydenta Rzeczypospolitej rozpoczyna się w dniu objęcia przez\n" +
                "niego urzędu.\n" +
                "2. Wybory Prezydenta Rzeczypospolitej zarządza Marszałek Sejmu na dzień\n" +
                "przypadający nie wcześniej niż na 100 dni i nie później niż na 75 dni przed upływem\n" +
                "kadencji urzędującego Prezydenta Rzeczypospolitej, a w razie opróżnienia\n" +
                "urzędu Prezydenta Rzeczypospolitej - nie później niż w czternastym dniu po\n" +
                "opróżnieniu urzędu, wyznaczając datę wyborów na dzień wolny od pracy\n" +
                "przypadający w ciągu 60 dni od dnia zarządzenia wyborów.\n" +
                "Art. 129.\n" +
                "1. Ważność wyboru Prezydenta Rzeczypospolitej stwierdza Sąd Najwyższy.\n" +
                "2. Wyborcy przysługuje prawo zgłoszenia do Sądu Najwyższego protestu\n" +
                "przeciwko ważności wyboru Prezydenta Rzeczypospolitej na zasadach określonych w\n" +
                "ustawie.\n" +
                "3. W razie stwierdzenia nieważności wyboru Prezydenta Rzeczypospolitej\n" +
                "przeprowadza się nowe wybory, na zasadach przewidzianych w art. 128 ust. 2 dla\n" +
                "przypadku opróżnienia urzędu Prezydenta Rzeczypospolitej.\n" +
                "Art. 130.\n" +
                "Prezydent Rzeczypospolitej obejmuje urząd po złożeniu wobec Zgromadzenia\n" +
                "Narodowego następującej przysięgi:\n" +
                "\"Obejmując z woli Narodu urząd Prezydenta Rzeczypospolitej Polskiej,\n" +
                "uroczyście przysięgam, że dochowam wierności postanowieniom\n" +
                "Konstytucji, będę strzegł niezłomnie godności Narodu, niepodległości i\n" +
                "bezpieczeństwa Państwa, a dobro Ojczyzny oraz pomyślność obywateli będą dla mnie\n" +
                "zawsze najwyższym nakazem\".\n" +
                "Przysięga może być złożona z dodaniem zdania \"Tak mi dopomóż Bóg\".\n" +
                "Art. 131.\n" +
                "1. Jeżeli Prezydent Rzeczypospolitej nie może przejściowo sprawować urzędu,\n" +
                "zawiadamia o tym Marszałka Sejmu, który tymczasowo przejmuje obowiązki\n" +
                "Prezydenta Rzeczypospolitej. Gdy Prezydent Rzeczypospolitej nie jest w stanie\n" +
                "zawiadomić Marszałka Sejmu o niemożności sprawowania urzędu, wówczas o\n" +
                "stwierdzeniu przeszkody w sprawowaniu urzędu przez Prezydenta\n" +
                "Rzeczypospolitej rozstrzyga Trybunał Konstytucyjny na wniosek Marszałka Sejmu. W razie\n" +
                "uznania przejściowej niemożności sprawowania urzędu przez Prezydenta\n" +
                "Rzeczypospolitej Trybunał Konstytucyjny powierza Marszałkowi Sejmu\n" +
                "tymczasowe wykonywanie obowiązków Prezydenta Rzeczypospolitej.\n" +
                "2. Marszałek Sejmu tymczasowo, do czasu wyboru nowego Prezydenta\n" +
                "Rzeczypospolitej, wykonuje obowiązki Prezydenta Rzeczypospolitej w razie:\n" +
                "1) śmierci Prezydenta Rzeczypospolitej,\n" +
                "2) zrzeczenia się urzędu przez Prezydenta Rzeczypospolitej,\n" +
                "3) stwierdzenia nieważności wyboru Prezydenta Rzeczypospolitej lub innych\n" +
                "przyczyn nieobjęcia urzędu po wyborze,\n" +
                "4) uznania przez Zgromadzenie Narodowe trwałej niezdolności Prezydenta\n" +
                "Rzeczypospolitej do sprawowania urzędu ze względu na stan zdrowia,\n" +
                "uchwałą podjętą większością co najmniej 2/3 głosów ustawowej liczby\n" +
                "członków Zgromadzenia Narodowego,\n" +
                "5) złożenia Prezydenta Rzeczypospolitej z urzędu orzeczeniem Trybunału\n" +
                "Stanu.\n" +
                "3. Jeżeli Marszałek Sejmu nie może wykonywać obowiązków Prezydenta\n" +
                "Rzeczypospolitej, obowiązki te przejmuje Marszałek Senatu.\n" +
                "4. Osoba wykonująca obowiązki Prezydenta Rzeczypospolitej nie może postanowić\n" +
                "o skróceniu kadencji Sejmu.\n" +
                "Art. 132.\n" +
                "Prezydent Rzeczypospolitej nie może piastować żadnego innego urzędu ani pełnić\n" +
                "żadnej funkcji publicznej, z wyjątkiem tych, które są związane ze sprawowanym\n" +
                "urzędem.\n" +
                "Art. 133.\n" +
                "1. Prezydent Rzeczypospolitej jako reprezentant państwa w stosunkach\n" +
                "zewnętrznych:\n" +
                "1) ratyfikuje i wypowiada umowy międzynarodowe, o czym zawiadamia Sejm\n" +
                "i Senat,\n" +
                "2) mianuje i odwołuje pełnomocnych przedstawicieli Rzeczypospolitej Polskiej\n" +
                "w innych państwach i przy organizacjach międzynarodowych,\n" +
                "3) przyjmuje listy uwierzytelniające i odwołujące akredytowanych przy nim\n" +
                "przedstawicieli dyplomatycznych innych państw i organizacji\n" +
                "międzynarodowych.\n" +
                "2. Prezydent Rzeczypospolitej przed ratyfikowaniem umowy międzynarodowej\n" +
                "może zwrócić się do Trybunału Konstytucyjnego z wnioskiem w sprawie jej\n" +
                "zgodności z Konstytucją.\n" +
                "3. Prezydent Rzeczypospolitej w zakresie polityki zagranicznej współdziała z\n" +
                "Prezesem Rady Ministrów i właściwym ministrem.\n" +
                "Art. 134.\n" +
                "1. Prezydent Rzeczypospolitej jest najwyższym zwierzchnikiem Sił Zbrojnych\n" +
                "Rzeczypospolitej Polskiej.\n" +
                "2. W czasie pokoju Prezydent Rzeczypospolitej sprawuje zwierzchnictwo nad\n" +
                "Siłami Zbrojnymi za pośrednictwem Ministra Obrony Narodowej.\n" +
                "3. Prezydent Rzeczypospolitej mianuje Szefa Sztabu Generalnego i dowódców\n" +
                "rodzajów Sił Zbrojnych na czas określony. Czas trwania kadencji, tryb i warunki\n" +
                "odwołania przed jej upływem określa ustawa.\n" +
                "4. Na czas wojny Prezydent Rzeczypospolitej, na wniosek Prezesa Rady\n" +
                "Ministrów, mianuje Naczelnego Dowódcę Sił Zbrojnych. W tym samym trybie może\n" +
                "on Naczelnego Dowódcę Sił Zbrojnych odwołać. Kompetencje Naczelnego\n" +
                "Dowódcy Sił Zbrojnych i zasady jego podległości konstytucyjnym organom\n" +
                "Rzeczypospolitej Polskiej określa ustawa.\n" +
                "5. Prezydent Rzeczypospolitej, na wniosek Ministra Obrony Narodowej, nadaje\n" +
                "określone w ustawach stopnie wojskowe.\n" +
                "6. Kompetencje Prezydenta Rzeczypospolitej, związane ze zwierzchnictwem nad\n" +
                "Siłami Zbrojnymi, szczegółowo określa ustawa.\n" +
                "Art. 135.\n" +
                "Organem doradczym Prezydenta Rzeczypospolitej w zakresie wewnętrznego i\n" +
                "zewnętrznego bezpieczeństwa państwa jest Rada Bezpieczeństwa Narodowego.\n" +
                "Art. 136.\n" +
                "W razie bezpośredniego, zewnętrznego zagrożenia państwa Prezydent\n" +
                "Rzeczypospolitej, na wniosek Prezesa Rady Ministrów, zarządza powszechną lub częściową\n" +
                "mobilizację i użycie Sił Zbrojnych do obrony Rzeczypospolitej Polskiej.\n" +
                "Art. 137.\n" +
                "Prezydent Rzeczypospolitej nadaje obywatelstwo polskie i wyraża zgodę na\n" +
                "zrzeczenie się obywatelstwa polskiego.\n" +
                "Art. 138.\n" +
                "Prezydent Rzeczypospolitej nadaje ordery i odznaczenia.\n" +
                "Art. 139.\n" +
                "Prezydent Rzeczypospolitej stosuje prawo łaski. Prawa łaski nie stosuje się do osób\n" +
                "skazanych przez Trybunał Stanu.\n" +
                "Art. 140.\n" +
                "Prezydent Rzeczypospolitej może zwracać się z orędziem do Sejmu, do Senatu lub\n" +
                "do Zgromadzenia Narodowego. Orędzia nie czyni się przedmiotem debaty.\n" +
                "Art. 141.\n" +
                "1. W sprawach szczególnej wagi Prezydent Rzeczypospolitej może zwołać Radę\n" +
                "Gabinetową. Radę Gabinetową tworzy Rada Ministrów obradująca pod\n" +
                "przewodnictwem Prezydenta Rzeczypospolitej.\n" +
                "2. Radzie Gabinetowej nie przysługują kompetencje Rady Ministrów.\n" +
                "Art. 142.\n" +
                "1. Prezydent Rzeczypospolitej wydaje rozporządzenia i zarządzenia na zasadach\n" +
                "określonych w art. 92 i art. 93.\n" +
                "2. Prezydent Rzeczypospolitej wydaje postanowienia w zakresie realizacji\n" +
                "pozostałych swoich kompetencji.\n" +
                "Art. 143.\n" +
                "Organem pomocniczym Prezydenta Rzeczypospolitej jest Kancelaria Prezydenta\n" +
                "Rzeczypospolitej. Prezydent Rzeczypospolitej nadaje statut Kancelarii oraz powołuje\n" +
                "i odwołuje Szefa Kancelarii Prezydenta Rzeczypospolitej.\n" +
                "Art. 144.\n" +
                "1. Prezydent Rzeczypospolitej, korzystając ze swoich konstytucyjnych i\n" +
                "ustawowych kompetencji, wydaje akty urzędowe.\n" +
                "2. Akty urzędowe Prezydenta Rzeczypospolitej wymagają dla swojej ważności\n" +
                "podpisu Prezesa Rady Ministrów, który przez podpisanie aktu ponosi\n" +
                "odpowiedzialność przed Sejmem.\n" +
                "3. Przepis ust. 2 nie dotyczy:\n" +
                "1) zarządzania wyborów do Sejmu i Senatu,\n" +
                "2) zwoływania pierwszego posiedzenia nowo wybranych Sejmu i Senatu,\n" +
                "3) skracania kadencji Sejmu w przypadkach określonych w Konstytucji,\n" +
                "4) inicjatywy ustawodawczej,\n" +
                "5) zarządzania referendum ogólnokrajowego,\n" +
                "6) podpisywania albo odmowy podpisania ustawy,\n" +
                "7) zarządzania ogłoszenia ustawy oraz umowy międzynarodowej w Dzienniku\n" +
                "Ustaw Rzeczypospolitej Polskiej,\n" +
                "8) zwracania się z orędziem do Sejmu, do Senatu lub do Zgromadzenia\n" +
                "Narodowego,\n" +
                "9) wniosku do Trybunału Konstytucyjnego,\n" +
                "10) wniosku o przeprowadzenie kontroli przez Najwyższą Izbę Kontroli,\n" +
                "11) desygnowania i powoływania Prezesa Rady Ministrów,\n" +
                "12) przyjmowania dymisji Rady Ministrów i powierzania jej tymczasowego\n" +
                "pełnienia obowiązków,\n" +
                "13) wniosku do Sejmu o pociągnięcie do odpowiedzialności przed Trybunałem\n" +
                "Stanu członka Rady Ministrów,\n" +
                "14) odwoływania ministra, któremu Sejm wyraził wotum nieufności,\n" +
                "15) zwoływania Rady Gabinetowej,\n" +
                "16) nadawania orderów i odznaczeń,\n" +
                "17) powoływania sędziów,\n" +
                "18) stosowania prawa łaski,\n" +
                "19) nadawania obywatelstwa polskiego i wyrażania zgody na zrzeczenie się\n" +
                "obywatelstwa polskiego,\n" +
                "20) powoływania Pierwszego Prezesa Sądu Najwyższego,\n" +
                "21) powoływania Prezesa i Wiceprezesa Trybunału Konstytucyjnego,\n" +
                "22) powoływania Prezesa Naczelnego Sądu Administracyjnego,\n" +
                "23) powoływania prezesów Sądu Najwyższego oraz wiceprezesów Naczelnego\n" +
                "Sądu Administracyjnego,\n" +
                "24) wniosku do Sejmu o powołanie Prezesa Narodowego Banku Polskiego,\n" +
                "25) powoływania członków Rady Polityki Pieniężnej,\n" +
                "26) powoływania i odwoływania członków Rady Bezpieczeństwa Narodowego,\n" +
                "27) powoływania członków Krajowej Rady Radiofonii i Telewizji,\n" +
                "28) nadawania statutu Kancelarii Prezydenta Rzeczypospolitej oraz\n" +
                "powoływania i odwoływania Szefa Kancelarii Prezydenta Rzeczypospolitej,\n" +
                "29) wydawania zarządzeń na zasadach określonych w art. 93,\n" +
                "30) zrzeczenia się urzędu Prezydenta Rzeczypospolitej.\n" +
                "Art. 145.\n" +
                "1. Prezydent Rzeczypospolitej za naruszenie Konstytucji, ustawy lub za\n" +
                "popełnienie przestępstwa może być pociągnięty do odpowiedzialności przed Trybunałem\n" +
                "Stanu.\n" +
                "2. Postawienie Prezydenta Rzeczypospolitej w stan oskarżenia może nastąpić\n" +
                "uchwałą Zgromadzenia Narodowego, podjętą większością co najmniej 2/3\n" +
                "głosów ustawowej liczby członków Zgromadzenia Narodowego na wniosek co\n" +
                "najmniej 140 członków Zgromadzenia Narodowego.\n" +
                "3. Z dniem podjęcia uchwały o postawieniu Prezydenta Rzeczypospolitej w stan\n" +
                "oskarżenia przed Trybunałem Stanu sprawowanie urzędu przez Prezydenta\n" +
                "Rzeczypospolitej ulega zawieszeniu. Przepis art. 131 stosuje się odpowiednio.\n"
        );
    }

    }
