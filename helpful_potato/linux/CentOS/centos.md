---
layout: post
title: CentOs 7
date: '2016-03-15T19:14:32+0100'
author: eucalypto
tags:
- linux
- CentOS
---

Miscellaneous tips for CentOS 7
-------------------------------

###### Git

To have a git server you just have to install `git-daemon`. Now you can
use the computer as git server with ssh.


###### Lighttpd

[Lighttpd] is a light web server. In CentOS its package is in the [EPEL]
repository. After installing this package you can run it with
```bash
sudo systemctl start lighttpd.service
```

CentOS ships with a firewall. We have to [configure][1] it so that our server
is accessible from outside:

```bash
sudo firewall-cmd --permanent --zone=public --add-service=http
sudo firewall-cmd --permanent --zone=public --add-service=https
```

During the installation of Lighttpd, a new user is created: "lighttpd".
This is the same as "www-data" for apache. To find out where the
document root of the server is supposed to be, have a look at
`/etc/passwd`. There you will find the "home" directory of "lighttpd":
`/var/www/lighttpd`.

Now open `/etc/lighttpd/lighttpd.conf` and check if the document
directory is in the right place:

```
var.server_root = "/var/www"
[...]
server.document-root = server_root + "/lighttpd"
```

[1]: http://dokuwiki.nausch.org/doku.php/centos:web_c7:apache_1
[Lighttpd]: http://www.liberiangeek.net/2014/09/install-lighttpd-webserver-centos-7-php5-mariadb-support/
[EPEL]: https://wiki.centos.org/de/AdditionalResources/Repositories/https://wiki.centos.org/de/AdditionalResources/Repositories/

###### Baikal

Baikal is a php based CalDav and CardDav server. It uses SQLite as
database. So you need to make sure the following programs are installed:
- SQLite
- PHP (>5.3)
- Some webserver (e.g. apache `httpd.x86_64` or `lighttpd`)
