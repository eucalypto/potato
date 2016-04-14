---
layout: post
title: Meld and Dark Gnome
date: '2016-04-07T21:36:10+0200'
author: eucalypto
tags:
- gnome
- dark
- code
---

Meld in Gnome Dark Theme
------------------------

Meld is a nice diff tool; for files and folders. But if you use it in
Gnome with Dark Theme, it is useless.

My workaround is that Meld uses normal Theme instead of Dark theme. For
this you have to edit `/usr/share/applications/meld.desktop`, look
for the line

```
Exec=meld %F
```

and change it to

```
Exec=env GTK_THEME=Adwaita:light meld %F
```

[Apparently][1] `env` is needed.

If you now open meld from menu, it opens with light theme.

[1]: http://unix.stackexchange.com/questions/14129/gtk-enable-set-dark-theme-on-a-per-application-basis


Meld and Git
------------

Unfortunately, you have to separately configure git to open meld with
light theme.

In the command line type

```
git config --global diff.tool 'meld'
git config --global difftool.meld.cmd 'GTK_THEME=Adwaita:light meld $LOCAL $REMOTE'
```

and then open the config file with `git config --global -e` and make
sure that the following lines are in there:

```
[diff]
  tool = meld
[difftool "meld"]
  cmd = "GTK_THEME=Adwaita:light" meld $LOCAL $REMOTE
```

especially the quotation marks. This should do the trick.

[Source1](http://jeetworks.org/setting-up-git-to-use-your-diff-viewer-or-editor-of-choice/)  
[Source2](https://git-scm.com/docs/git-difftool)
