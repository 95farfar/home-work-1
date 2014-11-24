home-work-1
===========

Innehåller tomma filer till inlämningen. Huvudet i filerna är inte korrekta utan anger endast vilken typ av klass det är. Behöver ni lägga till fler filer är det ok. Vill ni döpa om filer görs detta enklast via GUI klienten. Vid användning av shell kör mv kommandot.

Arbetsgång:

- [ ] Gör en fork av denna repo till din github användare.
- [ ] Skriv färdigt projektet (kom ihåg att göra en push ofta i fall det skulle hända något mwed koden).
- [ ] Fyll i logfilen eftersom du skriver projektet
    - Log-filen skrivs enligt:
        - Datum
        - Vad skall jag göra idag.
        - Vad är problemet?
        - Till nästa gång
- [ ] Readme-filen
     - Fyll i under rubrikerna nedan.
- [ ] När projektet är färdigt gör en sista push till din användare.
- [ ] Sista steget är att göra en pull-request till den här repo:n. Se till att göra den till din branch.


---


Inledning:  

Jag valde uppgiften med figurer. Den går ut på att göra färdigt exemplet
geoshape som vi började på under en lektion. Uppgiften går ut på att man ska 
kunna skapa figurer med olika mått och hörn. Figurerna ska ritas ut t.ex. 
där man klickar med musen. Man ska kunna jämföra figurerna med avseende på hörn
och area.

Jag har då gjort det på mitt sätt och skillnaden från förslaget ovan är att jag 
ritar ut figurerna med hjälp av en knapp och inte datamusen. Jag jämför 
figurerna med avseende på area och omkrets.  


Presentation av projektet/programmet:  

Mitt program ritar ut antingen en cirkel eller en rektangel. Spelaren matar
in höjden och bredden på en rektangel och/eller diametern på cirkeln 
och trycker på en av knapparna cirkel eller rektangel så ritas figuren upp.
Det som händer när man klickar någon av knapparna är att den öppnar ett
eventwindow fönster och ritar upp figuren där, även värdena på omkrets
och area sätts in i respektive textfeild. Programmet kan inte rita ut figurerna 
i samma fönster utan den kallar och öppnar ett nytt eventwindow fönster för 
varje gång man klickar i knappen. T.ex. så kan man mata in höjden och bredden 
på en rektangel och diametern på cirkeln sen så trycker man på bägge knapparna 
så får man upp två eventwindowfönster, ett med rektangeln och ett med cirkeln 
och i den ursprungliga fönstret får man värdena på omkretsen och arean för 
respektive figur.

Genomförande:  

När jag började så hade jag redan lite kod från vårt projekt Geoshape. Jag byggde
på koden jag hade från början tills det blev färdigt. För mer info se loggen
nedan! 

Hur gick det?

Det gick bra. Från början var det lite svårt och krångligt eftersom jag inte 
riktigt visste hur man ska göra allt och vad alla klasser gör. Men efter ett 
antal hjälp av Stefan och diskussioner med mina kamrater så blev saker och ting 
klarare ju längre fram jag kom.


Slutresultat/Analys/Diskussion:  

Det jag inte gillar med programmet är att det inte gick att använda Math.PI 
när jag ville beräkna omkretsen samt arean för cirkeln så jag blev tvungen att
använda 3.14 vilket inte Stefan gillar. Jag har även några "fula" saker som
när jag löser problemet med att inte kunna radera hela fönstret (läs mer om 
detta i loggen nedan) och att jag behöver använda ett extra textfeild för att 
rita ut allt jag behöver.

Programmet blev bra till slut trots allt. Visst finns det saker som man kunde 
ha gjort bättre t.ex. att även kunna rita trianglar och att få in flera figurer
i samma ewentwindow fönster. Men som helhet så är jag nöjd med programmet.

I Övrigt så saknar jag en modell klass, och detta på grund av att jag hade lite
kod så att det gick lika bra att ha det i GUI:t istället enligt Stefan.

Min comparable fungerar inte. Jag har skrivt som jag tror att det ska vara men 
det blir några fel. Det jag har gjort då är att jag har kommenterat bort all 
comparable kod så att Stefan kan se att jag på ett ungefär vet hur man gör 
en comparable.



