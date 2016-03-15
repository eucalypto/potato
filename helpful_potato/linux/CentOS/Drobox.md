---
layout: post
title: Dropbox in CentOs 7
date: '2016-03-15T19:14:32+0100'
author: eucalypto
tags:
- linux
- CentOS
- Dropbox
---

Install Dropbox in CentOS 7
---------------------------

This [website][1] has a nice overview over the installation process.
First, you need to

```bash
sudo yum install libgnome
```

and then download the Dropbox Fedora (.rpm) package from [Dropbox] and
install it with

```bash
sudo rpm -ivh nautilus-dropbox[...].rpm
```

Then you can start Dropbox and log in with your accound details.

[1]: http://computechtips.com/790/install-dropbox-centos-7
[Dropbox]: https://www.dropbox.com/install?os=lnx


Repair package manager yum
--------------------------

If you use yum (e.g `yum update`) after Dropbox installation, you will
probably encounter an error that a certain .xml file could not be found.
This [blog entry][2] describes the problem:

The Package is made for Fedora and Fedora has a different release cycle
than CentOS. But the package repository configuration of Dropbox
(`/etc/yum.repos.d/dropbox.repo`) uses the variable `$releasever`, which
is different for Fedora and CentOS.

To solve this problem you have to replace the line
```bash
baseurl=http://linux.dropbox.com/fedora/$releasever/
```
with
```bash
baseurl=http://linux.dropbox.com/fedora/21/
```

The number `21` is just the newest Fedora version supported by Dropbox.
Yo can look for the current supported versions on [their website][3].



[2]: http://software-engineer.gatsbylee.com/dropbox-yum-update-error-on-centos/
[3]: https://linux.dropbox.com/fedora/



Run Dropbox as a service
------------------------

In order to have Dropbox available right after boot without loggin in,
it has to be declared a service.

[TODO] Find out how?
