I am using the Neo2 keyboard layout designed for German. This layout
was influenced by Dvorak for Enlish.

But I want to change Neo2 a bit. I am using (some variations of)
Ubuntu. So I copied the file /usr/share/X11/xkb/symbols/de to this
folder.

After I make my changes I want to replace my custom "de" file with the
real one.

The image neo_Ebene_4.svg I got from
http://neo-layout.org/grafik/tastatur2d/


I managed to change the right changes in the "de" file. It was a bit
cumbersome but it worked. I copied the "de" file back to
/usr/share/X11/xkb/symbols/ with sudo privileges. Then according to
https://help.ubuntu.com/community/Custom%20keyboard%20layout%20definitions
I deleted the *.xkm files in /var/lib/xkb/

Then after a logout and login it worked! And it still works after a
reboot.
