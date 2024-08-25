# Implementering av Kryptering för Säker Hantering av Känslig Information i Java-applikationer med AES (Advanced Encryption Standard) och RSA (Rivest-Shamir-Adleman)

## Innehållsförteckning

1. [Introduktion](#introduktion)
2. [Syfte](#syfte)
3. [Mål](#mål)
4. [Metod](#metod)
5. [Resultat](#resultat)
6. [Slutsats och Diskussion](#slutsats-och-diskussion)
   - [Slutsats](#slutsats)
   - [Diskussion](#diskussion)
7. [Referenser](#referenser)

## Introduktion

Att skydda känslig information är en viktig del av mjukvaruutveckling. Detta skydd måste gälla både överföring och lagring av data över nätverk för att skydda mot risker som obehörig åtkomst och dataintrång. På grund av dessa anledningar är det viktigt att säkerhetsåtgärda applikationer och webbsidor som hanterar känslig information.

Detta arbete beskriver hur kryptering kan implementeras i Java-applikationer för att skydda konfidentiell och känslig data. Genom att utnyttja Java Cryptography Architecture (JCA) kan man tillämpa starka krypteringsalgoritmer som AES och RSA för att säkerställa att information är väl skyddad i system som hanterar känsliga uppgifter.

## Syfte

Syftet med detta examensarbete är att visa hur kryptering kan implementeras för att skydda känslig information i Java-applikationer. Genom att tillämpa krypteringsprinciper strävar man efter att öka säkerheten och reducera risken för att obehöriga får åtkomst till känslig data.

## Mål

1. Implementera kryptering för att skydda lagrad och överförd känslig information och säkerställa att data förblir konfidentiell och integrerad både under lagring och vid överföring över nätverk.
2. Använda starka krypteringsalgoritmer som AES och RSA för att säkerställa konfidentialitet och integritet. 
3. Nyckelhantering, som innefattar generering, lagring och distribution av krypteringsnycklar på ett säkert sätt.
4. Integrera kryptering i nätverkskommunikation för en heltäckande säkerhetslösning.

## Metod

För att uppnå målen används följande metoder:

1. **Studie av Java Cryptography Architecture (JCA):** Utforskning av JCA och dess olika komponenter, inklusive nyckelgenererare, algoritmer och API:er för kryptering och dekryptering.
2. **Val av lämpliga krypteringsalgoritmer:** Välja de mest lämpliga algoritmerna baserat på praktiska tillämpningar; AES för symmetrisk kryptering och RSA för asymmetrisk kryptering.
3. **Implementering av säker hantering av krypteringsnycklar:** Inkluderar generering av starka nycklar och säker lagring och hantering av dessa.
4. **Jämförelse mellan AES och RSA:** Analysera och jämföra säkerhet och hastighet mellan AES och RSA.
5. **Tester och bedömningar:** Genomföra omfattande tester för att verifiera att krypteringen fungerar korrekt och att säkerheten uppfyller krav.

## Resultat

Implementeringen av kryptering i Java-applikationer har varit effektiv för att skydda känslig information. Genom att använda krypteringsalgoritmer som AES och RSA har konfidentialitet och integritet för data säkerställts både vid lagring och överföring. Tester visar att kryptering inte påverkar programmets hastighet märkbart, vilket innebär att säkerheten kan ökas utan att kompromissa med prestanda.

## Slutsats och Diskussion

### Slutsats

Implementering av kryptering är nödvändig för att säkerställa integritet och konfidentialitet hos känslig information i Java-program. Genom att använda lämpliga krypteringsalgoritmer kan säkerheten förbättras avsevärt. Det är dock viktigt att kontinuerligt utvärdera och förbättra säkerhetsmekanismer för att möta nya hot och utmaningar inom säkerhetsområdet.

### Diskussion

Även om utvecklare eller administratörer kan dekryptera data, innebär säkerhet att kontrollera vilka som har tillgång till dekrypteringsnycklarna. Ett säkert system bör innehålla följande:

1. **Åtkomstkontroll:** Endast behöriga personer eller system bör ha tillgång till dekrypteringsnycklarna.
2. **Säker nyckelhantering:** Nycklar bör lagras säkert och åtkomst bör kontrolleras noggrant.
3. **Övervakning och revision:** Aktiviteter relaterade till dekryptering bör övervakas och loggas.
4. **Säker infrastruktur:** System och miljöer där dekryptering sker bör vara säkra mot olika hot.

När det gäller val av krypteringsalgoritm, är AES och RSA bra val för olika ändamål. AES är snabbare och används för att kryptera stora datamängder, medan RSA är mer lämplig för nyckelutbyte och digitala signaturer.

## Referenser

- [Java Cryptography Architecture (JCA) Reference Guide](https://docs.oracle.com/javase/8/docs/technotes/guides/security/crypto/CryptoSpec.html)
- [Java Security Architecture](https://docs.oracle.com/javase/8/docs/technotes/guides/security/overview/jsoverview.html)
- [Encryption Choices: RSA vs. AES Explained](https://www.ssl2buy.com/wiki/rsa-vs-aes-encryption)
- [RSA in Java](https://www.baeldung.com/java-rsa)
- [Java AES Encryption and Decryption](https://www.baeldung.com/java-aes-encryption-decryption)
- [Guide to the Cipher](https://docs.oracle.com/javase/8/docs/api/javax/crypto/Cipher.html)

