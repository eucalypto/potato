---
layout: post
title: Einrichtung von Googlemail (IMAP) in Thunderbird 3.1.8
date: '2015-04-27T02:36:00.000-07:00'
author: eucalypto
tags:
- thunderbird
- gmail
modified_time: '2015-04-27T02:36:52.039-07:00'
blogger_orig_url: http://eigentipps.blogspot.com/2015/01/ubuntu-short-tips.html
---
[Source](http://eigentipps.blogspot.de/2011/05/einrichtung-von-googlemail-imap-in.html "Permalink to Einrichtung von Googlemail (IMAP) in Thunderbird 3.1.8")

Einrichtung von Googlemail (IMAP) in Thunderbird 3.1.8
======================================================

 Einrichtung von Googlemail in Thunderbird 3.1.8 unter Ubuntu 10.10  
->File ->New ->Mail Account  
->Daten für Googlemail-Account eingeben  
->Es wird automatisch alles eingestellt: IMAP  
imap.googlemail.com 993 SSL/TLS  
smtp.googlemail.com 465 SSL/TLS

![][1]


Wenn man auf „Benutzerdefinierte Einstellungen…" klickt, dann öffnet
sich das Fenster für die Einstellungen des Kontos.

Bei den „Server-Einstellungen" sind diese Einstellungen von
[Googlemail][2] empfohlen:  

* Beim Starten auf neue Nachrichten prüfen  -  Aktivieren
* Alle 10 Minuten auf neue Nachrichten prüfen  – Aktivieren
* Beim Löschen einer Nachricht -> Als gelöscht markieren  -  Aktivieren
* _Beim Löschen einer Nachricht -> „Verschieben in name@googlemail.com -> [Google Mail] -> Papierkorb_ (Die vorige Einstellung mit „als gelöscht markieren" hat die E-Mails verschwinden lassen, auf jeden Fall sind sie nicht im Papierkorb gelandet. Aber diese neue Einstellung mit dem „manuellen" verschieben in den „richtigen" Papierkorb funktioniert.)
* Bereinigen („Expunge") des Posteingangs beim Verlassen  -  Nicht Aktivieren
* Papierkorb beim Verlassen leeren  -  Nicht Aktivieren ( Googlemail löscht automatisch alle Nachrichten aus dem Papierkorb, die älter als einen Monat sind)

![][3]


Bei „Kopien und Ordner":  

* Eine Kopie speichern unter:  -  Nicht Aktivieren (Googlemail speichert automatisch alle versandten E-Mails im Postausgang von [Google Mail])

![][4]

Bei „Verfassen und Adressieren":  

* Nachrichten im HTML-Format verfassen  –  Nicht Aktivieren
* Originalnachricht beim Antworten automatisch zitieren. Dabei [meine Antwort über dem Zitat beginnen] und meine Signatur…

In der nächsten Seite den Junk-Filter Deaktivieren. ( Googlemail hat
sowieso einen aktivierten Spamfilter, der dann auf deren Servern
arbeitet. So muss Thunderbird diese Arbeit nicht übernehmen.)

Auf der nächsten Seite „Synchronisation und Speicherplatz":

„Nachrichten dieses Kontos auf diesem Computer behalten"  –  Kann
Aktiviert werden. Dabei werden _alle_ Nachrichten des Kontos
heruntergeladen.

Wenn man diese Option deaktiviert, kann man durch klicken auf
„Erweitert…" die Ordner auswählen, die synchronisiert werden sollen.
Dabei werden die E-Mails von diesen Ordnern heruntergeladen und
bereitgehalten. Kann bei vielen großen E-Mails zu großem
Speicherverbrauch führen.

"die E-Mails von diesen Ordnern heruntergeladen und bereitgehalten".
Kann bei vielen großen E-Mails zu großem Speicherverbrauch führen.

Danach schließen dieses Einstellungen-Fensters lässt man Thunderbird das
erste mal die E-Mails abrufen. Dabei werden auch die Ordner (Labels)
synchronisiert.

Jetzt kann man im Einstellungenfenster zum Konto, wieder bei „Kopien und
Ordner" die Einstellungen prüfen:

Entwürfe sollen gespeichert werden in : name@googlemail.com -> [Google
Mail] -> Entwürfe

Und „Archiv speichern unter:" name@googlemail.com -> [Goolge Mail] ->
Alle Nachrichten

Quellen:

Zur IMAP – Synchronisierung und Speicherplatz:  
http://support.mozillamessaging.com/de/kb/IMAP-Synchronisierung

Zur Empfohlenen Einstellung von Googlemail auf Thunderbird 2.0:  
http://mail.google.com/support/bin/answer.py?hl=de&answer=78892#

[1]: http://3.bp.blogspot.com/-oe3SmR2-tzM/TyVmcqmrHQI/AAAAAAAAAME/fTs2aOvVSt8/s640/thunderbirdneueskonto01.jpg
[2]: http://mail.google.com/support/bin/answer.py?hl=de&answer=78892#
[3]: http://4.bp.blogspot.com/-XOfMsUGnimg/TyVmeL4abwI/AAAAAAAAAMU/8l9VVSQvc7E/s640/thunderbirdservereinstellungenempfohlen.jpg
[4]: http://2.bp.blogspot.com/-PRsWDpD2MoA/TyVmcCnFZWI/AAAAAAAAAL4/znOFcPrKq4k/s640/thunderbirdkopienundordner.jpg
