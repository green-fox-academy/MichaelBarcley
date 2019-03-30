# C# language

## A C# nyelv jellemzői (imperatív, oo, lekérdező, funkcionális, típusrendszer, ...)
Imperatív nyelv, funkcionális elemekkel
Szigorúan objektum orientált
Szígorúan és statikusan típusos (a dynamic csak a statikus compile checket hackeli)

## Primitív típusok (érték típusok, stack-en tárolódnak)
Byte (signed)
Short, Int, Long (unsigned)
Single, Double
Decimal
Boolean
Date
Char
String
(Extra: DateTime, IntPtr)

## Struct vs. Class
Struct: Érték típus
Class: Referencia típus

## Abstract class vs. Interface
Külömbség:
Abstract class:
Tartalmazhat implementációt (de nem kötelező)
Örökölhető (egy osztály csak 0-1 ősosztállyal rendelkezhet)
Nem példányosítható
Interface:
Nem tartalmazhat implementációt
Implementálhtó (egy osztály "akármennyi" interface-t implementálhat)
Nem példányosítható
Ajánlás:
Abstract class:
Ha egy komponensből több variáns is készül aminek van közös funkconalitása
Inferface:
Ha egymástól független komponenseknek van azonos funkcionalitása

## Hiding vs. Override
Hiding:
Polimorfizmus esetén a BaseClass eredeti metódusa kerül megvívásra
BaseClass-ban a metódus általános módon definiálandó
DerivedClass-ban a hiding a 'láthatóság "new" típus név' formával valósul meg
Override (általános, és ajnálott):
Polimorfizmus esetén is, ha a BaseClass-on hívjuk az override-olt metódust, akkor is a DerivedClass metódusa kerül meghívásra
BaseClass-ban a metódus 'láthatóság "virtual" típus név'
DerivedClass-ban a metódus 'láthatóság "override" típus név'

## Boxing és unboxing
Boxing:
Érték típus, referencia típusba csomagolása
Objektum létrehozással (object a = b; ahol b pl egy int)
Unboxing:
Referenciatípusból kivenni az érték típust
Standard castolással

## Const vs. Readonly
Const:
Nem adható neki érték, ebből fakadóan nem változhat
Forditásidőben inlineosítja a compiler
Readonly:
Declarálás után nem változhat, ami történhet a definiáláskor, vagy az objektuma konstruktorában
Futásidőben kap értéket

## Hol lehet használni a this kulcsszót?
Meghivatkozni az objektumnak adattagjait egy metódusban
Indexer definiálásnál
Extension metódus definiálásnál
Constructor overload

## Hol lehet használni a new kulcsszót?
Operator: új objektum létrehozásához, konstruktor hívással
Modifier: field/method hiding esetén a szignatúrában
Constraint: public static T Create<T>() where T : new(), van üres konstruktora

