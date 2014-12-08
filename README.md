Code for 2014-scalaeXchange demo
================================

To make this compile, you'll need a custom branch of the compiler built and locally published.

```
$ git clone git@github.com:folone/scala.git -b scalaexchange
$ cd scala
$ ant publish-local-opt -Dmaven.version.suffix="-typelevel"
```

Now you're ready to check out/build this project.
