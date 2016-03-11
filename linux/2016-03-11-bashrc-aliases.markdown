# Aliases for command line in .bashrc

In ubuntu the .bashrc file has a command that looks for ~/.bash_aliases
and includes it. Here you find my [.bash_aliases](dot.bash_aliases) file
with useful aliases.

This is the code in the .bashrc file:

```bash
# Alias definitions.
# You may want to put all your additions into a separate file like
# ~/.bash_aliases, instead of adding them here directly.
# See /usr/share/doc/bash-doc/examples in the bash-doc package.

if [ -f ~/.bash_aliases ]; then
    . ~/.bash_aliases
fi
```