## Miért jó az async/await?
Nyelvi szinten implementálja az aszinkronitást
Szinkron kódnak tűnő struktúrát ad ('callback hell' kiküszöbölése/elrejtése)
'rákényszerít' hogy még a szinkron kódot is aszinkronként írjuk meg
Valós aszinkronitást valósít meg a szálak tényleges felszabadításával (ez már a .NET része, nem a c#)

## Ref és out kulcsszó
Ref: a referencia két irányú, a hívás előtt létezik a objektum
Out: a referencai egy irányú, a hívás során jön létre az objektum

## Hogyan működik a foreach?
Végrehajta a beágyazott műveleteket az összes a kollekcióban jelenlévő elemen.
A kollekció tartalmának változtatását kerülni kell (rendezés, törlés, hozzáadás)

## Miért hatékony a LINQ to Objects, illetve yield return?
Hatékony:
Minimális kóddal komplex műveletek hajthatóak végre (keresések, rendezések, csoportosítások)
Olvasható kód
Bármikor könnyen átültethető más LINQ to XY API-ra.

# .NET Framework

## Milyen képességekkel bír az Object?
Equals: objektum szemantikai egyezés vizsgálat
Finalize: "destruktor" műveletek végrehajtása a GB-nek való átadás előtt (régi .NET 1.0)
GetHashCode: Objektum értékekből hast készítése
ToString: Sorosítás

## Miért speciális a String típus?
Referencia típus de a C# "Value Semantics" implementációs konvenciójának köszönhetően nem külömböztethető meg egy érték típustól
Immutable: Nem módosítható
Nem tömb, annak ellenére hogy indexelhető
Viszont IEnumerable<char>

## Hogyan működik az IEnumerable/IEnumerator?
IEnumerable
Az iterálandó objektum
GetEnumerator: Visszaad egy enumerátort read-only szerkezettel
IEnumerator
Az iterálást elősegítő objektum
Current, MoveNext, Reset: metódusok az iterálás végrehajtásához szükséges műveletek
Nincs bufferelés

##Általános kollekciók és képességeik (IEnumerable<T>, ICollection<T>, IList<T>, IDictionary<TKey, TValue>, ...)
IEnumerable
Rendezetlen
Felsorolható (GetNext, Current)
ICollection : IEnumerable
Rendezetlen
Megszámlálható (Count)
Kereshető (Contains)
IList : ICollection, IEnumerable
Rendezett
Indexelhető
IReadOnlyCollection, IReadOnlyList, IReadOnlyDictionary
IDictionary: ICollection, IEnumerable
Kulcs érték párokat tartalmaz
Rendezetlen
Kereshető (Kulcs alapján, értéket)

## IDisposable mi és miért kell?
Külső erőforrások felszabadításához szükséges az implementációja

## Hogyan lesz a LINQ-ból SQL lekérdezés? IQueryable és Expression Tree
A metódusok felül vannak definiálva az IQueryable<T>-n
Azok pedig nem metódusokat várnak (mint például Func<Product, bool>, hanem kifejezésfákat (pl.: Expression<Func<Product, bool>>)
A fordító kitüntetteten kezeli az Expression<T> “monádot”, mert nem assembly kódot fordít belőle, hanem egy adatszerkezetet, ami a kifejezés reprezentációja, ami adat a memóriába kerül és futás közben hozzáférhető – így átfordítható SQL-re.

## Thread vs. Task
Thread: 
alacsony-szintű eszköz amivel direkt módon új szálon indítható el a művelet
visszatérést explicit kell kezelni
Task: 
magas-szintű koncepció ami annyit határoz meg hogy valahol majd futni fog (thread pool)
Task-al tér vissza, ami definiálja a jövőbeni elvárt visszatérési értéket
CancellationToken
Graceful shutdown of any sync/async code
CancellationTokenSource, ahol a STOP gomb van
OperationCanceledException

# ASP.NET/EF

## Mi történik aközött, hogy beírok a böngészőbe egy web címet és megjelenik a weboldal?
Névfeloldás (domainből ipcím)
Elöbb a gépen (Browser/OS cache)
Majd a lokális hálózattól indulva rekurzívan egyre magasabb szintről (LAN/ISP)
Végül a root nameserverekig publikus domain esetén.
HTTP request a szerver felé (GET), a request HEADER-ben megadva alap információkat
Host: domain
Connection: Mi legyen a nyitott TCP kapcsolattal a választ követően
Accept/Accept-Encoding: Milyen válaszformát fogad el
User-Agent: a request küldő önazonosítója (nem authentikáció)
Cookie: Tetszőleges adatok amik a domainhez kötöttek
HTTP response a szervertől egy Permanent redirect-re, HTTP 301-es kód. (Nem kötelező elem)
Location: hova irányítsa át a kérést
HTTP request: újra küldi a requestet
HTTP response: megjön a tartalom
Browser render: weboldal renderelés és további request/response párokkal az embedded elemek begyűjtése (style/js/embed object)
Ha egy szerveren több web alkalmazás is fut, honnan tudja a szerver, hogy melyikre vagyunk kíváncsiak?
Host header
Portból
Virtual application

## Mi az MVC?
Model-View-Controller architektúra
Model: Az adatszerkezet reprezentációja (modern applikációknál a domain model megfeleltetése)
View: A user álltal látott megjelenítő réteg
Controller: A funkcionalitásokat (tényleges működést) tertalmazó réteg

## Mi a Controller kizárólagos szerepe?
A user interakciók kezelése.
HTTP-n elérhetővé teszi a service réteget
Model binding
HTTP request adatok mappelése belső szerkezeti paraméterekre (Dto-ra)

## DI milyen lifetimeokat támogat?
Singleton: Közös minden hívásra és minden injection-re, első hívástól kezdve létezik.
Transient: Minden hívás minden injectionjére egyedi új példány.
Scoped: Minden requestre egyedi, de a híváson belüli injection-ökre közös.
Teljes request/response pipeline kifejtése (ASP.NET)
Core: Middleware lánca (amiből a végén az MVC) -> MVC Routing -> Action Filter -> Controller/Action
IIS: Modulok listája -> Handler (ASP.NET) -> MVC Routing -> Action Filter -> Controller/Action

## Middleware (Core) / HttpModule és HttpHandler (IIS)
Middleware: 
Handler: “az utolsó middleware” ami requesteket kiterjesztés, útvonal, verb alapján mapel például ASP.NET-re, PHP-ra, Static File Handler-re, stb...
Module: a pipeline része

## ORM vs. raw sql?
Az ORM előnyei (Object Relational Mapping):
Forráskód szinten reprezentálja az adatszerkezetet
Típus/név problémák nyelvi statikus elemzésből következően nem lehetségesek
Az SQL segédeszközökkel (pl LINQ) leírhatóak a szoftverben
Tesztelhetővé teszi minden rétegét a szoftvernek.
Raw sql előnyei:
Jól optimalizált adatbázisoknál jelentős performancia külömbséget jelent 
Általános esetben ORM javasolt, kiegészítve tárolt eljárásokkal ott ahol performancia kritikus műveleteket hajtunk végre.
