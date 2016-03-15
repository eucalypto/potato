---
layout: post
title: Thinkpad Trackpoint and Linux
date: '2016-03-15T18:23:00+0100'
author: eucalypto
tags:
- linux
---
How to configure the TrackPoint on a Lenovo Thinkpad
====================================================
This [guide][1] shows exacty what you need. Use the "Configuration using xinput".

With
```bash
xinput list-props "TPPS/2 IBM TrackPoint"
```
you can find information about the trackpoint.

Use these commands in a terminal to enable Trackpoint scrolling:
```bash
xinput set-prop "TPPS/2 IBM TrackPoint" "Evdev Wheel Emulation" 1
xinput set-prop "TPPS/2 IBM TrackPoint" "Evdev Wheel Emulation Button" 2
xinput set-prop "TPPS/2 IBM TrackPoint" "Evdev Wheel Emulation Timeout" 200
xinput set-prop "TPPS/2 IBM TrackPoint" "Evdev Wheel Emulation Axes" 6 7 4 5
```

###### CentOS 7

To make these changes permanent, you should write the commands in a
`~/.xsessionrc` file according to the guide. But this file is not loaded
by Centos 7. Instead, I copied the commands to the end of
`/etc/gdm/Init/Default` according to [this question][1].


[1]: http://www.thinkwiki.org/wiki/How_to_configure_the_TrackPoint
[2]: http://unix.stackexchange.com/questions/42611/how-can-i-run-a-script-that-starts-before-my-login-screen
