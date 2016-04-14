---
layout: post
title: SSH Agent, command line only
date: '2016-04-13T18:23:00+0100'
author: eucalypto
tags:
- ssh
- commandline
- bash
---

SSH-Agend and the Command Line
------------------------------

The SSH-Agent is very useful if you want to use a SSH Certificate to log
in to servers or push/pull in Github, etc. But right now, it
automatically asks for the passphrase for the SSH Key through a
graphical interface; but if you use it through ssh and can't start a
graphical interface, it fails.

Now you have to manually add your key to SSH-Agent with

```
ssh-add ~/.ssh/your-ssh-key
```

But SSH-Agent has to be running at this time. Sometimes you have to
start it manually. A comfortable way to do this was proposed on [this
site][servfault]:

```
ssh-agent /bin/bash
```

With this, you can start ssh-agent in your shell and it is automatically
killed when the current shell is closed. This is ideal for my situation
because I don't want ssh-agent to cache my SSH keys longer than I am
logged in.


[servfault]: http://serverfault.com/questions/593040/ssh-agent-needs-to-start-each-time-on-my-server
