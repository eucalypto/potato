---
layout: post
title: Git Tips
date: '2015-04-27T02:36:00.000-07:00'
author: eucalypto
tags:
- git
- code
---

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

[Source](https://help.github.com/articles/changing-a-remote-s-url/)



Make branch track remote branch
-------------------------------
If you create a new branch locally and want to push it to origin, use

```
git push -u origin branch-name
```

to push it and set the local branch to track its remote copy.

If you forgot to do this, you can use

```
git branch -u origin/branch-name
```

to start tracking after a push.

[Source](http://stackoverflow.com/questions/520650/make-an-existing-git-branch-track-a-remote-branch/2286030#2286030)


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

[2]: http://stackoverflow.com/questions/52704/how-do-you-discard-unstaged-changes-in-git


Copy (checkout) files from other branches
-----------------------------------------
sometimes you want to fetch some files from another branch. But you
don't want to check out the whole branch; just copy some files from it.

Git can do this already:

```
git checkout other_branch -- path/to/files/
```

Just use `--` with `git checkout` and it just fetches those files while
staying in the current branch. Sweet!

[Source](http://nicolasgallagher.com/git-checkout-specific-files-from-another-branch/)

Combine (squash) commits
------------------------
If you want to combine the last few commits into one, you can use

```
git reset --soft HEAD~3
```

to go back to the third commit before HEAD. With the `--soft` option,
you keep all files and changes from current working directory.

Now you can commit those changes with one commit!

[Source]( http://stackoverflow.com/questions/5189560/squash-my-last-x-commits-together-using-git/5201642#5201642)