LOG
---
- 15/10/2014
Idag har jag förstått mer vad det är jag ska göra, jag har även forkat från
GitHub, för tillfället så finns det inga problem men jag lovar att det kommer 
många snart. Till nästa gång ska jag börja skriva av GeoShapes filarna till 
inlämningsuppgiften.

-17/10/2014
Jag har tid hos läkaren så jag missar lektionen.

-22/10/2014
Jag är hemma på grund av att jag är sjuk och missar lektionen.

-24/10/2014
Idag har jag skrivit på min MainGUI. Jag har även fattat vad klasserna gör. 
problemet är att jag inte riktigt vet vad som ska stå i alla filer och vad 
de ska göra. Till nästa gång ska jag börja skriva på subklasserna 
(rektangel och cirkel).

-5/11/2014
Idag så har jag skrivit på subklasserna och även fått en klarare uppfattning om 
hur jag ska göra i fortsättningen. För tillfället så finns det inga problem. 
Till nästa gång så ska jag fortsätta med subklasserna och börja med att sätta
komponenter på GUI:N.

-12/11/2014
Idag har jag importerat EventWindow och börjat med att fixa utseendet
för mitt GUI. Jag har lagt till en knap. Till nästa gång ska jag 
fortsätta med att fixa klart GUI:t och lägga in resten av komponenterna.

-13/11/2014
Jag har stora problem när jag jobbar hemma, av någon anledning blir en stor del
av koden rött. Eftersom jag inte kan se om jag gör rätt eller inte på
grund av att det inte går att köra programmet så har jag bara lagt till alla 
komponenter jag kommer att behöva. Nästa gång jobbar vi på skolan så det borde
fungera, jag ska då fråga Stefan varför det blir som det blir.

-14/11/2014
Av nån anledning så är det inte rött överallt i skolan och här kan jag importera
saker till skillnad från hemma. Hemma lyser problemen rött och det går inte att
importera. Jag får hoppas på att det fungerar även hemma. Av nån anledning så 
finns inte knapparna och de andra komponenter jag gjort på fönstret när jag kör
programmet. Detta skall fixas nästa gång.

-15/11/2014
Idag har jag fixat så att komponenterna kommer ut på fönstret när programmet
körs. Det jag gjorde var att jag gav komponenterna en storlek och kordinater
så kom de upp. Innan trodde jag att de hade en default size så att de kom upp
utan att jag behövde göra det men så verkar det inte vara. Jag har två problem
för tillfället, det ena är att jag kan radera hela fönstret och det andra är
att en av textfeilden kommer inte upp. Till nästa gång ska detta fixas och ska 
fortsätta skriva på subklasserna.

-16/11/2014
Mitt program är ett steg efter (retarded). Därför skrivs inte den sista 
texfeilden ut. Det är den sista texfeilden som skriver ut den näst sista. 
Jag fattar inte varför men jag har gjort en extra texfeild som 
skriver ut min sista texfeild. Jag vet fortfarande inte varför jag kan radera 
hela programmet. Och idag så kan komponenterna skrivas ut utan att jag anger en 
storlek till skillnad från igår. Jag har skrivit mer på subklasserna och till 
nästa gång ska jag göra färdigt dem.

-19/11/2014
Idag har jag gjort klart subklassen Rektangel och nu fungerar det att köra den
så halva mitt program är klart. Jag har dock problem med subklassen cirkel,
jag har skrivit klart en men den vill inte fungera av någon anledning. Till
nästa gång ska jag få subklassen cirkel att fungera och därmed blir jag klar
med programmet. Jag ska även fixa till koden och försöka fixa så att jag inte
kan ta bort hela fönstret samt att jag inte behöver ha en extra textfield 
till nästa gång.

-20/11/2014
Idag så har jag fixat subklassen cirkel så nu fungerar hela programmet perfekt.
Jag har även fixat så att det inte går att radera hela fönstret. Jag gjorde 
dock detta på ett fult sätt, det är såhär att jag har ett texfeild över hela
fönstret och det enda jag gjorde var att jag satte den set.Enabled(fasle) och
det leder till att man inte kan skriva i den. Enligt Stefan så skulle jag 
använda mig av Gridlayout, jag provade det men fick det inte och fungera.
Till nästa gång så blir det att kommentera koden,fixa klassdiagrammet och göra 
en comparable.

-21/11/2014
Idag har jag kommenterat koden och gjort ett klassdiagram. Jag har även skrivit 
comparable. Den fungerar inte men det är bättre än ingenting.
 