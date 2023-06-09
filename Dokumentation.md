# Projektrapport: TDD & Mock - WeatherService

### Ert namn
Ellen Halvardsson

### Beskrivning av projektet
Jag har gjort en enkel facad för en applikation som hämtar väderdata från en mock av ett väderservice API.

## Arbetet och dess genomförande
Jag började med att skapa klasserna som behövdes och metoder som behövdes i facaden samt API-klassen. Sen skrev jag tester för test-klassen som hanterar olika scenarion. Jag skrev tester för att se att facaden fungerade som den skulle och att metoderna returnerade rätt värden. Jag skrev även ett test för att se att facaden hanterade felaktiga värden på rätt sätt.

### Vad som varit svårt
Det svåraste var att få till det med Mockito då jag inte använt det tidigare.

### Beskriv lite olika lösningar du gjort
Jag har skapat en facad som kommunicerar mellan API-klassen och test-klassen. Facaden har metoder som hämtar data från API-klassen och det är dessa metoder som testas i test-klassen.

### Beskriv något som var besvärligt att få till
Det var besvärligt att få till det med Mockito då jag inte använt det tidigare och själva tänkadet kring det var en utmaning.

### Beskriv om du fått byta lösning och varför i sådana fall
Jag fick tänka om ett par gånger när jag skrev @BeforeEach setUp() metoden i test-klassen. Till en början hade jag deklarerat mina when-satser inuti varje test-metod, men med goda råd från min lärare Marcus flyttade jag över dom till @BeforeEach setUp() och kunde då testa för fler värden (innan kunde jag endast testa med assertNull).

## Slutsatser
Det var ett lärorikt projekt och jag har bättre förståelse för Mockito, hur man mockar api-klasser och hur man testar facader.

### Vad gick bra
Testerna gick bra och jag fick till det med Mockito.

### Vad gick dåligt
Jag hade lite problem med att få till det med Mockito då jag inte använt det tidigare.

### Vad har du lärt dig
Jag har lärt mig om hur man kan använda Mockito och mer om hur annotations fungerar.

### Vad hade ni gjort annorlunda om ni gjort om projektet
Jag hade förmodligen gått igenom grunderna i Mockito mer innan jag började med projektet. Men ibland får man kasta sig ut i det och lära sig på vägen.

### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Jag ser möjligheter att kunna skriva bättre tester och att kunna använda Mockito i framtida projekt.