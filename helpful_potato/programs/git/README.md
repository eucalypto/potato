---
layout: post
title: Git tips
date: '2015-04-27T02:36:00.000-07:00'
author: eucalypto
tags:
- git
- code
---
[Source](http://eigentipps.blogspot.de/2015/04/git-tips.html "Permalink to Eigentipps: Git tips")

Git tips
========

If you work with any kind of text files, a version control program is
your best friend. And Git is probably the best.

The easiest way to learn git is this [tutorial](https://try.github.io).
All other git commands you will learn by googling for them when in need.

If you want to share your code in an open source way,
[Github](https://github.com/) is nowadays the top choice. They also
helped with the tutorial above.


Change the url (path) of origin
-------------------------------

With  
```bash
git remote -v
```

you can check what the current url (path) to your remotes are. Now to
change (update) the url just use  

```bash
git remote set-url origin https://new.git.repo.url
```

Source: [github][1]

Recover lost files (discard changes)
------------------------------------

The more I use git the more I love it! One of the nicest features of git
is that you can undo changes -- including deletion of files. I wanted to
remove some files and accidentally typed: `rm something *`, whereas I
wanted `rm something*`. But of course bash didn't know that and merrily
deleted everything in my directory (except a folder).

But as always, git saves the day. With  

```bash
git checkout -- /path/to/file
```

you can discard any changes on this file. Including deletion.

If you want to do this for every file in the current directory, type:  

```bash
git checkout -- .
```

The dot is important.

Source: [stackoverflow][2]

[1]: https://help.github.com/articles/changing-a-remote-s-url/
[2]: http://stackoverflow.com/questions/52704/how-do-you-discard-unstaged-changes-in-git
